package com.example.services;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    TextView t1;
   static MainActivity x;


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView);
        x=this;

   }





public void  play_m(View v){ startService(new Intent(this,Back.class)); }
public void pause_m(View v){ stopService(new Intent(this,Back.class)); }

public static MainActivity getInstance() { return x; }

public void change_text(String x)
{
    t1.setTextColor(getResources().getColor(R.color.green));
   t1.setText(x);
}
    public void change_default(String x)
    {
        t1.setTextColor(getResources().getColor(R.color.red));
        t1.setText(x);

    }










}

