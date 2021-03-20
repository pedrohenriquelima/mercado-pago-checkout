package com.tienda.checkout.repository

import com.mercadopago.MercadoPago;
import com.mercadopago.resources.Payment
import com.mercadopago.resources.Preference
import org.springframework.stereotype.Repository

@Repository
class MercadoPagoPaymentRepository : IMercadoPagoPaymentRepository {
    override fun getPayment(id: String): Payment {
        MercadoPago.SDK.setAccessToken("APP_USR-6317427424180639-042414-47e969706991d3a442922b0702a0da44-469485398")
        return Payment.findById(id)
    }
}