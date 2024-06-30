package com.mahmoudbashir.android_unit_testing.testdoubles

import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.junit.Assert
import org.junit.Test


class PremiumUsersManagerTest {

    @Test
    fun `test mocking test doubles`() {
        val service: UserService = mockk()
        val usersManager = PremiumUsersManager(service)
        every { usersManager.getUserCount() } returns 10
        val countResult = usersManager.getUserCount()
        Assert.assertEquals(10, countResult)
        verify(atLeast = 1) {
            usersManager.getUserCount()
        }
    }

    @Test
    fun `test spy test doubles`() {
        val service: UserService = RealUserService()
        val spyService = spyk(service)
        val usersManager = PremiumUsersManager(spyService)

        val countResult = usersManager.getUserCount()
        Assert.assertEquals(20, countResult)
        verify(atLeast = 1) {
            spyService.getUsersCount()
        }
    }
}