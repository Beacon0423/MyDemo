package com.may.chatroom.application

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class ChatRoomApp : Application() {

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }
}