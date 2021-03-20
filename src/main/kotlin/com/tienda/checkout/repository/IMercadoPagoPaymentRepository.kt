package com.tienda.checkout.repository

import com.mercadopago.resources.Payment

interface IMercadoPagoPaymentRepository {
    fun getPayment(id: String): Payment
}