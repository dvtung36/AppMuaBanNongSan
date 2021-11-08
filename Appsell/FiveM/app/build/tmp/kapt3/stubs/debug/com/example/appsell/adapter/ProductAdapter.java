package com.example.appsell.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\'B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u001c\u0010\u001c\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u00162\n\u0010 \u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\fH\u0016J)\u0010!\u001a\u00020\u00162!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020$J>\u0010&\u001a\u00020\u001626\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0018R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000e\"\u0004\b\u000f\u0010\u0010R)\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R>\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/appsell/adapter/ProductAdapter;", "Lcom/example/appsell/base/BaseAdapter;", "Lcom/example/appsell/model/Order;", "Lcom/example/appsell/adapter/ProductAdapter$ViewHolder;", "context", "Landroid/content/Context;", "isCart", "", "isManager", "(Landroid/content/Context;ZZ)V", "bgThumb", "", "", "[Ljava/lang/Integer;", "()Z", "setManager", "(Z)V", "onClickViewMain", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "", "onUpdateCount", "Lkotlin/Function2;", "count", "getItemViewId", "viewType", "getViewHolder", "itemView", "Landroid/view/View;", "onBindViewHolder", "holder", "onClickViewMainListener", "stringToWords", "", "", "s", "updateCountListener", "ViewHolder", "app_debug"})
public final class ProductAdapter extends com.example.appsell.base.BaseAdapter<com.example.appsell.model.Order, com.example.appsell.adapter.ProductAdapter.ViewHolder> {
    private final boolean isCart = false;
    private boolean isManager;
    private final java.lang.Integer[] bgThumb = {com.example.appsell.R.color.customGreen, com.example.appsell.R.color.textColorOrange, com.example.appsell.R.color.azure, com.example.appsell.R.color.colorNegativeRemoved, com.example.appsell.R.color.textColorRedCrimson};
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onUpdateCount;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickViewMain;
    
    public ProductAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isCart, boolean isManager) {
        super(null);
    }
    
    public final boolean isCart() {
        return false;
    }
    
    public final boolean isManager() {
        return false;
    }
    
    public final void setManager(boolean p0) {
    }
    
    public final void updateCountListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onUpdateCount) {
    }
    
    public final void onClickViewMainListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickViewMain) {
    }
    
    @java.lang.Override()
    public int getItemViewId(int viewType) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.appsell.adapter.ProductAdapter.ViewHolder getViewHolder(int viewType, @org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.appsell.adapter.ProductAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> stringToWords(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/appsell/adapter/ProductAdapter$ViewHolder;", "Lcom/example/appsell/base/BaseAdapter$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/appsell/adapter/ProductAdapter;Landroid/view/View;)V", "bindView", "", "position", "", "app_debug"})
    public final class ViewHolder extends com.example.appsell.base.BaseAdapter.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bindView(int position) {
        }
    }
}