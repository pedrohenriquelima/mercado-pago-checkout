package com.tienda.checkout.model

import java.util.Date

data class Notification(
    var id: Long,
    var live_mode: Boolean,
    var type: String,
    var date_created: Date,
    var application_id: Number,
    var user_id: Number,
    var version: Number,
    var api_version: String,
    var action: String,
    var data: NotificationData
)