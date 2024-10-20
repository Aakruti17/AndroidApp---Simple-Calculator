package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import static java.lang.Thread.sleep;


public class SplashActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        Thread thread = new Thread();
        public void run(){
            try{
                sleep();
            }
            catch(Exception e){

            }
            finally{
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }
    }

    private void startActivity(Intent intent) {
    }

    private void sleep() {
    }

    ; thread.start();
}