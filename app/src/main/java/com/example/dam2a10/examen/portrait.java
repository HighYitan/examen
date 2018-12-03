package com.example.dam2a10.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class portrait extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portrait);

    }


    int count=0;


    public void onClick(View view) {
        count++;
    }
    public void onClick2(View view) {
        TextView text=(TextView)findViewById(R.id.texto);
        text.setText(count);
    }
    public void onClick3(View view) {
        count = 0;
        TextView text=(TextView)findViewById(R.id.texto);
        text.setText("0");
    }
}

