package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view){
        //username

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        //password
        //EditText passwordEditText = (EditText) findViewById(R.id.editTextTextPassword);
        Log.i("Username", editTextTextPersonName.getText().toString());
        Toast.makeText(MainActivity.this,editTextTextPersonName.getText().toString()+"...",Toast.LENGTH_LONG).show();
       // Log.i("Password",passwordEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}