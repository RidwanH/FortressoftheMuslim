package com.example.ridwan.fortressofthemuslim.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.ridwan.fortressofthemuslim.R;
/**
 * Created by Ridwan on 01/01/2017.
 */

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView nameTxt;
    ImageView img;
    ItemClickListener itemClickListener;

    public MyHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
        img= (ImageView) itemView.findViewById(R.id.spacecraftImage);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }
}