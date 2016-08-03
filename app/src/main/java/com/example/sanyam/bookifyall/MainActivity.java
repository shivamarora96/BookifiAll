package com.example.sanyam.bookifyall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //TODO...Add Tabbed Layout + Navigation Drawer  +  Fragment According to Api


        Custom_Fragment custom_fragment = new Custom_Fragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.framelayout_container , custom_fragment).commit();




    }
}
