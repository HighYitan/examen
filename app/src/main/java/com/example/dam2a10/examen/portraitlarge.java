package com.example.dam2a10.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class portrait extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portraitlarge);

    }


    int count=0;


    public void onClick4(View view) {
        count++;
    }
    public void onClick5(View view) {
        TextView text=(TextView)findViewById(R.id.texto2);
        text.setText(count);
    }
    public void onClick6(View view) {
        count = 0;
        TextView text=(TextView)findViewById(R.id.texto2);
        text.setText("0");
    }
}