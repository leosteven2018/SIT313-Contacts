package com.example.yinneng.contacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter; //Create an array to store data for invoke.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.ContactsPeople);//edit the listView to connect to the screen.

        ArrayList<String> arrayCount = new ArrayList<>();
        arrayCount.addAll(Arrays.asList(getResources().getStringArray(R.array.array_p)));
        adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrayCount);
        lv.setAdapter(adapter);


    }

    public void GoTOContactDetail(View view) {//Link to the contact detail class
        Intent intent = new Intent(this, Contact_detail.class);
        startActivity(intent);
    }

}





