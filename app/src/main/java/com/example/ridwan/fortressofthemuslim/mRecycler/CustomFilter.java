package com.example.ridwan.fortressofthemuslim.mRecycler;

import android.widget.Filter;

import com.example.ridwan.fortressofthemuslim.mData.Dua;

import java.util.ArrayList;

/**
 * Created by Ridwan on 01/01/2017.
 */

public class CustomFilter extends Filter {

    MyAdapter adapter;
    ArrayList<Dua> filterList;


    public CustomFilter(ArrayList<Dua> filterList,MyAdapter adapter)
    {
        this.adapter=adapter;
        this.filterList=filterList;

    }

    //FILTERING OCURS
    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results=new FilterResults();

        //CHECK CONSTRAINT VALIDITY
        if(constraint != null && constraint.length() > 0)
        {
            //CHANGE TO UPPER
            constraint=constraint.toString().toUpperCase();
            //STORE OUR FILTERED PLAYERS
            ArrayList<Dua> filteredPlayers=new ArrayList<>();

            for (int i=0;i<filterList.size();i++)
            {
                //CHECK
                if(filterList.get(i).getName().toUpperCase().contains(constraint))
                {
                    //ADD PLAYER TO FILTERED PLAYERS
                    filteredPlayers.add(filterList.get(i));
                }
            }

            results.count=filteredPlayers.size();
            results.values=filteredPlayers;
        }else
        {
            results.count=filterList.size();
            results.values=filterList;

        }


        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {

        adapter.duas= (ArrayList<Dua>) results.values;

        //REFRESH
        adapter.notifyDataSetChanged();
    }
}


