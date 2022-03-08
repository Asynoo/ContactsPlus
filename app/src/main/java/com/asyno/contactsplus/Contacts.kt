package com.asyno.contactsplus

import com.asyno.contactsplus.Models.BEContact
import java.io.Serializable

class Contacts : Serializable {


    val mContacts = arrayOf<BEContact>(
        BEContact("Tomáš", "56483251", "Kirkegade 76, 6700 Esbjerg"),
        BEContact("Marco", "20201548", "Kronprinsensgade 98, 6700 Esbjerg"),
        BEContact("Danylo", "84595512", "Jyllandsgade 151, 6700 Esbjerg"),
        BEContact("Rolf", "20501478", "Grundtvigs Allé 121, 6700 Esbjerg  "),
        BEContact("Mikkel", "95870026", "Blichers Alle 32, 6700 Esbjerg"),
        BEContact("Kjell", "75000025", "Grundtvigs Allé 41, 6700 Esbjerg"),
        BEContact("Mantas", "15906025", "Grønvangsvej 32, 6700 Esbjerg"),
        BEContact("Thomas", "40504021", "Brorsonsvej 1, 6700 Esbjerg"),
        BEContact("Faustas", "50668425", "Paghs Alle 16, 6705 Esbjerg Kommune"),
        BEContact("Fei", "20414120", "Anemonevej 1, 6705 Esbjerg Kommune"),
        BEContact("Laszlo", "20658499", "Mimers Alle 12, 6705 Esbjerg Kommune"),
        BEContact("Kamilla", "78080895", "Højvangs Alle 39, 6700 Esbjerg"),
        BEContact("Wojciech", "60545422", "Granlunden 9, 6800 Varde"),
        BEContact("Martin", "90574212", "Gyvellunden 52, 6800 Varde")
    )

    fun getAll(): Array<BEContact> = mContacts

    fun getAllNames(): Array<String> = mContacts.map { p -> p.name }.toTypedArray()

}