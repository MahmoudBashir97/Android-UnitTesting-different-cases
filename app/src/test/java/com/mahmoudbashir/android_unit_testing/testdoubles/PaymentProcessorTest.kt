package com.mahmoudbashir.android_unit_testing.testdoubles

import io.mockk.every
import io.mockk.mockk
import org.junit.Assert
import org.junit.Test

class PaymentProcessorTest {

    @Test
    fun `test stub test doubles scenario`() {
        val paymentService: PaymentService = mockk()
        val paymentProcessor = PaymentProcessor(paymentService)

        // stub is used when i want a standard return ..
        every { paymentService.pay(any()) } returns true

        val result = paymentProcessor.doPayingProcess(100)
        Assert.assertTrue(result)
    }
}