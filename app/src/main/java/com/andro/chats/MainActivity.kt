package com.andro.chats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dosolutions.mymod1.MyToaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyToaster().DisplayToast(applicationContext, "this is message")

    }
}