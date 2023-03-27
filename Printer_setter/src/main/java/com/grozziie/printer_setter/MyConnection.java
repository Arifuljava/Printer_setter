package com.grozziie.printer_setter;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

public class MyConnection {

    public  static  void ConnectionBluetooth(Context context, String deviceMacAdress, String uuid) {
        BluetoothAdapter bluetoothAdapter;
        String deviceuuid=uuid;
        String devicemacad=deviceMacAdress;

       try {
           bluetoothAdapter= BluetoothAdapter.getDefaultAdapter();


       }catch (Exception e) {
       }

    }
}
