package com.example.listy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends ArrayAdapter<Miejsca> {
    Context context;
    int layoutId;
    Miejsca dane[];

    public MainActivity2(@NonNull Context context, int layoutId, Miejsca[] dane) {
        super(context, layoutId, dane);
        this.context = context;
        this.layoutId = layoutId;
        this.dane = dane;
    }

    static class MiejscaHolder{
        ImageView imageView;
        TextView textView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        MiejscaHolder holder = null;
        if(view == null) {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            view = inflater.inflate(layoutId,parent,false);
            holder = new MiejscaHolder();
            holder.imageView = view.findViewById(R.id.imageView);
            holder.textView = view.findViewById(R.id.textView);

            view.setTag(holder);
        }
        else {
            holder = (MiejscaHolder) view.getTag();
        }
        holder.textView.setText(dane[position].getMiejsce());
        holder.imageView.setImageResource(dane[position].getIdObrazka());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity3.class);
                intent.putExtra("miejsce", dane[position].getMiejsce());
                intent.putExtra("obrazekId", dane[position].getIdObrazka());
                context.startActivity(intent);
            }
        });
        return view;
    }
}