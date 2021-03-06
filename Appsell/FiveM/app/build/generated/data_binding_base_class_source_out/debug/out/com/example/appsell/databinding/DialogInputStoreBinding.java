// Generated by data binding compiler. Do not edit!
package com.example.appsell.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.appsell.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogInputStoreBinding extends ViewDataBinding {
  @NonNull
  public final TextView buttonAdd;

  @NonNull
  public final TextView buttonCancel;

  @NonNull
  public final EditText editTextLatitude;

  @NonNull
  public final EditText editTextLongitude;

  protected DialogInputStoreBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView buttonAdd, TextView buttonCancel, EditText editTextLatitude,
      EditText editTextLongitude) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonAdd = buttonAdd;
    this.buttonCancel = buttonCancel;
    this.editTextLatitude = editTextLatitude;
    this.editTextLongitude = editTextLongitude;
  }

  @NonNull
  public static DialogInputStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_input_store, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogInputStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogInputStoreBinding>inflateInternal(inflater, R.layout.dialog_input_store, root, attachToRoot, component);
  }

  @NonNull
  public static DialogInputStoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_input_store, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogInputStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogInputStoreBinding>inflateInternal(inflater, R.layout.dialog_input_store, null, false, component);
  }

  public static DialogInputStoreBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static DialogInputStoreBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogInputStoreBinding)bind(component, view, R.layout.dialog_input_store);
  }
}
