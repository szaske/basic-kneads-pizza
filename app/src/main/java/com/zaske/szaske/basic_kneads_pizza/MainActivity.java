package com.zaske.szaske.basic_kneads_pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
// import android.widget.ImageView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.common.util.UriUtil;

//import java.net.URI;

import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declare our variables
    private Button mFindRestaurantsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(intent);
            }
        });
        //Initialize Fresco
//        Fresco.initialize(this);
//
//        final int resourceId = R.drawable.placeholder;
//        final Uri uri = UriUtil.getUriForResourceId(resourceId);
//        // Uri uri = Uri.parse("res:///background");
//        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
//        draweeView.setImageURI(uri);

//        //Initialize the ImageView
//        backgroundView = (ImageView) findViewById(R.id.bgView);
//
//        //Load image into view
//        Picasso.with(this)
//                .load(R.drawable.background)
//                .into(backgroundView);
    }
}
