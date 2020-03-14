package com.mvs.montresormenu.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mvs.montresormenu.Interface.ItemClickListener;
import com.mvs.montresormenu.R;

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtFoodName;
    public ImageView imageView;

    private ItemClickListener itemClickListener;

    public FoodViewHolder(View itemView) {
        super(itemView);

        txtFoodName = itemView.findViewById(R.id.food_name);
        imageView = itemView.findViewById(R.id.food_image);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onClick(view, getAdapterPosition(), false);
    }

}
