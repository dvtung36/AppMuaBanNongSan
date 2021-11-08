package com.example.appsell.view

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.appsell.R
import com.example.appsell.base.Until
import com.example.appsell.dialog.DialogInputStore
import com.example.appsell.model.LocationStore
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_map.*

class MapFragment : Fragment(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    val database: FirebaseDatabase = FirebaseDatabase.getInstance()
    val reference: DatabaseReference = database.reference

    val locations = ArrayList<LocationStore>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    @SuppressLint("RestrictedApi")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupMap()
        getStore()

        if (!arguments?.getBoolean(MANAGER)!!) {
            buttonAddStore?.visibility = View.GONE
        }

        buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }

        buttonAddStore.setOnClickListener {
            addStore()
        }
    }

    private fun addStore() {
        val dialog = DialogInputStore(requireContext())
        dialog.window?.requestFeature(Window.FEATURE_NO_TITLE)
        dialog.show()
        dialog.onCallbackClicked(object : DialogInputStore.OnOKClickedListener{
            override fun onClickListener(location: LocationStore) {
                var key = database.reference.push().key!!
                reference.child("location_stores").child(key)
                    .setValue(location)
                    .addOnSuccessListener {
                        Until.message("Successful add store", requireActivity())
                        Until.hideLoading()
                        dialog.close()
                        key = database.reference.push().key!!
                        mMap.addMarker(MarkerOptions().position(LatLng(location.latitude, location.longitude)).title(location.title))
                    }
                    .addOnFailureListener {
                        Until.message(
                            it.message ?: "System error please try again",
                            requireActivity()
                        )
                        Until.hideLoading()
                    }
            }
        })
    }

    private fun getStore() {
        val stores = Firebase.database.reference.child("location_stores")
        stores.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                locations.clear()
                for (postSnapshot in snapshot.children) {
                    val item: LocationStore? = postSnapshot.getValue(LocationStore::class.java)
                    item?.let {
                        locations.add(it)
                    }
                }
                setupMap()
            }
            override fun onCancelled(error: DatabaseError) {

            }

        })
    }

    private fun setupMap() {
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        locations.forEach { location ->
            mMap.addMarker(MarkerOptions().position(LatLng(location.latitude, location.longitude)).title(location.title))
        }
        mMap.moveCamera(
            CameraUpdateFactory.newLatLngZoom(
                LatLng(16.259097, 105.588642),
                5.8.toFloat()
            )
        )
//        mMap.setOnCameraMoveStartedListener(this)
    }
//
//    override fun onCameraMoveStarted(reason: Int) {
//        when (reason) {
//            GoogleMap.OnCameraMoveStartedListener.REASON_GESTURE -> {
//                container.requestDisallowInterceptTouchEvent(true);
//            }
//            GoogleMap.OnCameraMoveStartedListener
//                .REASON_API_ANIMATION -> {
//                container.requestDisallowInterceptTouchEvent(true);
//            }
//            GoogleMap.OnCameraMoveStartedListener
//                .REASON_DEVELOPER_ANIMATION -> {
//                container.requestDisallowInterceptTouchEvent(true);
//            }
//        }
//    }

    companion object {
        const val MANAGER: String = "manager"
    }
}