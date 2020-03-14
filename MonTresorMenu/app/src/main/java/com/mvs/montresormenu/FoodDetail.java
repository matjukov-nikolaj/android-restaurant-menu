package com.mvs.montresormenu;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.mvs.montresormenu.Model.Food;
import com.squareup.picasso.Picasso;

public class FoodDetail extends AppCompatActivity {

    TextView foodName;

    TextView foodPrice;

    TextView foodDescription;

    ImageView foodImage;

    CollapsingToolbarLayout collapsingToolbarLayout;

    FloatingActionButton btnCart;

    ElegantNumberButton numberButton;

    String foodId = "";

    FirebaseDatabase database;

    DatabaseReference foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);


        database = FirebaseDatabase.getInstance();
        foodList = database.getReference("Food");

        numberButton = findViewById(R.id.number_button);
//        btnCart = findViewById(R.id.btnCart);
        foodDescription = findViewById(R.id.food_description);
        foodName = findViewById(R.id.food_name);

        foodPrice = findViewById(R.id.food_price);
        foodImage = findViewById(R.id.img_food);

        collapsingToolbarLayout = findViewById(R.id.collapsing);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsingAppBar);

        if (getIntent() != null) {
            foodId = getIntent().getStringExtra("foodId");

        }
        if (foodId != null && !foodId.isEmpty()) {
            loadDetailFood(foodId);
        }

    }

    private void loadDetailFood(String foodId) {

        foodList.child(foodId).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Food food = dataSnapshot.getValue(Food.class);
                Picasso.with(getBaseContext()).load(food.getImage()).into(foodImage);
                collapsingToolbarLayout.setTitle(food.getName());
                foodPrice.setText(food.getPrice());
                foodName.setText(food.getName());
                foodDescription.setText(food.getDescription());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
