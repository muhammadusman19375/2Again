package com.example.a2again

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yalantis.library.Koloda

class MainActivity : AppCompatActivity() {
    private var adapter: SwipeAdapter? = null
    private var list: ArrayList<String>? = null
    var koloda: Koloda? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        koloda = findViewById(R.id.koloda)

        list = ArrayList<String>()
        list?.add("Usman")
        list?.add("irfan")
        list?.add("ali")
        list?.add("akbar")
        list?.add("abdullah")
        list?.add("ahmad")
        list?.add("hasnian")
        list?.add("qasim")
        list?.add("naveed")
        list?.add("tariq")
        list?.add("hafiz")
        list?.add("asim")
        list?.add("imran")
        list?.add("kafith")
        list?.add("nasar")
        list?.add("aqib")
        list?.add("shadab")
        list?.add("babar")
        list?.add("azam")

        adapter = SwipeAdapter(this,list!!)
        koloda?.adapter = adapter

    }
}