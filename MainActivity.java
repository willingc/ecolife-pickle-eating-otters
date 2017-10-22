package com.example.guest_mac.ecolife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.btn_gps);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Hello Create Button!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,DataInput.class
                ));
            }
        });

        Button button2 = (Button)findViewById(R.id.Create_Profile);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Hello Create Button!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,createActivity.class
                ));
            }
        });


    }
}





/* Android Methods */
// onCreate
// onStart
// onResume
// onPause
// onStop
// onDestroy