package com.mahmoudbashir.android_unit_testing.registerationTest

import com.mahmoudbashir.android_unit_testing.model.LoginController
import com.mahmoudbashir.android_unit_testing.model.LoginModel
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class LoginTest {

    private lateinit var controller: LoginController

    @Before
    fun setUp() {
        controller = LoginController()
    }

    @Test
    fun `Given login data is valid then login should be successful`() {
        controller.doLogin(LoginModel("mahmoudbashir@gmail.com", "123456"))
        val expected = LoginModel("mahmoudbashir@gmail.com", "123456")
        assert(controller.getLoggedData() == expected)
    }

    @Test
    fun `Given email data when call doLogin() then we expect email isValid`() {
        controller.doLogin(LoginModel("mahmoudbashir@gmail.com", "123456"))
        Assert.assertTrue(controller.isEmailValid())
    }

    @Test
    fun `Given three char in password data when call doLogin() then we expect password is inValid`() {
        controller.doLogin(LoginModel("mahmoudbashir@gmail.com", "123"))
        Assert.assertFalse(controller.isPasswordValid())
    }

    @Test(expected = IllegalArgumentException::class)
    fun `Given an empty input in password data when call doLogin() then we expect password is invalid with throwing an exception`() {
        controller.doLogin(LoginModel("mahmoudbashir@gmail.com", ""))
        Assert.assertFalse(controller.isPasswordValid())
    }

    @After
    fun tearDown(){
        println("testing finished")
    }

}