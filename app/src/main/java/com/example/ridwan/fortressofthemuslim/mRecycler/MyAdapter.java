package com.example.ridwan.fortressofthemuslim.mRecycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Toast;

import com.example.ridwan.fortressofthemuslim.mData.Dua;
import com.example.ridwan.fortressofthemuslim.mDetail.DetailActivity;
import com.example.ridwan.fortressofthemuslim.R;

import java.util.ArrayList;

/**
 * Created by Ridwan on 01/01/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {


    Context c;
    ArrayList<Dua> duas, filterList;
    CustomFilter filter;


    public MyAdapter(Context c, ArrayList<Dua> duas) {
        this.c = c;
        this.duas = duas;
        this.filterList=duas;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        final String name=duas.get(position).getName();
        final String duaTransliteration=duas.get(position).getDuaTransliteration();
        final String arabicD=duas.get(position).getArabicD();
        final int image=duas.get(position).getImage();

        //BIND DATA
        holder.nameTxt.setText(name);
        holder.img.setImageResource(image);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                openDetailActivity(name,image,duaTransliteration,arabicD);
                Toast.makeText(c,name,Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return duas.size();
    }

    //RETURN FILTER OBJ

    public Filter getFilter() {
        if(filter==null)
        {
            filter=new CustomFilter(filterList,this);
        }

        return filter;
    }

    private void openDetailActivity(String name, int image, String arabicD, String duaTransliteration)
    {
        Intent i=new Intent(c, DetailActivity.class);

        //PACK DATA TO SEND
        i.putExtra("NAME_KEY",name);
        i.putExtra("IMAGE_KEY",image);
        i.putExtra("TRANS_KEY",duaTransliteration);
        i.putExtra("ARAB_KEY",arabicD);

        //open activity
        c.startActivity(i);

    }
}
