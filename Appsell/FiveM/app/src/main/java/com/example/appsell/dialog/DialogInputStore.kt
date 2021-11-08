package com.example.appsell.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.EditText
import android.widget.TextView
import com.example.appsell.R
import com.example.appsell.model.LocationStore
import android.view.Gravity
import android.widget.Toast

class DialogInputStore(context: Context) : Dialog(context) {

    var lat = 0.0
    var long = 0.0

    private var editTextLat: EditText? = null
    private var editTextLong: EditText? = null
    private var buttonAdd: TextView? = null
    private var buttonCancel: TextView? = null

    private var listener: OnOKClickedListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_input_store)
        window!!.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        window!!.attributes.windowAnimations = R.style.DialogBotToTopAnim
        setCancelable(false)

        editTextLat = findViewById(R.id.editTextLatitude)
        editTextLong = findViewById(R.id.editTextLongitude)
        buttonAdd = findViewById(R.id.buttonAdd)
        buttonCancel = findViewById(R.id.buttonCancel)

        buttonCancel?.setOnClickListener { dismiss() }

        buttonAdd?.setOnClickListener {

            when {
                editTextLat?.text.isNullOrEmpty() || editTextLat?.text.toString()
                    .toFloat() == 0f -> {
                    showToast("Please input latitude...")
                }
                editTextLong?.text.isNullOrEmpty() || editTextLong?.text.toString()
                    .toFloat() == 0f -> {
                    showToast("Please input longitude...")
                }
                else -> {
                    lat = editTextLat?.text.toString().toDouble()
                    long = editTextLong?.text.toString().toDouble()
                    val location = LocationStore(lat, long, "")
                    listener?.onClickListener(location)
                }
            }
        }
    }

    fun close() {dismiss()}

    private fun showToast(content: String) {
        val toast = Toast.makeText(context, content, Toast.LENGTH_LONG)
        toast.view?.setBackgroundColor(Color.parseColor("#007AFF"))
        toast.setGravity(Gravity.TOP or Gravity.FILL_HORIZONTAL, 0, 0)
        toast.show()
    }

    fun onCallbackClicked(listener: OnOKClickedListener) {
        this.listener = listener
    }

    interface OnOKClickedListener {
        fun onClickListener(location: LocationStore)
    }
}