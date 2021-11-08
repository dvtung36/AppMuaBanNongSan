package com.example.appsell.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\b\u0010\u000f\u001a\u00020\u001cH\u0003R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\'"}, d2 = {"Lcom/example/appsell/view/CartFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/appsell/adapter/ProductAdapter;", "getAdapter", "()Lcom/example/appsell/adapter/ProductAdapter;", "setAdapter", "(Lcom/example/appsell/adapter/ProductAdapter;)V", "profile", "Lcom/example/appsell/model/Profile;", "getProfile", "()Lcom/example/appsell/model/Profile;", "setProfile", "(Lcom/example/appsell/model/Profile;)V", "totalCost", "", "getTotalCost", "()I", "setTotalCost", "(I)V", "viewModel", "Lcom/example/appsell/viewmodel/MainViewModel;", "getViewModel", "()Lcom/example/appsell/viewmodel/MainViewModel;", "setViewModel", "(Lcom/example/appsell/viewmodel/MainViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "app_debug"})
public final class CartFragment extends androidx.fragment.app.Fragment {
    public com.example.appsell.viewmodel.MainViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private com.example.appsell.model.Profile profile;
    public com.example.appsell.adapter.ProductAdapter adapter;
    private int totalCost = 0;
    private java.util.HashMap _$_findViewCache;
    
    public CartFragment() {
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
    public final com.example.appsell.model.Profile getProfile() {
        return null;
    }
    
    public final void setProfile(@org.jetbrains.annotations.NotNull()
    com.example.appsell.model.Profile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appsell.adapter.ProductAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.appsell.adapter.ProductAdapter p0) {
    }
    
    public final int getTotalCost() {
        return 0;
    }
    
    public final void setTotalCost(int p0) {
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
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void totalCost() {
    }
}