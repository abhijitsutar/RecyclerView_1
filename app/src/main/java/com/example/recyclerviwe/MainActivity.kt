package com.example.recyclerviwe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerMessages : RecyclerView
    private lateinit var messagesAdapter: MessagesAdapter
    private val messages = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        recyclerMessages = findViewById(R.id.recycles)

        initmessages()

        messagesAdapter = MessagesAdapter(messages)
        recyclerMessages.adapter = messagesAdapter

        recyclerMessages.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }


    private fun initmessages(){
       for (i in 0 ..20 )
           messages.add("$i Dearb student you are  not serious in this course  ")
   }


}