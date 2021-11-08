package com.example.appsell.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u00052\u00020\u0006:\u0001JB\r\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001d\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00028\u00002\b\b\u0002\u0010%\u001a\u00020&\u00a2\u0006\u0002\u0010\'J\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016J\n\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0013\u0010.\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001d\u00a2\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u001dH\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001dH&J\u001d\u00103\u001a\u00028\u00012\u0006\u00102\u001a\u00020\u001d2\u0006\u00104\u001a\u000205H&\u00a2\u0006\u0002\u00106J\u0006\u00107\u001a\u00020\u001aJ\u000e\u00108\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001dJ\b\u00109\u001a\u00020&H\u0016J\u001d\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00028\u00012\u0006\u0010 \u001a\u00020\u001dH\u0016\u00a2\u0006\u0002\u0010<J\u001d\u0010=\u001a\u00028\u00012\u0006\u0010>\u001a\u00020?2\u0006\u00102\u001a\u00020\u001dH\u0016\u00a2\u0006\u0002\u0010@J\u0015\u0010A\u001a\u00020\u001a2\u0006\u0010;\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010BJ\u0014\u0010C\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+J\u0014\u0010D\u001a\u00020\u001a2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J)\u0010E\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001a0\u001cJ\u001e\u0010F\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2\b\b\u0002\u0010%\u001a\u00020&J$\u0010F\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010%\u001a\u00020&2\u0006\u0010G\u001a\u00020HJ\u001c\u0010I\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010%\u001a\u00020&R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R)\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001a0\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R*\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014\u00a8\u0006K"}, d2 = {"Lcom/example/appsell/base/BaseAdapter;", "T", "VH", "Lcom/example/appsell/base/BaseAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroid/widget/Filterable;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "<set-?>", "Ljava/util/ArrayList;", "data", "getData", "()Ljava/util/ArrayList;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "onDataFiltered", "Lkotlin/Function0;", "", "onItemClicked", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "originData", "getOriginData", "addItem", "item", "updateOriginData", "", "(Ljava/lang/Object;Z)V", "getDiffUtilCallback", "Lcom/example/appsell/base/BaseDiffUtilCallback;", "list", "", "getFilter", "Landroid/widget/Filter;", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "getItemViewId", "viewType", "getViewHolder", "itemView", "Landroid/view/View;", "(ILandroid/view/View;)Lcom/example/appsell/base/BaseAdapter$ViewHolder;", "invokeOnDataFiltered", "invokeOnItemClicked", "isRegisterListeners", "onBindViewHolder", "holder", "(Lcom/example/appsell/base/BaseAdapter$ViewHolder;I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;I)Lcom/example/appsell/base/BaseAdapter$ViewHolder;", "registerListeners", "(Lcom/example/appsell/base/BaseAdapter$ViewHolder;)V", "setList", "setOnDataFilterListener", "setOnItemClickListener", "submitList", "diffUtilCallback", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "updateList", "ViewHolder", "app_debug"})
public abstract class BaseAdapter<T extends java.lang.Object, VH extends com.example.appsell.base.BaseAdapter.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> implements android.widget.Filterable, kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final android.view.LayoutInflater inflater = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<T> originData;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<T> data;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClicked;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onDataFiltered;
    
    public BaseAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getOriginData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public VH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    public final T getItem(int position) {
        return null;
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list, boolean updateOriginData) {
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list, boolean updateOriginData, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.Callback diffUtilCallback) {
    }
    
    public final void addItem(T item, boolean updateOriginData) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClicked) {
    }
    
    public final void setOnDataFilterListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDataFiltered) {
    }
    
    public final void invokeOnItemClicked(int position) {
    }
    
    public final void invokeOnDataFiltered() {
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list, boolean updateOriginData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.example.appsell.base.BaseDiffUtilCallback<T> getDiffUtilCallback(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list) {
        return null;
    }
    
    public abstract int getItemViewId(int viewType);
    
    @org.jetbrains.annotations.NotNull()
    public abstract VH getViewHolder(int viewType, @org.jetbrains.annotations.NotNull()
    android.view.View itemView);
    
    public boolean isRegisterListeners() {
        return false;
    }
    
    public void registerListeners(@org.jetbrains.annotations.NotNull()
    VH holder) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/appsell/base/BaseAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/coroutines/CoroutineScope;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "app_debug"})
    public static abstract class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.coroutines.CoroutineScope {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        protected final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.coroutines.CoroutineContext getCoroutineContext() {
            return null;
        }
    }
}