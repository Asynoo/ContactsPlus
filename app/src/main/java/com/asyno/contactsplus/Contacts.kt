package com.asyno.contactsplus

import java.io.Serializable

class Contacts : Serializable {

    var contactList = mutableListOf<String>()

    fun getList(): MutableList<String>{
        return contactList
    }
}