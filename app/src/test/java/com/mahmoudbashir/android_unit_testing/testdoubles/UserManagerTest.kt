package com.mahmoudbashir.android_unit_testing.testdoubles

import org.junit.Test
import io.mockk.mockk
import org.junit.Assert

class UserManagerTest {

    @Test
    fun `test dummy test for user manager`() {
        val logger: Logger = mockk()
        val userManager = UserManager(logger)
        userManager.addUser(User("mahmoud"))
        Assert.assertEquals(1, userManager.getUserList().size)
    }
}