package com.asyno.contactsplus

import com.asyno.contactsplus.models.BEContact
import java.io.Serializable

class Contacts : Serializable {


    val mContacts = arrayOf<BEContact>(
        BEContact("Tomáš", "56483251", "Kirkegade 76, 6700 Esbjerg", "toma2614@easv365.dk", "https://example.com/belief"),
        BEContact("Marco", "20201548", "Kronprinsensgade 98, 6700 Esbjerg", "marc8509@easv365.dk", "https://www.example.edu/"),
        BEContact("Danylo", "84595512", "Jyllandsgade 151, 6700 Esbjerg", "dany0107@easv365.dk", "http://angle.example.com/"),
        BEContact("Rolf", "20501478", "Grundtvigs Allé 121, 6700 Esbjerg ", "rolf1172@easv365.dk", "http://example.com/arithmetic/bedroom.php"),
        BEContact("Mikkel", "95870026", "Blichers Alle 32, 6700 Esbjerg", "mikk911a@easv365.dk", "http://example.com/beef"),
        BEContact("Kjell", "75000025", "Grundtvigs Allé 41, 6700 Esbjerg", "kjel0393@easv365.dk", "http://www.example.com/afterthought.php"),
        BEContact("Mantas", "15906025", "Grønvangsvej 32, 6700 Esbjerg", "mant0214@easv365.dk", "http://bridge.example.com/arch.aspx"),
        BEContact("Thomas", "40504021", "Brorsonsvej 1, 6700 Esbjerg", "thom17m1@easv365.dk", "http://www.example.edu/"),
        BEContact("Faustas", "50668425", "Paghs Alle 16, 6705 Esbjerg Kommune", "faus0097@easv365.dk", "https://example.com/?apparatus=babies#bike"),
        BEContact("Laszlo", "20658499", "Mimers Alle 12, 6705 Esbjerg Kommune", "lasz0141@easv365.dk", "https://www.example.com/actor/box?believe=bubble&army=blade"),
        BEContact("Kamilla", "78080895", "Højvangs Alle 39, 6700 Esbjerg", "kami7686@easv365.dk", "http://boot.example.com/breath/boot?bath=belief&bike=basketball"),
        BEContact("Wojciech", "60545422", "Granlunden 9, 6800 Varde", "wojc0395@easv365.dk", "https://argument.example.com/achiever/bells")
    )

    fun getAll(): Array<BEContact> = mContacts

    fun getAllNames(): Array<String> = mContacts.map { p -> p.name }.toTypedArray()

}