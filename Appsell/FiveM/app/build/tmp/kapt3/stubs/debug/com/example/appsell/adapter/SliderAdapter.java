package com.example.appsell.adapter;

import java.lang.System;

/**
 * Created by ThinhNV on 23/08/2021.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0012B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0018\u00010\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0016\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/appsell/adapter/SliderAdapter;", "Lcom/smarteist/autoimageslider/SliderViewAdapter;", "Lcom/example/appsell/adapter/SliderAdapter$ViewHolderSlider;", "context", "Landroid/content/Context;", "sliderItems", "", "Lcom/example/appsell/model/SliderItem;", "(Landroid/content/Context;Ljava/util/List;)V", "getCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "ViewHolderSlider", "app_debug"})
public final class SliderAdapter extends com.smarteist.autoimageslider.SliderViewAdapter<com.example.appsell.adapter.SliderAdapter.ViewHolderSlider> {
    private final android.content.Context context = null;
    private final java.util.List<com.example.appsell.model.SliderItem> sliderItems = null;
    
    public SliderAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.appsell.model.SliderItem> sliderItems) {
        super();
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.appsell.adapter.SliderAdapter.ViewHolderSlider onCreateViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.Nullable()
    com.example.appsell.adapter.SliderAdapter.ViewHolderSlider viewHolder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/appsell/adapter/SliderAdapter$ViewHolderSlider;", "Lcom/smarteist/autoimageslider/SliderViewAdapter$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/appsell/adapter/SliderAdapter;Landroid/view/View;)V", "app_debug"})
    public final class ViewHolderSlider extends com.smarteist.autoimageslider.SliderViewAdapter.ViewHolder {
        
        public ViewHolderSlider(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}