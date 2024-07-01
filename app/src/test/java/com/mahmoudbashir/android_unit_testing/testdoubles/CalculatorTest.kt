package com.mahmoudbashir.android_unit_testing.testdoubles

import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
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



    /*
      spy test is depending on real observer object not a mockk object .
    */
    @Test
    fun `test spy stub nature of mockk`() {
        val dependency1: Dependency1 = mockk() // by default is strict
        val dependency2: Dependency2 = Dependency2(4) // real object

        val spyDependency2 = spyk(dependency2)

        every { dependency1.value } returns 5
        //every { spyDependency2.value } returns 7

        val calculator = Calculator(dependency1, spyDependency2)
        val result = calculator.add()
        Assert.assertEquals(9, result)
    }
}