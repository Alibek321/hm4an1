package com.geektech.hm4an1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView textView,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textt);
        text2 = findViewById(R.id.text23);
        MusicModel model = (MusicModel) getIntent().getSerializableExtra("text");

        if (model != null) {
            textView.setText(model.getName());
            text2.setText(model.getSinger());
        }else {
            Toast.makeText(this, "FAILURE", Toast.LENGTH_SHORT).show();
        }
    }
}