package com.example.appsell.model

class Product(
    var productName: String,
    var cost: Long,
    var description: String,
    var key: String,
    var type: String,
    var urlImage: String,
    var comments: Comment?
) {
    constructor() : this("", 0, "", "", "", "", null)
}

data class Comment(
    var user: String,
    var comment: String,
    var time: String
) {
    constructor() : this("", "", "")
}
