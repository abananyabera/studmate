package com.saptarshisamanta.myapplication.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.saptarshisamanta.myapplication.R;
import com.saptarshisamanta.myapplication.databinding.DetailsCardBinding;

import java.util.ArrayList;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.detailsHolder> {

    public Context context;
    public ArrayList<Details> detailsList;

    public DetailsAdapter(Context context, ArrayList<Details> detailsList) {
        this.context = context;
        this.detailsList = detailsList;
    }

    @NonNull
    @Override
    public detailsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        DetailsCardBinding detailsCardBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.details_card, parent, false);
        detailsHolder holder = new detailsHolder(detailsCardBinding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull detailsHolder holder, int position) {
        Details details = detailsList.get(position);
        holder.detailsCardBinding.setDetails(details);
    }

    @Override
    public int getItemCount() {
        return detailsList.size();
    }

    public static class detailsHolder extends RecyclerView.ViewHolder {

        DetailsCardBinding detailsCardBinding;

        public detailsHolder(@NonNull DetailsCardBinding itemView) {
            super(itemView.getRoot());
            detailsCardBinding = itemView;
        }
    }
}
