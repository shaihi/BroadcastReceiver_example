package com.shaihi.broadcastreceiver_example;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);
        if (isAirplaneModeOn) {
            Log.d("MyBroadcastReceiver", "Airplane mode is ON");
        } else {
            Log.d("MyBroadcastReceiver", "Airplane mode is OFF");
        }
    }
}
