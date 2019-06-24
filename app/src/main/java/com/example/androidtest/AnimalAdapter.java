package com.example.androidtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

public class AnimalAdapter extends BaseAdapter {
    private LinkedList<Animal> data;
    private Context context;

    public AnimalAdapter(LinkedList<Animal> data, Context context){
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount(){
        return data.size();
    }

    @Override
    public Object getItem(int position){
        return null;
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        convertView = LayoutInflater.from(context).inflate(R.layout.item_list_animal,parent,false);

        ImageView icon = (ImageView)convertView.findViewById(R.id.icon);
        icon.setBackgroundResource(data.get(position).getIcon());

        TextView name = (TextView)convertView.findViewById(R.id.name);
        name.setText(data.get(position).getName());

        TextView speak = (TextView)convertView.findViewById(R.id.speak);
        speak.setText(data.get(position).getSpeak());

        return convertView;
    }
}
