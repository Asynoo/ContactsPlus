package com.asyno.contactsplus.data

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.asyno.contactsplus.models.BEContact
import java.lang.IllegalStateException
import java.util.concurrent.Executors

class ContactRepositoryInDB private constructor(private val context: Context) {

    private val database: ContactDatabase = Room.databaseBuilder(context.applicationContext,
        ContactDatabase::class.java,
        "contact-database").build()

    private val contactDao = database.contactDao()

    fun getAll(): LiveData<List<BEContact>> = contactDao.getAll()

    fun getAllNames(): LiveData<List<String>> = contactDao.getAllNames()

    fun getById(id: Int) = contactDao.getById(id)

    private val executor = Executors.newSingleThreadExecutor()

    fun insert(p: BEContact) {
        executor.execute{ contactDao.insert(p) }
    }

    fun update(p: BEContact) {
        executor.execute { contactDao.update(p) }
    }

    fun delete(p: BEContact) {
        executor.execute { contactDao.delete(p) }
    }

    fun clear() {
        executor.execute { contactDao.deleteAll() }
    }


    companion object {
        private var Instance: ContactRepositoryInDB? = null

        fun initialize(context: Context) {
            if (Instance == null)
                Instance = ContactRepositoryInDB(context)
        }

        fun get(): ContactRepositoryInDB {
            if (Instance != null) return Instance!!
            throw IllegalStateException("Contact repo not initialized")
        }
    }







}