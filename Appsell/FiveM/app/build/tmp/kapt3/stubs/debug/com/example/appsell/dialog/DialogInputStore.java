package com.example.appsell.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/example/appsell/dialog/DialogInputStore;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buttonAdd", "Landroid/widget/TextView;", "buttonCancel", "editTextLat", "Landroid/widget/EditText;", "editTextLong", "lat", "", "getLat", "()D", "setLat", "(D)V", "listener", "Lcom/example/appsell/dialog/DialogInputStore$OnOKClickedListener;", "long", "getLong", "setLong", "close", "", "onCallbackClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showToast", "content", "", "OnOKClickedListener", "app_debug"})
public final class DialogInputStore extends android.app.Dialog {
    private double lat = 0.0;
    private android.widget.EditText editTextLat;
    private android.widget.EditText editTextLong;
    private android.widget.TextView buttonAdd;
    private android.widget.TextView buttonCancel;
    private com.example.appsell.dialog.DialogInputStore.OnOKClickedListener listener;
    
    public DialogInputStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final double getLat() {
        return 0.0;
    }
    
    public final void setLat(double p0) {
    }
    
    public final double getLong() {
        return 0.0;
    }
    
    public final void setLong(double p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void close() {
    }
    
    private final void showToast(java.lang.String content) {
    }
    
    public final void onCallbackClicked(@org.jetbrains.annotations.NotNull()
    com.example.appsell.dialog.DialogInputStore.OnOKClickedListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/appsell/dialog/DialogInputStore$OnOKClickedListener;", "", "onClickListener", "", "location", "Lcom/example/appsell/model/LocationStore;", "app_debug"})
    public static abstract interface OnOKClickedListener {
        
        public abstract void onClickListener(@org.jetbrains.annotations.NotNull()
        com.example.appsell.model.LocationStore location);
    }
}