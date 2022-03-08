package com.asyno.contactsplus

import com.asyno.contactsplus.Models.BEContact
import java.io.Serializable

class Contacts : Serializable {


    val mContacts = arrayOf<BEContact>(
        BEContact("Simon", "56483251", "Kirkegade 76, 6700 Esbjerg"),
        BEContact("Dennis", "20201548", "Kronprinsensgade 98, 6700 Esbjerg"),
        BEContact("Mina", "84595512", "Jyllandsgade 151, 6700 Esbjerg"),
        BEContact("Emil", "20501478", "Grundtvigs Allé 121, 6700 Esbjerg  "),
        BEContact("Mads", "95870026", "Blichers Alle 32, 6700 Esbjerg"),
        BEContact("Martin", "75000025", "Grundtvigs Allé 41, 6700 Esbjerg"),
        BEContact("Mike", "15906025", "Grønvangsvej 32, 6700 Esbjerg"),
        BEContact("Trine", "40504021", "Brorsonsvej 1, 6700 Esbjerg"),
        BEContact("Mathias", "50668425", "Paghs Alle 16, 6705 Esbjerg Kommune"),
        BEContact("Rasmus", "20414120", "Anemonevej 1, 6705 Esbjerg Kommune"),
        BEContact("Christian", "20658499", "Mimers Alle 12, 6705 Esbjerg Kommune"),
        BEContact("Peter", "78080895", "Højvangs Alle 39, 6700 Esbjerg"),
        BEContact("Anders", "60545422", "Granlunden 9, 6800 Varde"),
        BEContact("Mikkel", "90574212", "Gyvellunden 52, 6800 Varde")
    )

    fun getAll(): Array<BEContact> = mContacts

    fun getAllNames(): Array<String> = mContacts.map { p -> p.name }.toTypedArray()

}