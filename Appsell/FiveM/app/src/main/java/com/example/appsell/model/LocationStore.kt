package com.example.appsell.model

class LocationStore(
    var latitude: Double,
    var longitude: Double,
    var title: String?,
) {
    constructor() : this(0.0, 0.0, null)
}