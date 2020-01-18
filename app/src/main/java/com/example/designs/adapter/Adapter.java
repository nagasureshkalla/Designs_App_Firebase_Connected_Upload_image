package com.example.designs.adapter;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.designs.R;
import com.example.designs.model.Data;
import com.google.firebase.firestore.DocumentReference;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<String> list;
    private int rowLayout;
    private Context context;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout moviesLayout;
        TextView id;
        ImageView ic;


        public ViewHolder(View v) {
            super(v);
            id = v.findViewById(R.id.id);
            ic=v.findViewById(R.id.ic);

        }
    }

    public Adapter(List<String> list,int rowLayout, Context context) {
        this.list=list;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.id.setText(list.get(position).toString());
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/designs-85fa1.appspot.com/o/avengers%2Fironman.png?alt=media&token=091ce814-f2c3-4078-8658-7dafdd797983").into(holder.ic);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
