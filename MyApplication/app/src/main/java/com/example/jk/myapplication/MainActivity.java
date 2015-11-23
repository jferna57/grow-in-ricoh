package com.example.jk.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            EditText name = (EditText) findViewById(R.id.nameText);

            if (name.length() > 0) {

                String message = "Hello " + name.getText().toString();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(MainActivity.this, "Please introduce your name", Toast.LENGTH_SHORT).show();
            }

        }
        });
    }
}ju
