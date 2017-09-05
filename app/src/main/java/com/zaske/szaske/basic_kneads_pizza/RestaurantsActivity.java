package com.zaske.szaske.basic_kneads_pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RestaurantsActivity extends AppCompatActivity {
    private TextView mZipCodeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        mZipCodeTextView = (TextView) findViewById(R.id.zipCodeTextView);

        //get Intent data
        Intent intent = getIntent();
        String intentZipCode = intent.getStringExtra("zipCode");

        //Set textView text to intent string
        mZipCodeTextView.setText("Here are all the restaurants in: " + intentZipCode);
    }
}
