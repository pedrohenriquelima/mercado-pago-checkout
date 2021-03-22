package com.tienda.checkout.service

import com.google.gson.Gson
import com.mercadopago.resources.Payment
import com.tienda.checkout.model.Notification
import com.tienda.checkout.repository.MercadoPagoPaymentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MercadoPagoPaymentService {
    @Autowired
    private lateinit var mercadoPagoPaymentRepository: MercadoPagoPaymentRepository

    fun getPayment(notification: Notification): Payment {
        val gson = Gson()
        print(gson.toJson(notification))
        return mercadoPagoPaymentRepository.getPayment(notification.data.id)
    }
}