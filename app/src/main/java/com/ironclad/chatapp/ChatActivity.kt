package com.ironclad.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        btnSend.setOnClickListener {

        }
    }
}

class Message(var email:String, var msg:String){
    constructor():this("","")
}
