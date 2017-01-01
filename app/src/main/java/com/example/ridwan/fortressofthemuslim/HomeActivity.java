package com.example.ridwan.fortressofthemuslim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.ridwan.fortressofthemuslim.mDetail.AllDuaActivity;

public class HomeActivity extends AppCompatActivity {

    ImageView AllDuaIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AllDuaIcon = (ImageView) findViewById(R.id.AllDuaIcon);

        AllDuaIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewAcitivty = new Intent(HomeActivity.this, AllDuaActivity.class);
                startActivity(intentLoadNewAcitivty);
            }
        });


    }

}
