package com.example.rajan.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rajan on 2/20/2016.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Viewholder> {

    private ArrayList<Contect_info> mArrayList;
    CustomAdapter(ArrayList<Contect_info> mArrayList){
        this.mArrayList=mArrayList;
    }
    @Override
    public CustomAdapter.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        return new CustomAdapter.Viewholder(view);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.Viewholder holder, int position) {


        Contect_info c=mArrayList.get(position);
        holder.vName.setText(c.name);
        holder.vSurname.setText(c.surname);
        holder.vEmail.setText(c.email);
        holder.vTitle.setText(c.name+" "+c.surname);
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        protected TextView vName;
        protected TextView vSurname;
        protected TextView vEmail;
        protected TextView vTitle;

        public Viewholder(View v) {
            super(v);
            vName =  (TextView) v.findViewById(R.id.txtName);
            vSurname = (TextView)  v.findViewById(R.id.txtSurname);
            vEmail = (TextView)  v.findViewById(R.id.txtEmail);
            vTitle = (TextView) v.findViewById(R.id.title);
        }
    }
}
