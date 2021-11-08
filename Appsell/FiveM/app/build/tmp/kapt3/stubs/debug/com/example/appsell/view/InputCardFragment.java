package com.example.appsell.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 82\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\'H\u0002J\u0012\u0010(\u001a\u00020\'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u00101\u001a\u00020\'2\u0006\u00102\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J \u00103\u001a\u00020\'2\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u0002050\u0004j\b\u0012\u0004\u0012\u000205`6H\u0002J\b\u0010\b\u001a\u00020\'H\u0002J\b\u00107\u001a\u00020\'H\u0003J\b\u0010\u0015\u001a\u00020\'H\u0003R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00069"}, d2 = {"Lcom/example/appsell/view/InputCardFragment;", "Landroidx/fragment/app/Fragment;", "()V", "bankList", "Ljava/util/ArrayList;", "Lcom/example/appsell/model/BankModel;", "getBankList", "()Ljava/util/ArrayList;", "setBankList", "(Ljava/util/ArrayList;)V", "isOnline", "", "()Z", "setOnline", "(Z)V", "profile", "Lcom/example/appsell/model/Profile;", "getProfile", "()Lcom/example/appsell/model/Profile;", "setProfile", "(Lcom/example/appsell/model/Profile;)V", "totalCost", "", "getTotalCost", "()I", "setTotalCost", "(I)V", "typePayment", "", "getTypePayment", "()Ljava/lang/String;", "setTypePayment", "(Ljava/lang/String;)V", "viewModel", "Lcom/example/appsell/viewmodel/MainViewModel;", "getViewModel", "()Lcom/example/appsell/viewmodel/MainViewModel;", "setViewModel", "(Lcom/example/appsell/viewmodel/MainViewModel;)V", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "payment", "orders", "Lcom/example/appsell/model/Order;", "Lkotlin/collections/ArrayList;", "setButtonBackground", "Companion", "app_debug"})
public final class InputCardFragment extends androidx.fragment.app.Fragment {
    public com.example.appsell.viewmodel.MainViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private com.example.appsell.model.Profile profile;
    private int totalCost = 0;
    private boolean isOnline = true;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.appsell.model.BankModel> bankList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String typePayment = "payment_cash";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appsell.view.InputCardFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMAIL = "EMAIL";
    private java.util.HashMap _$_findViewCache;
    
    public InputCardFragment() {
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
    
    public final int getTotalCost() {
        return 0;
    }
    
    public final void setTotalCost(int p0) {
    }
    
    public final boolean isOnline() {
        return false;
    }
    
    public final void setOnline(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.appsell.model.BankModel> getBankList() {
        return null;
    }
    
    public final void setBankList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.appsell.model.BankModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypePayment() {
        return null;
    }
    
    public final void setTypePayment(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    private final void setButtonBackground() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void totalCost() {
    }
    
    private final void payment(java.util.ArrayList<com.example.appsell.model.Order> orders) {
    }
    
    private final void getProfile() {
    }
    
    private final void setBankList() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/appsell/view/InputCardFragment$Companion;", "", "()V", "EMAIL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}