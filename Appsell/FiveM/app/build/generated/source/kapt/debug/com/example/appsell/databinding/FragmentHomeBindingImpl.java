package com.example.appsell.databinding;
import com.example.appsell.R;
import com.example.appsell.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_header, 1);
        sViewsWithIds.put(R.id.txt_hello, 2);
        sViewsWithIds.put(R.id.txt_user_name, 3);
        sViewsWithIds.put(R.id.btn_avatar, 4);
        sViewsWithIds.put(R.id.slider, 5);
        sViewsWithIds.put(R.id.imageSlider, 6);
        sViewsWithIds.put(R.id.view_main, 7);
        sViewsWithIds.put(R.id.lytListProduct, 8);
        sViewsWithIds.put(R.id.btn_list_product, 9);
        sViewsWithIds.put(R.id.lytProfile, 10);
        sViewsWithIds.put(R.id.btnOpenProfile, 11);
        sViewsWithIds.put(R.id.lyStore, 12);
        sViewsWithIds.put(R.id.btnOpenStore, 13);
        sViewsWithIds.put(R.id.lytLogout, 14);
        sViewsWithIds.put(R.id.btn_logout, 15);
        sViewsWithIds.put(R.id.lytCart, 16);
        sViewsWithIds.put(R.id.btnOpenCart, 17);
        sViewsWithIds.put(R.id.lytOrderManager, 18);
        sViewsWithIds.put(R.id.btnOpeOrderManager, 19);
        sViewsWithIds.put(R.id.lytNewProduct, 20);
        sViewsWithIds.put(R.id.btn_new_product, 21);
        sViewsWithIds.put(R.id.call, 22);
        sViewsWithIds.put(R.id.btn_call, 23);
        sViewsWithIds.put(R.id.img_call, 24);
        sViewsWithIds.put(R.id.view_call, 25);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[23]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[13]
            , (com.google.android.material.card.MaterialCardView) bindings[22]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (com.smarteist.autoimageslider.SliderView) bindings[6]
            , (android.widget.ImageView) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[12]
            , (com.google.android.material.card.MaterialCardView) bindings[16]
            , (com.google.android.material.card.MaterialCardView) bindings[8]
            , (com.google.android.material.card.MaterialCardView) bindings[14]
            , (com.google.android.material.card.MaterialCardView) bindings[20]
            , (com.google.android.material.card.MaterialCardView) bindings[18]
            , (com.google.android.material.card.MaterialCardView) bindings[10]
            , (com.google.android.material.card.MaterialCardView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[25]
            , (android.widget.LinearLayout) bindings[7]
            );
        this.container.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}