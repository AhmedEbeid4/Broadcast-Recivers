package com.example.broadcastrecivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneMOdeEnabled = intent?.getBooleanExtra("state",false) ?: return
        if(isAirplaneMOdeEnabled){
            Toast.makeText(context,"Airplane Mode enabled",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context,"Airplane Mode disabled",Toast.LENGTH_SHORT).show()
        }
    }
}