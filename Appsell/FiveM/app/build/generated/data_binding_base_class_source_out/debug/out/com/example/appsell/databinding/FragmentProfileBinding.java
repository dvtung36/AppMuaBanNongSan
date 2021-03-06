// Generated by view binder compiler. Do not edit!
package com.example.appsell.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.appsell.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final EditText edtAddress;

  @NonNull
  public final EditText edtDate;

  @NonNull
  public final EditText edtFullName;

  @NonNull
  public final EditText edtPhone;

  @NonNull
  public final CircleImageView imageAvatar;

  @NonNull
  public final FrameLayout layoutAvatar;

  @NonNull
  public final ConstraintLayout layoutHeader;

  @NonNull
  public final TextView txtCreate;

  private FragmentProfileBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView btnBack,
      @NonNull EditText edtAddress, @NonNull EditText edtDate, @NonNull EditText edtFullName,
      @NonNull EditText edtPhone, @NonNull CircleImageView imageAvatar,
      @NonNull FrameLayout layoutAvatar, @NonNull ConstraintLayout layoutHeader,
      @NonNull TextView txtCreate) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.edtAddress = edtAddress;
    this.edtDate = edtDate;
    this.edtFullName = edtFullName;
    this.edtPhone = edtPhone;
    this.imageAvatar = imageAvatar;
    this.layoutAvatar = layoutAvatar;
    this.layoutHeader = layoutHeader;
    this.txtCreate = txtCreate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_back;
      ImageView btnBack = rootView.findViewById(id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.edt_address;
      EditText edtAddress = rootView.findViewById(id);
      if (edtAddress == null) {
        break missingId;
      }

      id = R.id.edt_date;
      EditText edtDate = rootView.findViewById(id);
      if (edtDate == null) {
        break missingId;
      }

      id = R.id.edt_full_name;
      EditText edtFullName = rootView.findViewById(id);
      if (edtFullName == null) {
        break missingId;
      }

      id = R.id.edt_phone;
      EditText edtPhone = rootView.findViewById(id);
      if (edtPhone == null) {
        break missingId;
      }

      id = R.id.imageAvatar;
      CircleImageView imageAvatar = rootView.findViewById(id);
      if (imageAvatar == null) {
        break missingId;
      }

      id = R.id.layoutAvatar;
      FrameLayout layoutAvatar = rootView.findViewById(id);
      if (layoutAvatar == null) {
        break missingId;
      }

      id = R.id.layout_header;
      ConstraintLayout layoutHeader = rootView.findViewById(id);
      if (layoutHeader == null) {
        break missingId;
      }

      id = R.id.txt_create;
      TextView txtCreate = rootView.findViewById(id);
      if (txtCreate == null) {
        break missingId;
      }

      return new FragmentProfileBinding((ConstraintLayout) rootView, btnBack, edtAddress, edtDate,
          edtFullName, edtPhone, imageAvatar, layoutAvatar, layoutHeader, txtCreate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
