package com.example.koushik.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private int flag;
    String a;
    MyData M;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flag = 0;
        TextView myFirstView;
        myFirstView = findViewById(R.id.textView);
        a = (String) myFirstView.getText();
        String yo = "Hey Bitch";
        M = new MyData();
        M.setA(yo);
    }
    public void myfirstclick(View v)
    {

}
