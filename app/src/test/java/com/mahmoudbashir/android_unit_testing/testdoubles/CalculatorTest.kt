package com.mahmoudbashir.android_unit_testing.testdoubles

import io.mockk.every
import io.mockk.mockk
import org.junit.Assert
import org.junit.Test


class CalculatorTest {


    /*

   mockk has types : strict , relaxed

   strict :
           with strict you have to assign values .

   relaxed :
            mockk(relaxed = true)
            with relaxed you have an option for assigning values .
     */


    @Test
    fun `test strict nature of mockk`() {
        val dependency1: Dependency1 = mockk()
        val dependency2: Dependency2 = mockk()
        every { dependency1.value } returns 3
        every { dependency2.value } returns 7

        val calculator = Calculator(dependency1, dependency2)
        val result = calculator.add()
        Assert.assertEquals(10, result)
    }

    @Test
    fun `test relaxed nature of mockk`() {
        val dependency1: Dependency1 = mockk(relaxed = true)
        val dependency2: Dependency2 = mockk(relaxed = true)
         //every { dependency2.value } returns 15

        val calculator = Calculator(dependency1, dependency2)
        val result = calculator.add()
        Assert.assertEquals(0, result)
    }
}