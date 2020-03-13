package com.mvs.montresormenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPage = (RelativeLayout)findViewById(R.id.mainPage);

        mainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Тык");
//                Intent homeIntent = new Intent(MainActivity.this, Home.class);
//                startActivity(homeIntent);
//                finish();
            }
        });


    }
}
