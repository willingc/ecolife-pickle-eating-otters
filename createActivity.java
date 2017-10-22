package com.example.guest_mac.ecolife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class createActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);



        Button button2 = (Button)findViewById(R.id.send);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Hello Create Button!", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "Thank you!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(createActivity.this,MainActivity.class));
            }
        });

    }
}
