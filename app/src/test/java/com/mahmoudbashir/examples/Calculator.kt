package com.mahmoudbashir.examples

import org.junit.Assert
import org.junit.Test

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}


class CalculatorTest {
    @Test
    fun testAdd(){
        val calculator = Calculator()
        val result = calculator.add(10,20)
        Assert.assertEquals(30,result)
    }
}