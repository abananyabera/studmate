package com.saptarshisamanta.myapplication.data;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.saptarshisamanta.myapplication.R;
import com.saptarshisamanta.myapplication.databinding.LinkCardBinding;

import java.util.ArrayList;
import java.util.List;

public class LinksAdapter extends RecyclerView.Adapter<LinksAdapter.linkHolder> {
    List<Links> linksList;
    public OnItemClickedListener onItemClickedListener;

    public void setOnItemClickedListener(OnItemClickedListener onItemClickedListener) {
        this.onItemClickedListener = onItemClickedListener;
    }

    public interface OnItemClickedListener{
        void OnItemClicked(int position);
    }
    public LinksAdapter(ArrayList<Links> list) {
        linksList = list;
    }

    @NonNull
    @Override
    public linkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinkCardBinding linkCardBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.link_card,parent,false);

        return new linkHolder(linkCardBinding,onItemClickedListener);
    }

    @Override
    public void onBindViewHolder(@NonNull linkHolder holder, int position) {
        Links links = linksList.get(position);
        holder.linkCardBinding.setLink(links);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class linkHolder extends  RecyclerView.ViewHolder {
        LinkCardBinding linkCardBinding;
        public linkHolder(@NonNull LinkCardBinding itemView, final OnItemClickedListener onItemClickedListener) {
            super(itemView.getRoot());
            linkCardBinding = itemView;
            itemView.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickedListener.OnItemClicked(getAdapterPosition());
                }
            });
        }
    }
}
