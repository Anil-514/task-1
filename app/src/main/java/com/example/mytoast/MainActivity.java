package com.example.mytoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button countButton;
    private Button toastButton;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countButton= findViewById(R.id.btn_count);
        toastButton= findViewById(R.id.Btn_toast);
        textView= findViewById(R.id.count_text);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_LONG).show();
            }
        });

        countButton.setOnClickListener(new View.OnClickListener() {
            private int count;

            @Override
            public void onClick(View v) {
                count++;
                Log.d("MainActivity",""+count);
                textView.setText(""+count);
            }
        });
    }
}