package com.example.appsell.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0015\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0010R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/appsell/base/Until;", "", "()V", "dialog", "Landroid/app/Dialog;", "formatDate", "", "time", "", "formatNumber", "number", "(Ljava/lang/Long;)Ljava/lang/String;", "hideLoading", "", "message", "activity", "Landroid/app/Activity;", "showHidePassword", "isShowPassword", "", "edtInput", "Landroid/widget/EditText;", "imgShowHide", "Landroid/widget/ImageView;", "showLoading", "requireActivity", "app_debug"})
public final class Until {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appsell.base.Until INSTANCE = null;
    private static android.app.Dialog dialog;
    
    private Until() {
        super();
    }
    
    public final void showHidePassword(boolean isShowPassword, @org.jetbrains.annotations.NotNull()
    android.widget.EditText edtInput, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgShowHide) {
    }
    
    public final void message(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDate(long time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatNumber(@org.jetbrains.annotations.Nullable()
    java.lang.Long number) {
        return null;
    }
    
    public final void showLoading(@org.jetbrains.annotations.NotNull()
    android.app.Activity requireActivity) {
    }
    
    public final void hideLoading() {
    }
}