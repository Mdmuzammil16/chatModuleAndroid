package com.andro.chats

import android.content.Context
import android.widget.Toast


class MyToastLibrary {
    fun showToast(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}