package com.tienda.checkout.service

import com.mercadopago.resources.Payment
import com.tienda.checkout.model.Notification
import com.tienda.checkout.repository.MercadoPagoPaymentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MercadoPagoPreferenceService {
    @Autowired
    lateinit var mercadoPagoPaymentRepository: MercadoPagoPaymentRepository

    fun getPayment(notification: Notification): Payment {
        return mercadoPagoPaymentRepository.getPayment(notification.data.id)
    }
}