package com.mahmoudbashir.examples

import org.junit.Assert
import org.junit.Test

class StringUtils{
    fun reverseString(input:String):String{
        return input.reversed()
    }
}

class StringUtilsTest{
    @Test
    fun testReverseString(){
        val input = "Mahmoud bashir"
        val expected = "rihsab duomhaM"

        val stringUtils = StringUtils()
        val actualOutput = stringUtils.reverseString(input)
        Assert.assertEquals(expected,actualOutput)
    }
}