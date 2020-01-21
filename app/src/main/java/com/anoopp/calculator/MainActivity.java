package com.anoopp.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    public void Login(View view) {

        String user = username.getText().toString();
        String pass = password.getText().toString();

        if(user.equals("anoop") && pass.equals("12345")) {

            Intent i = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(i);
            finish();
        }
        else
        {
            Toast.makeText(MainActivity.this,"Please Give a valid Details",Toast.LENGTH_SHORT).show();

        }
    }
}
