package com.tienda.checkout.controller

import com.mercadopago.resources.Payment
import com.tienda.checkout.model.Notification
import com.tienda.checkout.service.MercadoPagoPreferenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/notification")
class NotificationController(
    @Autowired
    val mercadoPagoPreferenceService: MercadoPagoPreferenceService
) {

    @PostMapping
    fun processPayment(@RequestBody notification: Notification): Payment {
        return mercadoPagoPreferenceService.getPayment(notification)
    }
}