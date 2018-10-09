package com.example.muhammadrizwan.listview_with_intents

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity()  {

    lateinit var LV : ListView
    var array = arrayOf("Facebook","Google","Wikipedia")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LV = findViewById(R.id.LV)
        LV.adapter =ArrayAdapter(this,android.R.layout.simple_list_item_1,array)

        LV.setOnItemClickListener { adapterView, view, i, l ->

            var position=LV!!.getItemAtPosition(i)
           if (position==0)
           {
               var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"))
                startActivity(intent)
           }

            if (position=="Google")
            {
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
                startActivity(intent)
            }
            if (position=="Wikipedia")
            {
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wikipedia.com/"))
                startActivity(intent)
            }
        }

        }

    }

