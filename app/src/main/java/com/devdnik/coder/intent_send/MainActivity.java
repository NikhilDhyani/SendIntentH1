package com.devdnik.coder.intent_send;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


//Some Random Stuff ignore it.
public class MainActivity extends AppCompatActivity {

    Button button;

    //Creating an intent

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Send intent",Toast.LENGTH_LONG).show();
            }
        });
    }
}
