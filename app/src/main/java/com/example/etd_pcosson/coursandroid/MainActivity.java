package com.example.etd_pcosson.coursandroid;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.tv_hello_world);
        textView.setText("bonjour");

        final DatePickerDialog dpd= new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                textView.setText("Date "+i+"/"+i1+"/"+i2);
            }
        },2016,11,07);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dpd.show();
            }
        });

       // Button bt = (Button) findViewById(R.id.button);
        //bt.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //  public void onClick(View view) {

            //}
       // });

    }

    public void notification() {

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!");

        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(this.NOTIFICATION_SERVICE);

        mNotificationManager.notify(1, mBuilder.build());
    }

    public void bt_click(View v){
        Intent intent= new Intent(this,SecondeActivity.class);
        Toast txt = Toast.makeText(getApplicationContext(), "J'ai cliqué", Toast.LENGTH_LONG);
        txt.show();
        notification();
        startActivity(intent);


    }
}