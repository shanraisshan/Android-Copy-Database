package com.adt.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Shayan Rais (http://shanraisshan.com)
 * created on 1/2/2017
 */

public class AdapterCategories extends RecyclerView.Adapter<AdapterCategories.ForecastAdapterViewHolder> {

    private ArrayList<String> categories;

    private final AdapterOnClickHandler mClickHandler;

    public interface AdapterOnClickHandler {
        void onClick(String categoryName);
    }

    public AdapterCategories(AdapterOnClickHandler clickHandler) {
        mClickHandler = clickHandler;
    }

    //______________________________________________________________________________________________
    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder implements OnClickListener {
        final TextView tvCategory;

        ForecastAdapterViewHolder(View view) {
            super(view);
            tvCategory = (TextView) view.findViewById(android.R.id.text1);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int adapterPosition = getAdapterPosition();
            String categoryName = categories.get(adapterPosition);
            mClickHandler.onClick(categoryName);
        }
    }

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = android.R.layout.simple_list_item_1;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new ForecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder forecastAdapterViewHolder, int position) {
        String categoryName = categories.get(position);
        forecastAdapterViewHolder.tvCategory.setText(categoryName);
    }

    @Override
    public int getItemCount() {
        if (null == categories) return 0;
        return categories.size();
    }

    //______________________________________________________________________________________________
    public void setCategory(ArrayList<String> _categories) {
        categories = _categories;
        notifyDataSetChanged();
    }
}