package com.example.appsell.databinding;
import com.example.appsell.R;
import com.example.appsell.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_header, 1);
        sViewsWithIds.put(R.id.btn_back, 2);
        sViewsWithIds.put(R.id.txt_email_title, 3);
        sViewsWithIds.put(R.id.layout_input_email, 4);
        sViewsWithIds.put(R.id.edt_email, 5);
        sViewsWithIds.put(R.id.txt_user_name_title, 6);
        sViewsWithIds.put(R.id.layout_user_name, 7);
        sViewsWithIds.put(R.id.edt_user_name, 8);
        sViewsWithIds.put(R.id.txt_birth_day_title, 9);
        sViewsWithIds.put(R.id.layout_birth_day, 10);
        sViewsWithIds.put(R.id.edt_birth_day, 11);
        sViewsWithIds.put(R.id.txt_address_title, 12);
        sViewsWithIds.put(R.id.layout_address, 13);
        sViewsWithIds.put(R.id.edt_address, 14);
        sViewsWithIds.put(R.id.txt_phone_title, 15);
        sViewsWithIds.put(R.id.layout_phone, 16);
        sViewsWithIds.put(R.id.edt_phone, 17);
        sViewsWithIds.put(R.id.txt_password_title, 18);
        sViewsWithIds.put(R.id.layout_input_password, 19);
        sViewsWithIds.put(R.id.edt_password, 20);
        sViewsWithIds.put(R.id.img_eye_register, 21);
        sViewsWithIds.put(R.id.txt_password_again_title, 22);
        sViewsWithIds.put(R.id.layout_input_password_again, 23);
        sViewsWithIds.put(R.id.edt_password_again, 24);
        sViewsWithIds.put(R.id.img_eye_again, 25);
        sViewsWithIds.put(R.id.txt_register, 26);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[20]
            , (android.widget.EditText) bindings[24]
            , (android.widget.EditText) bindings[17]
            , (android.widget.EditText) bindings[8]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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