package com.timotiusoktorio.tourguide.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.timotiusoktorio.tourguide.R;
import com.timotiusoktorio.tourguide.data.Place;

import java.util.List;

class PlacesRvAdapter extends RecyclerView.Adapter<PlacesRvAdapter.ViewHolder> {

    private List<Place> mPlaces;

    PlacesRvAdapter(List<Place> places) {
        mPlaces = places;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_place, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Place place = mPlaces.get(position);
        holder.mPlaceNameTextView.setText(place.getName());
        holder.mPlaceDescriptionTextView.setText(place.getDescription());
        holder.mPlaceImageView.setImageResource(place.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return mPlaces.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mPlaceImageView;
        TextView mPlaceNameTextView;
        TextView mPlaceDescriptionTextView;

        ViewHolder(View itemView) {
            super(itemView);
            mPlaceImageView = itemView.findViewById(R.id.place_image_view);
            mPlaceNameTextView = itemView.findViewById(R.id.place_name_text_view);
            mPlaceDescriptionTextView = itemView.findViewById(R.id.place_description_text_view);
        }
    }
}