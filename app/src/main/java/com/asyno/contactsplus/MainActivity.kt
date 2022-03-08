package com.asyno.contactsplus


import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.ContextMenu.ContextMenuInfo
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val TAG = "xyz"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> {
                Toast.makeText(this, "Action Settings selected...", Toast.LENGTH_LONG).show()
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?, v: View,
        menuInfo: ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        Log.d(TAG, "Context item selected " + item.itemId)
        return when (item.itemId) {
            R.id.create1 -> {
                Toast.makeText(baseContext, "CREATE", Toast.LENGTH_LONG).show()
                true
            }
            R.id.update1 -> {
                Toast.makeText(baseContext, "UPDATE", Toast.LENGTH_LONG).show()
                true
            }
            R.id.print -> {
                Toast.makeText(this, "Print ....", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}