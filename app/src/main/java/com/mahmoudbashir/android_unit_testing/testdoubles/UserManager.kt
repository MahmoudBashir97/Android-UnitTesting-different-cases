package com.mahmoudbashir.android_unit_testing.testdoubles

class UserManager(logger: Logger) {
    private val userList = mutableListOf<User>()

    fun addUser(user: User) {
        userList.add(user)
    }

    fun getUserList() = userList
}

data class User(val userName: String)