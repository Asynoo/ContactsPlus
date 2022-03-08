package com.asyno.contactsplus

import com.asyno.contactsplus.Models.BEContact
import java.io.Serializable

class Contacts : Serializable {


    val mContacts = arrayOf<BEContact>(
        BEContact("Simon", "5714504322", "Kirkegade 76, 6700 Esbjerg"),
        BEContact("Dennis", "1741285796", "Kronprinsensgade 98, 6700 Esbjerg"),
        BEContact("Mina", "3872187932", "Jyllandsgade 151, 6700 Esbjerg"),
        BEContact("Emil", "9921381855", "Grundtvigs Allé 121, 6700 Esbjerg  "),
        BEContact("Mads", "9545927156", "Blichers Alle 32, 6700 Esbjerg"),
        BEContact("Martin", "7544628569", "Grundtvigs Allé 41, 6700 Esbjerg"),
        BEContact("Mike", "2532747550", "Grønvangsvej 32, 6700 Esbjerg"),
        BEContact("Trine", "8834115704", "Brorsonsvej 1, 6700 Esbjerg"),
        BEContact("Mathias", "5727455707", "Paghs Alle 16, 6705 Esbjerg Kommune"),
        BEContact("Rasmus", "4594184330", "Anemonevej 1, 6705 Esbjerg Kommune"),
        BEContact("Christian", "6099022821", "Mimers Alle 12, 6705 Esbjerg Kommune"),
        BEContact("Peter", "1435308976", "Højvangs Alle 39, 6700 Esbjerg"),
        BEContact("Anders", "6238781149", "Granlunden 9, 6800 Varde"),
        BEContact("Mikkel", "7193226031", "Gyvellunden 52, 6800 Varde")
    )

    fun getAll(): Array<BEContact> = mContacts

    fun getAllNames(): Array<String> = mContacts.map { p -> p.name }.toTypedArray()

}