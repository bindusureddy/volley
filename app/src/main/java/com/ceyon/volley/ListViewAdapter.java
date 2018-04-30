package com.ceyon.volley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Hero> {

    private List<Hero> heroList;
    private Context context;

    public ListViewAdapter(List<Hero> heroList, Context context) {
        super(context, R.layout.list_items, heroList);
        this.heroList = heroList;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //getting the layoutinflater
        LayoutInflater inflater = LayoutInflater.from(context);
        View listViewItem = inflater.inflate(R.layout.list_items,null,true);


        TextView textViewName = listViewItem.findViewById(R.id.textViewName);
        TextView textViewImage = listViewItem.findViewById(R.id.textViewImageUrl);
        Hero hero = heroList.get(position);

        textViewName .setText(hero.getName());
        textViewImage.setText(hero.getImageUrl());

  return listViewItem;

    }
}
