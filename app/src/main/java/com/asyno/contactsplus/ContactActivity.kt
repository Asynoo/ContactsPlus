package com.asyno.contactsplus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_contact.*

class ContactActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        saveBtn.setOnClickListener{ finish()}

        val contactPosition = intent.getSerializableExtra("contactPos") as Int

        nameET.setText(Contacts().getAll()[contactPosition].name)

        phoneET.setText(Contacts().getAll()[contactPosition].phone)

        addressET.setText(Contacts().getAll()[contactPosition].address)

        emailET.setText(Contacts().getAll()[contactPosition].email)

        urlET.setText(Contacts().getAll()[contactPosition].url)
    }
}