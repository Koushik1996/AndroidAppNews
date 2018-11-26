package com.example.koushik.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private int flag;
    String a;
    MyData M;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ksk","HEy Creating the activity");
        setContentView(R.layout.activity_main);
        flag = 0;
        TextView myFirstView;
        myFirstView = findViewById(R.id.textView);
        a = (String) myFirstView.getText();
        String yo = "Hey Bitch";
        M = new MyData();
        M.setA(yo);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ksk","HEy Starting the activity");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i("ksk","HEy ReStarting the activity");
    }
    @Override
    protected void onPause()
    {
        Log.i("ksk","HEy Pausing the activity");
        super.onPause();

    }

    @Override
    protected void onStop()
    {
        Log.i("ksk","HEy Stoping the activity");
        super.onStop();

    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i("ksk","HEy Destroying the activity");
    }
    public void myfirstclick(View v)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
