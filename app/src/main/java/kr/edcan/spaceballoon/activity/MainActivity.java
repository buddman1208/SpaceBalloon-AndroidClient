package kr.edcan.spaceballoon.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import app.akexorcist.bluetotohspp.library.BluetoothSPP;
import app.akexorcist.bluetotohspp.library.BluetoothState;
import app.akexorcist.bluetotohspp.library.DeviceList;
import kr.edcan.spaceballoon.R;
import kr.edcan.spaceballoon.utils.SpaceBalloonHelper;
import kr.edcan.spaceballoon.utils.SpaceBalloonService;

public class MainActivity extends AppCompatActivity {

    BluetoothSPP bluetoothSPP;
    SpaceBalloonService service;

    @Override
    protected void onStart() {
        super.onStart();
        bluetoothSPP = new BluetoothSPP(MainActivity.this);
        if (!bluetoothSPP.isBluetoothAvailable()) {
            Toast.makeText(MainActivity.this, "Bluetooth is Not Available this time", Toast.LENGTH_SHORT).show();
        } else {
            bluetoothSPP.startService(BluetoothState.DEVICE_OTHER);
            startActivityForResult(new Intent(getApplicationContext(), DeviceList.class), BluetoothState.REQUEST_CONNECT_DEVICE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        service = SpaceBalloonHelper.getServiceInstance();
        setBluetooth();
    }

    private void setBluetooth() {

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bluetoothSPP.stopService();
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == BluetoothState.REQUEST_CONNECT_DEVICE) {
            if (resultCode == Activity.RESULT_OK)
                bluetoothSPP.connect(data);
        } else if (requestCode == BluetoothState.REQUEST_ENABLE_BT) {
            if (resultCode == Activity.RESULT_OK) {
                bluetoothSPP.setupService();
                bluetoothSPP.startService(BluetoothState.DEVICE_ANDROID);
                setup();
            } else {
                Toast.makeText(MainActivity.this, "No Device Selected", Toast.LENGTH_SHORT).show();
                // Do something if user doesn't choose any device (Pressed back)
            }
        }

    }

    private void setup() {
        bluetoothSPP.setOnDataReceivedListener(new BluetoothSPP.OnDataReceivedListener() {
            @Override
            public void onDataReceived(byte[] data, String message) {
                Log.e("asdf", message);
            }
        });
    }
}