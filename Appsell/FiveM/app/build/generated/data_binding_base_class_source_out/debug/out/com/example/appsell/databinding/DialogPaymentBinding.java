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

public final class DialogPaymentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatRadioButton btnCash;

  @NonNull
  public final ImageView btnClose;

  @NonNull
  public final AppCompatRadioButton btnDelivery;

  @NonNull
  public final AppCompatRadioButton btnTransfer;

  @NonNull
  public final TextView title;

  @NonNull
  public final TextView txtPaymentSuccess;

  private DialogPaymentBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatRadioButton btnCash, @NonNull ImageView btnClose,
      @NonNull AppCompatRadioButton btnDelivery, @NonNull AppCompatRadioButton btnTransfer,
      @NonNull TextView title, @NonNull TextView txtPaymentSuccess) {
    this.rootView = rootView;
    this.btnCash = btnCash;
    this.btnClose = btnClose;
    this.btnDelivery = btnDelivery;
    this.btnTransfer = btnTransfer;
    this.title = title;
    this.txtPaymentSuccess = txtPaymentSuccess;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogPaymentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogPaymentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_payment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogPaymentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCash;
      AppCompatRadioButton btnCash = rootView.findViewById(id);
      if (btnCash == null) {
        break missingId;
      }

      id = R.id.btnClose;
      ImageView btnClose = rootView.findViewById(id);
      if (btnClose == null) {
        break missingId;
      }

      id = R.id.btnDelivery;
      AppCompatRadioButton btnDelivery = rootView.findViewById(id);
      if (btnDelivery == null) {
        break missingId;
      }

      id = R.id.btnTransfer;
      AppCompatRadioButton btnTransfer = rootView.findViewById(id);
      if (btnTransfer == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      id = R.id.txtPaymentSuccess;
      TextView txtPaymentSuccess = rootView.findViewById(id);
      if (txtPaymentSuccess == null) {
        break missingId;
      }

      return new DialogPaymentBinding((ConstraintLayout) rootView, btnCash, btnClose, btnDelivery,
          btnTransfer, title, txtPaymentSuccess);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
