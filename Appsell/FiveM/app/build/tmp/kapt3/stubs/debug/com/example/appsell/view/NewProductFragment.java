package com.example.appsell.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0017J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020)2\b\b\u0001\u00102\u001a\u000203H\u0003J\b\u00104\u001a\u00020\"H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/example/appsell/view/NewProductFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/appsell/adapter/ImageProductAdapter;", "path", "", "paths", "Ljava/util/ArrayList;", "product", "Lcom/example/appsell/model/Product;", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "getStorage", "()Lcom/google/firebase/storage/FirebaseStorage;", "setStorage", "(Lcom/google/firebase/storage/FirebaseStorage;)V", "storageReference", "Lcom/google/firebase/storage/StorageReference;", "getStorageReference", "()Lcom/google/firebase/storage/StorageReference;", "setStorageReference", "(Lcom/google/firebase/storage/StorageReference;)V", "type", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "uris", "chooseImage", "", "createProduct", "getFile", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showMenu", "v", "menuRes", "", "uploadImage", "app_debug"})
public final class NewProductFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.storage.FirebaseStorage storage;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.storage.StorageReference storageReference;
    private com.example.appsell.model.Product product;
    private java.lang.String type = "vegetable";
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> startForResult;
    public android.net.Uri uri;
    private java.lang.String path = "";
    private java.util.ArrayList<java.lang.String> paths;
    private java.util.ArrayList<android.net.Uri> uris;
    private com.example.appsell.adapter.ImageProductAdapter adapter;
    private java.util.HashMap _$_findViewCache;
    
    public NewProductFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.storage.FirebaseStorage getStorage() {
        return null;
    }
    
    public final void setStorage(@org.jetbrains.annotations.Nullable()
    com.google.firebase.storage.FirebaseStorage p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.storage.StorageReference getStorageReference() {
        return null;
    }
    
    public final void setStorageReference(@org.jetbrains.annotations.Nullable()
    com.google.firebase.storage.StorageReference p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getUri() {
        return null;
    }
    
    public final void setUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void createProduct() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showMenu(android.view.View v, @androidx.annotation.MenuRes()
    int menuRes) {
    }
    
    private final void uploadImage() {
    }
    
    private final java.lang.String getFile(android.net.Uri uri) {
        return null;
    }
    
    private final void chooseImage() {
    }
}