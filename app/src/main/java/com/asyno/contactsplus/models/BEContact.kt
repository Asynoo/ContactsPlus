package com.asyno.contactsplus.models

import java.io.Serializable

data class BEContact(var name: String,
                     var phone: String,
                     var address: String,
                     var email: String,
                     var url: String
                     ) : Serializable {
}