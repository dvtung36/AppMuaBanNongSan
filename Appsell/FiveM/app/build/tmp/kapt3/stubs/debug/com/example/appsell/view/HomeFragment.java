package com.example.appsell.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J$\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010(\u001a\u00020\u001cH\u0016J\u001a\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006,"}, d2 = {"Lcom/example/appsell/view/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/appsell/adapter/SliderAdapter;", "getAdapter", "()Lcom/example/appsell/adapter/SliderAdapter;", "setAdapter", "(Lcom/example/appsell/adapter/SliderAdapter;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "isManager", "", "sliderItems", "Ljava/util/ArrayList;", "Lcom/example/appsell/model/SliderItem;", "Lkotlin/collections/ArrayList;", "viewModel", "Lcom/example/appsell/viewmodel/MainViewModel;", "getViewModel", "()Lcom/example/appsell/viewmodel/MainViewModel;", "setViewModel", "(Lcom/example/appsell/viewmodel/MainViewModel;)V", "getUserProfile", "", "makeCall", "number", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewCreated", "view", "Companion", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    public com.example.appsell.viewmodel.MainViewModel viewModel;
    private boolean isManager = false;
    public com.example.appsell.adapter.SliderAdapter adapter;
    private final java.util.ArrayList<com.example.appsell.model.SliderItem> sliderItems = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appsell.view.HomeFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MANAGER = "is_manager";
    private java.util.HashMap _$_findViewCache;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appsell.viewmodel.MainViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.appsell.viewmodel.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appsell.adapter.SliderAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.appsell.adapter.SliderAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    private final void makeCall(java.lang.String number) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void getUserProfile() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/appsell/view/HomeFragment$Companion;", "", "()V", "MANAGER", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}