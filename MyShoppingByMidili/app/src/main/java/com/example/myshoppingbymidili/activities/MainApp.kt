package com.example.myshoppingbymidili.activities

import android.app.Application
import com.example.myshoppingbymidili.db.MainDataBase

class MainApp : Application(){
    val database by lazy{ MainDataBase.getDataBase(this)}
}