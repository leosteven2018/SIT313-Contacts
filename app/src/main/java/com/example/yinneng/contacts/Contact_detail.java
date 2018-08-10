package com.example.yinneng.contacts;

import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.database.ContentObservable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

/**
 * Created by yinneng on 3/08/2017.
 */

public class Contact_detail extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_detail);
    }


    public void FinishEdit(View view) {//link to MainActivity class

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
