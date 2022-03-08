package com.asyno.contactsplus

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.view.ContextMenu.ContextMenuInfo
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.asyno.contactsplus.Models.BEContact
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ContactAdapter(this, Contacts().getAll())

        lvContacts.adapter = adapter



    }

    internal class ContactAdapter(context: Context,
                                 private val contacts: Array<BEContact>
    ) : ArrayAdapter<BEContact>(context, 0, contacts)
    {
        private val colours = intArrayOf(
            Color.parseColor("White"),
            Color.parseColor("White")
        )

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