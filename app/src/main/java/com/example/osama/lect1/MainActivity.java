package com.example.osama.lect1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //define id
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step 2 define by id
        Button b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hello, from NZU CS3", Toast.LENGTH_LONG).show();
            }
        });
    }

    //public void onclick(View view) {
        //Toast.makeText(getApplicationContext(), "Hello, from NZU CS3", Toast.LENGTH_LONG).show();
    //}
}
