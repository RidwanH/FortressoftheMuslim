package com.example.ridwan.fortressofthemuslim.mDetail;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ridwan.fortressofthemuslim.R;

public class DuaDetailActivity extends AppCompatActivity {

    TextView nameTxt, transTxt, arabTxt;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //INITIALIZE VIEWS
        nameTxt = (TextView) findViewById(R.id.nameTxtDetail);

        transTxt = (TextView) findViewById(R.id.trans);
        arabTxt = (TextView) findViewById(R.id.arabic);


        //RECEIVE DATA
        Intent i = this.getIntent();
        String name = i.getExtras().getString("NAME_KEY");
        String duaTransliteration = i.getExtras().getString("TRANS_KEY");
        String arabicD = i.getExtras().getString("ARAB_KEY");
        int image = i.getExtras().getInt("IMAGE_KEY");

        //BIND DATA
        nameTxt.setText(name);

        transTxt.setText(duaTransliteration);
        arabTxt.setText(arabicD);

    }
}
