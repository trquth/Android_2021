package com.example.androidforbeginner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BroadcastSimple extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Broadcast Receiver", "Run here!!!🎧🎧🎧🎧🎧🎧🎧🎧🎧");

        boolean isAirPlaneState = intent.getBooleanExtra("state",false);
        if (isAirPlaneState == true){
            Toast.makeText(context,"Airplane ON",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(context,"Airplane OFF",Toast.LENGTH_LONG).show();
        }
    }
}
