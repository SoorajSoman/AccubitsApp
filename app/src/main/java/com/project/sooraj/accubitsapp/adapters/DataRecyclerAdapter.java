package com.project.sooraj.accubitsapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.project.sooraj.accubitsapp.R;
import com.project.sooraj.accubitsapp.model.Datum;


import java.util.List;

/**
 * Created by skynet on 6/24/18.
 */

public class DataRecyclerAdapter extends RecyclerView.Adapter<DataRecyclerAdapter.ProfileViewHolder> {
    List<Datum> eventList;
    Context context;

    public DataRecyclerAdapter(List<Datum> list, Context context) {
        this.eventList = list;
        this.context = context;
    }


    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_single, parent, false);

        return new ProfileViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ProfileViewHolder holder, int position) {
        final Datum datum = eventList.get(position);

        if (!checkNull(datum.getName())) {
            holder.name.setText(datum.getName());
        } else
            holder.name.setText("Lorem Ipsum");

        if (!checkNull(datum.getGame())) {
            holder.description.setText(datum.getGame());
        } else
            holder.description.setText("Lorem Ipsum");


    }

    private boolean checkNull(String input) {
        if (TextUtils.isEmpty(input)) {
            return true;

        }
        return false;
    }


    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder {
        ImageView profile, largeImage;
        TextView description, name;
        LinearLayout divSection;

        public ProfileViewHolder(View itemView) {
            super(itemView);
            description = (TextView) itemView.findViewById(R.id.description);
            name = (TextView) itemView.findViewById(R.id.username);


        }
    }

}
