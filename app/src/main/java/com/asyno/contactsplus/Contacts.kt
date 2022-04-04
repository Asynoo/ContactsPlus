package com.asyno.contactsplus

import com.asyno.contactsplus.models.BEContact
import java.io.Serializable

class Contacts : Serializable {


    val mContacts = arrayOf(
        BEContact(1,"Tomáš", "56483251", "Kirkegade 76", "toma2614@easv365.dk", "https://example.com/belief"),
        BEContact(2,"Marco", "20201548", "Kronprinsensgade 98", "marc8509@easv365.dk", "https://www.example.edu/"),
        BEContact(3,"Danylo", "84595512", "Jyllandsgade 151", "dany0107@easv365.dk", "http://angle.example.com/"),
        BEContact(4,"Rolf", "20501478", "Grundtvigs Allé 121", "rolf1172@easv365.dk", "http://example.com/arithmetic/bedroom.php"),
        BEContact(5,"Mikkel", "95870026", "Blichers Alle 32", "mikk911a@easv365.dk", "http://example.com/beef"),
        BEContact(6,"Kjell", "75000025", "Grundtvigs Allé 41", "kjel0393@easv365.dk", "http://www.example.com/afterthought.php"),
        BEContact(7,"Mantas", "15906025", "Grønvangsvej 32", "mant0214@easv365.dk", "http://bridge.example.com/arch.aspx"),
        BEContact(8,"Thomas", "40504021", "Brorsonsvej 1", "thom17m1@easv365.dk", "http://www.example.edu/"),
        BEContact(9,"Faustas", "50668425", "Paghs Alle 16", "faus0097@easv365.dk", "https://example.com/?apparatus=babies#bike"),
        BEContact(10,"Laszlo", "20658499", "Mimers Alle 12", "lasz0141@easv365.dk", "https://www.example.com/actor/box?believe=bubble&army=blade"),
        BEContact(11,"Kamilla", "78080895", "Højvangs Alle 39", "kami7686@easv365.dk", "http://boot.example.com/breath/boot?bath=belief&bike=basketball"),
        BEContact(12,"Wojciech", "60545422", "Granlunden 9", "wojc0395@easv365.dk", "https://argument.example.com/achiever/bells")
    )

    fun getAll(): Array<BEContact> = mContacts

    fun getAllNames(): Array<String> = mContacts.map { p -> p.name }.toTypedArray()

}