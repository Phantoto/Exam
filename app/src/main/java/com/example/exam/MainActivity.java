package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioButton second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        second = (RadioButton) findViewById(R.id.radioButtonsecond);
    }
public void Second(View view){
    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
    startActivity(intent);
}
}