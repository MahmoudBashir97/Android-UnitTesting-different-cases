package com.mahmoudbashir.android_unit_testing.testdoubles


interface DatabaseDao {
    fun save(name:String)
    fun getName():String
}

class InMemoryDatabase:DatabaseDao{
    var dataHolder = ""
    override fun save(name: String) {
        dataHolder = name
    }

    override fun getName(): String = dataHolder
}

class DatabaseManager(private val db: DatabaseDao){

    fun saveName(name:String){
        db.save(name)
    }

    fun getName() = db.getName()
}