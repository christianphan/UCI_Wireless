package com.uci.wirelessdatatranser;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by chris on 8/22/17.
 */

public class BluetoothReceiver extends BroadcastReceiver {


    BluetoothAdapter mBluetoothAdapter;


    @Override
    public void onReceive(Context context, Intent intent) {

        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        String action = intent.getAction();

        if(action.equals(mBluetoothAdapter.ACTION_STATE_CHANGED)){
            final int state = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE, mBluetoothAdapter.ERROR);

            switch(state){
                case BluetoothAdapter.STATE_OFF:
                    Log.d("Main_Activity", "State_Off");
                    break;
                case BluetoothAdapter.STATE_TURNING_OFF:
                    Log.d("Main_Activity", "State_TURNING_OFF");
                    break;
                case BluetoothAdapter.STATE_ON:
                    Log.d("Main_Activity", "State_On");
                    break;
                case BluetoothAdapter.STATE_TURNING_ON:
                    Log.d("Main_Activity", "State_TURNING_ON");
                    break;
            }

        }

    }
}
