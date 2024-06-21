package com.mahmoudbashir.android_unit_testing.model

class LoginController {
    private lateinit var loginData: LoginModel

    fun doLogin(loginModel: LoginModel) {
        this.loginData = loginModel
    }

    fun getLoggedData() = loginData

    fun isEmailValid() = loginData.email.isNotEmpty()

    fun isPasswordValid() = loginData.password.isNotEmpty() && loginData.password.length >= 6
}