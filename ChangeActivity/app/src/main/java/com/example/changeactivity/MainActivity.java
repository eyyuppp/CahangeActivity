package com.example.changeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eposta,password;
    String gmail,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eposta=findViewById(R.id.textEposta);
        password=findViewById(R.id.edittextPasword);

    }
    public void save(View view){
        Intent ıntent =new Intent(MainActivity.this,MainActivity2.class);
        gmail=eposta.getText().toString();
        number=password.getText().toString();
        ıntent.putExtra("eposta",gmail);
        ıntent.putExtra("password",number);
        startActivity(ıntent);
    }

}