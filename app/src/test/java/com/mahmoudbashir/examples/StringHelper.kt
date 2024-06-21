package com.mahmoudbashir.examples

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StringHelper {
    fun isPositiveNumber(number: Int): Boolean {
        return number > 0
    }
}


class StringHelperTest {

    private lateinit var suT: StringHelper

    @Before
    fun setUp() {
        suT = StringHelper()
    }

    @Test
    fun`test is Positive number`() {
        val result = suT.isPositiveNumber(1)
        Assert.assertTrue(result)
    }
}