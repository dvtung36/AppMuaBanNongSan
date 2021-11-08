package com.example.appsell.model

import com.example.appsell.base.Constant

class Purchase(
    var date: Long,
    var userOrder: Profile?,
    var orders: ArrayList<Order>?,
    var statusOrder: String = "",
    var typePayment: String = Constant.TYPE_CART,
    var nameBank: String?,
    var bankNumber: String?,
    var id: String?
) {
    constructor() : this(0, null, null, "",Constant.TYPE_CART,"","","")
}