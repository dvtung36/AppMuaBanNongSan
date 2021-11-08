// Generated by view binder compiler. Do not edit!
package com.example.appsell.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.appsell.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogManagerHandleProductBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatRadioButton btnAcceptPayment;

  @NonNull
  public final AppCompatRadioButton btnCancelPayment;

  @NonNull
  public final ImageView btnClose;

  @NonNull
  public final TextView title;

  @NonNull
  public final TextView txtHandle;

  private DialogManagerHandleProductBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatRadioButton btnAcceptPayment,
      @NonNull AppCompatRadioButton btnCancelPayment, @NonNull ImageView btnClose,
      @NonNull TextView title, @NonNull TextView txtHandle) {
    this.rootView = rootView;
    this.btnAcceptPayment = btnAcceptPayment;
    this.btnCancelPayment = btnCancelPayment;
    this.btnClose = btnClose;
    this.title = title;
    this.txtHandle = txtHandle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogManagerHandleProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogManagerHandleProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_manager_handle_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogManagerHandleProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_accept_payment;
      AppCompatRadioButton btnAcceptPayment = rootView.findViewById(id);
      if (btnAcceptPayment == null) {
        break missingId;
      }

      id = R.id.btn_cancel_payment;
      AppCompatRadioButton btnCancelPayment = rootView.findViewById(id);
      if (btnCancelPayment == null) {
        break missingId;
      }

      id = R.id.btnClose;
      ImageView btnClose = rootView.findViewById(id);
      if (btnClose == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      id = R.id.txtHandle;
      TextView txtHandle = rootView.findViewById(id);
      if (txtHandle == null) {
        break missingId;
      }

      return new DialogManagerHandleProductBinding((ConstraintLayout) rootView, btnAcceptPayment,
          btnCancelPayment, btnClose, title, txtHandle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
