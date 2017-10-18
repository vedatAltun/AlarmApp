package com.example.zanyar.alarm;

import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] days = new int[]{Calendar.FRIDAY, Calendar.MONDAY};


    }

    // alarm application hide if you want to use this code you can delete /* */ and click AndroidManifest.xml to move  activity  intent filter into main activity
 /*   public void createAlarm(String message, int hour,int minutes,int [] days,boolean vibrate, boolean skipui){
        Intent intent =new Intent (AlarmClock.ACTION_SET_ALARM);
        getIntent().putExtra(AlarmClock.EXTRA_MESSAGE,message);
        getIntent().putExtra(AlarmClock.EXTRA_HOUR,hour);
        getIntent().putExtra(AlarmClock.EXTRA_MINUTES,minutes);
        getIntent().putExtra(AlarmClock.EXTRA_DAYS,days);
        getIntent().putExtra(AlarmClock.EXTRA_VIBRATE,vibrate);
        getIntent().putExtra(AlarmClock.EXTRA_SKIP_UI,skipui);

        if (getIntent().resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
            //resolve activity, intentlerin uygulama içinde kesilmesini önler
        }}*/

}

