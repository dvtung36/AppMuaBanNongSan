package com.example.appsell.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\u0012\u0010\"\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010-\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u001fH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006/"}, d2 = {"Lcom/example/appsell/view/ProfileFragment;", "Landroidx/fragment/app/Fragment;", "()V", "isManager", "", "()Z", "setManager", "(Z)V", "path", "", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "getStorage", "()Lcom/google/firebase/storage/FirebaseStorage;", "setStorage", "(Lcom/google/firebase/storage/FirebaseStorage;)V", "storageReference", "Lcom/google/firebase/storage/StorageReference;", "getStorageReference", "()Lcom/google/firebase/storage/StorageReference;", "setStorageReference", "(Lcom/google/firebase/storage/StorageReference;)V", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "chooseImage", "", "getFile", "getProfile", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "updateProfile", "uploadImage", "app_debug"})
public final class ProfileFragment extends androidx.fragment.app.Fragment {
    private boolean isManager = false;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.storage.FirebaseStorage storage;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.storage.StorageReference storageReference;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> startForResult;
    public android.net.Uri uri;
    private java.lang.String path = "";
    private java.util.HashMap _$_findViewCache;
    
    public ProfileFragment() {
        super();
    }
    
    public final boolean isManager() {
        return false;
    }
    
    public final void setManager(boolean p0) {
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
    
    private final void updateProfile() {
    }
    
    private final void getProfile() {
    }
    
    private final void uploadImage() {
    }
    
    private final java.lang.String getFile(android.net.Uri uri) {
        return null;
    }
    
    private final void chooseImage() {
    }
}