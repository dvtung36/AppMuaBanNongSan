package com.example.appsell.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002Be\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0011R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u0006*"}, d2 = {"Lcom/example/appsell/model/Purchase;", "", "()V", "date", "", "userOrder", "Lcom/example/appsell/model/Profile;", "orders", "Ljava/util/ArrayList;", "Lcom/example/appsell/model/Order;", "Lkotlin/collections/ArrayList;", "statusOrder", "", "typePayment", "nameBank", "bankNumber", "id", "(JLcom/example/appsell/model/Profile;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankNumber", "()Ljava/lang/String;", "setBankNumber", "(Ljava/lang/String;)V", "getDate", "()J", "setDate", "(J)V", "getId", "setId", "getNameBank", "setNameBank", "getOrders", "()Ljava/util/ArrayList;", "setOrders", "(Ljava/util/ArrayList;)V", "getStatusOrder", "setStatusOrder", "getTypePayment", "setTypePayment", "getUserOrder", "()Lcom/example/appsell/model/Profile;", "setUserOrder", "(Lcom/example/appsell/model/Profile;)V", "app_debug"})
public final class Purchase {
    private long date;
    @org.jetbrains.annotations.Nullable()
    private com.example.appsell.model.Profile userOrder;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.example.appsell.model.Order> orders;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusOrder;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String typePayment;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nameBank;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String bankNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String id;
    
    public Purchase(long date, @org.jetbrains.annotations.Nullable()
    com.example.appsell.model.Profile userOrder, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.appsell.model.Order> orders, @org.jetbrains.annotations.NotNull()
    java.lang.String statusOrder, @org.jetbrains.annotations.NotNull()
    java.lang.String typePayment, @org.jetbrains.annotations.Nullable()
    java.lang.String nameBank, @org.jetbrains.annotations.Nullable()
    java.lang.String bankNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        super();
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.appsell.model.Profile getUserOrder() {
        return null;
    }
    
    public final void setUserOrder(@org.jetbrains.annotations.Nullable()
    com.example.appsell.model.Profile p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.example.appsell.model.Order> getOrders() {
        return null;
    }
    
    public final void setOrders(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.appsell.model.Order> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusOrder() {
        return null;
    }
    
    public final void setStatusOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypePayment() {
        return null;
    }
    
    public final void setTypePayment(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameBank() {
        return null;
    }
    
    public final void setNameBank(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBankNumber() {
        return null;
    }
    
    public final void setBankNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Purchase() {
        super();
    }
}