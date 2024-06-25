package com.mahmoudbashir.android_unit_testing.testdoubles

interface PaymentService {
    fun pay(amount: Int): Boolean
}

class PaymentProcessor(private val paymentService: PaymentService) {

    fun doPayingProcess(amount: Int): Boolean {
        val result = paymentService.pay(amount)
        println("payment status : $result")
        return result
    }
}