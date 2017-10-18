package com.example.zanyar.alarm;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;

public class timer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        // createAlarm("alarm Deneme",2,5,days,true,false);
        startTimer("yarışBaşlıyor", 5, false);
    }

    public void startTimer(String message, int length, boolean skipui) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER);

        intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
        intent.putExtra(AlarmClock.EXTRA_LENGTH, length);
        intent.putExtra(AlarmClock.EXTRA_SKIP_UI, skipui);


        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
            //resolve activity, intentlerin uygulama içinde kesilmesini önler
        }
    }
}
