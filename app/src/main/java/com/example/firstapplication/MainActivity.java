 package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int Count = 0;
    Random rand = new Random();
    public int ranNum = rand.nextInt(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Ori, what's 2 + 2?");

    }

    public void onLeftBClick(View v) {
        Log.d("onLeftBClick", "Clicked");
        Count++;
        String ph = Integer.toString(Count);
        EditText edName = findViewById(R.id.Number);
        edName.setText(ph);


    }
    public void onRightBClick (View v){
        Log.d("onRightBClick", "Clicked");
        Count--;
        String ph1 = Integer.toString(Count);
        EditText edName1 = findViewById(R.id.Number);
        edName1.setText(ph1);
    }
    public void check (View v){
        EditText edName1 = findViewById(R.id.Number);
        String ph1 = Integer.toString(Count);
        if (Count == ranNum) {
            Toast.makeText(this, ph1, Toast.LENGTH_SHORT).show();
            edName1.setText(ph1);
        }
    }
    public void restart (View v){
        EditText edName1 = findViewById(R.id.Number);
        Count = 0;
        String ph1 = Integer.toString(Count);
        ranNum = rand.nextInt(10);
        edName1.setText(ph1);
    }
    public void Random (View v){
        EditText edName1 = findViewById(R.id.Number);
        Count = 0;
        String ph1 = Integer.toString(Count);
        ranNum = rand.nextInt(10);
        edName1.setText(ph1);
    }
    public void Random2 (View v){
        EditText edName1 = findViewById(R.id.Number);
        Count = 0;
        String ph1 = Integer.toString(Count);
        ranNum = rand.nextInt(50);
        edName1.setText(ph1);
    }
    public void Random3 (View v){
        EditText edName1 = findViewById(R.id.Number);
        Count = 0;
        String ph1 = Integer.toString(Count);
        ranNum = rand.nextInt(100);
        edName1.setText(ph1);
    }
    public void doNothing(){
        print("do nothing");
    }

}