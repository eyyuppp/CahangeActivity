package com.example.changeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView saveeposta,savepassword;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        savepassword=findViewById(R.id.textSavePassword);
        saveeposta=findViewById(R.id.textSaveEposta);

        Intent ıntent=getIntent();
        String eposta=ıntent.getStringExtra("eposta");
        String password=ıntent.getStringExtra("password");
        saveeposta.setText(eposta);
        savepassword.setText(password);

    }
    public void bahck(View view){
        Intent ıntent=new Intent(MainActivity2.this,MainActivity.class);

        startActivity(ıntent);
    }
}