package com.example.myfirsttextjosue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView myTextView =(TextView) findViewById(R.id.etiqueta);
        setContentView(R.layout.activity_main);
    }
}
