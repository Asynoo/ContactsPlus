package com.asyno.contactsplus.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class BEContact(@PrimaryKey(autoGenerate = true)
                     var id: Int,
                     var name: String,
                     var phone: String,
                     var address: String,
                     var email: String,
                     var url: String
                     ) : Serializable {
    override fun toString(): String {
        return "id=$id, name='$name', phone='$phone', address='$address', email='$email', url='$url'"
    }
}