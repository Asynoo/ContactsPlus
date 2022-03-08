package com.asyno.contactsplus.Models

import java.io.Serializable

data class BEContact(var name: String, var phone: String, var address: String) : Serializable {
}