package com.example.etd_pcosson.coursandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView= (TextView)findViewById(R.id.tv_hello_world);
        textView.setText("bonjour");



        Button bt= (Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast txt=Toast.makeText(getApplicationContext(),"J'ai cliqué",Toast.LENGTH_LONG);
                txt.show();
            }
        });

    }
}
