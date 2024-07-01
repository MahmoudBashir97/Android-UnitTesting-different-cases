package com.mahmoudbashir.android_unit_testing.testdoubles

data class Dependency1(val value:Int,val isPrem:Boolean = true)
data class Dependency2(val value:Int,val isPrem:Boolean = true)

class Calculator(private val dep1:Dependency1, private val dep2: Dependency2){
    fun add() = dep1.value + dep2.value
    fun subtract() = dep1.value - dep2.value
}