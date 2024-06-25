package com.mahmoudbashir.android_unit_testing.testdoubles

import io.mockk.mockk
import org.junit.Assert
import org.junit.Test


class DatabaseManagerTest{

    @Test
    fun `test fake test doubles scenario`(){
        val database = InMemoryDatabase()
        val databaseManager = DatabaseManager(database)
        databaseManager.saveName("Mahmoud")

        val result = databaseManager.getName()
        Assert.assertEquals(result,"Mahmoud")
    }
}