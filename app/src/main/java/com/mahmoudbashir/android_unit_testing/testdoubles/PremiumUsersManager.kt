package com.mahmoudbashir.android_unit_testing.testdoubles

interface UserService {
    fun getUsersCount(): Int
}

class RealUserService(): UserService{
    override fun getUsersCount(): Int  = 20
}

class PremiumUsersManager(private val service: UserService) {
    fun getUserCount() = service.getUsersCount()
}