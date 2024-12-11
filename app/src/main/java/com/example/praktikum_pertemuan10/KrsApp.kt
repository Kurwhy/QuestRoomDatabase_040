package com.example.praktikum_pertemuan10

import android.app.Application
import com.example.praktikum_pertemuan10.dependeciesinjection.ContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp // fungsinya untuk minyimpan instance
    override fun onCreate() {


        super.onCreate()
        containerApp = ContainerApp(this) // membuat instance ContainerApp
        // instance adalah objek yang dibuat dari class
    }
}