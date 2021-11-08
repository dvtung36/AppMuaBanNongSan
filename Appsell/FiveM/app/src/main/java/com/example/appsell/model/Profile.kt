package com.example.appsell.model

class Profile(
    var userName: String,
    var date: String,
    var address: String,
    var isManager: Boolean = false,
    var phone: String,
    var avatarURL: String
) {
    constructor() : this("", "0", "", false, "", "")
}