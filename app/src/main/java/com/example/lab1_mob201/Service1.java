package com.example.lab1_mob201;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;



public class Service1 extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String ten = intent.getStringExtra("ten");
        String ma = intent.getStringExtra("ma");
        Toast.makeText(this, "Tên SV: "+ten + "Mã SV: "+ ma, Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        System.out.println("đã dừng");
        super.onDestroy();
    }
}
