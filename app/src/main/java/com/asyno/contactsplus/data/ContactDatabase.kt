package com.asyno.contactsplus.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.asyno.contactsplus.models.BEContact
import com.asyno.contactsplus.data.ContactDao

@Database(entities = [BEContact::class], version=1)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun contactDao(): ContactDao
}