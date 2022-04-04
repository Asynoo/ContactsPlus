package com.asyno.contactsplus

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.asyno.contactsplus.data.ContactRepositoryInDB
import com.asyno.contactsplus.data.observeOnce
import com.asyno.contactsplus.models.BEContact
import kotlinx.android.synthetic.main.activity_contact.*

class ContactActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        ContactRepositoryInDB.initialize(this);

        val contactId = intent.getSerializableExtra("contactId") as Int

        if (contactId == -1){
            saveBtn.setOnClickListener{ addContact() }
            deleteBtn.text = "Cancel"
            deleteBtn.setOnClickListener{ finish() }
        }else{
            val mRep = ContactRepositoryInDB.get()
            val editingContact = mRep.getById(contactId)

            val updateObserver = Observer<BEContact>{ contact ->
                nameET.setText(contact.name)
                phoneET.setText(contact?.phone)
                emailET.setText(contact?.email)
                urlET.setText(contact?.url)
                addressET.setText(contact?.address)
            }
            editingContact.observeOnce(this, updateObserver)
            deleteBtn.setOnClickListener{
                mRep.delete(editingContact.value!!)
                Toast.makeText(
                    this,
                    editingContact.value!!.name + " deleted",
                    Toast.LENGTH_SHORT
                ).show()
                finish();
            }
            saveBtn.setOnClickListener{
                editingContact.value!!.name = nameET.text.toString()
                editingContact.value!!.address = addressET.text.toString()
                editingContact.value!!.phone = phoneET.text.toString()
                editingContact.value!!.email = emailET.text.toString()
                editingContact.value!!.url = urlET.text.toString()

                mRep.update(editingContact.value!!)
                Toast.makeText(
                    this,
                    editingContact.value!!.name + " updated",
                    Toast.LENGTH_SHORT
                ).show()
                finish();
            }
        }
    }

    private fun addContact(){
        val mRep = ContactRepositoryInDB.get()
        val newContact = BEContact(
            id = 0,
            name = nameET.text.toString(),
            phone = phoneET.text.toString(),
            address = addressET.text.toString(),
            email = emailET.text.toString(),
            url = urlET.text.toString()
        )
        mRep.insert(newContact);
        Toast.makeText(this, newContact.name + " added", Toast.LENGTH_SHORT).show()
        finish();
    }
}