package com.example.myinvestmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setProfileImage();
        Log.d("STATE", "=====CREATE STATE=====");
    }

    protected void setProfileImage() {
        ImageView imgView= (ImageView)findViewById(R.id.profileImageView);
        imgView.setImageResource(R.drawable.profile_image);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("STATE", "=====START STATE=====");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("STATE", "=====RESTART STATE=====");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("STATE", "=====PAUSE STATE=====");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("STATE", "=====STOP STATE=====");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("STATE", "=====DESTROY STATE=====");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("STATE", "=====RESUME STATE=====");
    }

    public void contactButtonClicked(View view) {
        Intent contactListIntent = new Intent(this, CustomContactPage.class);
        contactListIntent.putExtra("UserName", "I am Abhinav Kumar Santoshi");
        startActivity(contactListIntent);
    }
}


