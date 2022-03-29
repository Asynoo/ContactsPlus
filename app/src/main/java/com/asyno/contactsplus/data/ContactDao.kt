package com.asyno.contactsplus.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.asyno.contactsplus.models.BEContact

@Dao
interface ContactDao {

    @Query("SELECT * from BEContact order by id")
    fun getAll(): LiveData<List<BEContact>>

    @Query("SELECT name from BEContact order by name")
    fun getAllNames(): LiveData<List<String>>

    @Query("SELECT * from BEContact where id = (:id)")
    fun getById(id: Int): LiveData<BEContact>

    @Insert
    fun insert(p: BEContact)

    @Update
    fun update(p: BEContact)

    @Delete
    fun delete(p: BEContact)

    @Query("DELETE from BEContact")
    fun deleteAll()
}