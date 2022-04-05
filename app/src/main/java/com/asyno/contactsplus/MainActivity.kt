package com.asyno.contactsplus

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.lifecycle.Observer
import com.asyno.contactsplus.data.ContactRepositoryInDB
import com.asyno.contactsplus.models.BEContact
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setSupportActionBar(findViewById(R.id.my_toolbar))
        setContentView(R.layout.activity_main)

        ContactRepositoryInDB.initialize(this)
        //seedContacts()

        val mRep = ContactRepositoryInDB.get()
        val getAllObserver = Observer<List<BEContact>>{ contacts ->
            val adapter = ContactAdapter(this, contacts)
            lvContacts.adapter = adapter
            Log.d("DBG", "getAll observer notified")
        }
        mRep.getAll().observe(this, getAllObserver)

        lvContacts.setOnItemClickListener { _,_,pos, _ ->
            onListItemClick(lvContacts.adapter.getItemId(pos).toInt())
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int = item.getItemId()

        when (id) {
            R.id.action_settings -> {
                this.onListItemClick(-1)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.create1 -> {
                Toast.makeText(baseContext, "CREATE", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }

    private fun seedContacts(){
        val mRep = ContactRepositoryInDB.get()
        Contacts().getAll().forEach { contact ->  mRep.insert(contact)}
    }

    private fun onListItemClick(contactId: Int ) {
        if (contactId == -1){
            val intent = Intent(this, ContactActivity::class.java)
            intent.putExtra("contactId",contactId)
            startActivity(intent)
            return
        }
        // contactId is in the list!
        // first get the name of the person clicked
        val intent = Intent(this, ContactActivity::class.java)
        intent.putExtra("contactId",contactId)
        startActivity(intent)
    }

    internal class ContactAdapter(
        context: Context, private val contacts: List<BEContact>
    ) : ArrayAdapter<BEContact>(context, 0, contacts)
    {
        private val colours = intArrayOf(
            Color.parseColor("White"),
            Color.parseColor("White")
        )

        override fun getItemId(position: Int): Long {
            return contacts[position].id.toLong();
        }
        override fun getView(position: Int, v: View?, parent: ViewGroup): View {
            var v1: View? = v
            if (v1 == null) {
                val mInflater = LayoutInflater.from(context)
                v1 = mInflater.inflate(R.layout.cell_extended, null)
            }
            val resView: View = v1!!
            resView.setBackgroundColor(colours[position % colours.size])
            val f = contacts[position]
            val nameView = resView.findViewById<TextView>(R.id.tvNameExt)
            val phoneView = resView.findViewById<TextView>(R.id.tvPhoneExt)
            val addressView = resView.findViewById<TextView>(R.id.tvAddressExt)
            val favoriteView = resView.findViewById<ImageView>(R.id.imgFavoriteExt)
                nameView.text = f.name
                phoneView.text = "+45 " + f.phone
                addressView.text = f.address


            favoriteView.setImageResource(R.drawable.user)

            return resView
        }
    }
}