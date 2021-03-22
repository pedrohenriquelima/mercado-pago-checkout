package com.tienda.checkout.controller

import com.mercadopago.resources.Payment
import com.tienda.checkout.model.Notification
import com.tienda.checkout.service.MercadoPagoPaymentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/notification")
class NotificationController(
    @Autowired
    private val mercadoPagoPaymentService: MercadoPagoPaymentService
) {

    @PostMapping
    fun processPayment(@RequestBody notification: Notification): Payment {
        return mercadoPagoPaymentService.getPayment(notification)
    }
}