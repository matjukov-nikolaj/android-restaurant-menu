package com.mvs.montresormenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPage = (RelativeLayout) findViewById(R.id.mainPage);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference tableCategory = database.getReference("Category");

        mainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MainActivity.this, Home.class);
                startActivity(homeIntent);
                finish();
            }
        });
    }
}
