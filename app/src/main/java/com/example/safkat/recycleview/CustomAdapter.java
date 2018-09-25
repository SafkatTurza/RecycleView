package com.example.safkat.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<TourPlanList> tourPlanLists;

    public CustomAdapter(Context context, ArrayList<TourPlanList> tourPlanLists) {
        this.context = context;
        this.tourPlanLists = tourPlanLists;
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {

        TourPlanList tourPlanList = tourPlanLists.get(position);
        holder.travelDestinationTV.setText(tourPlanList.getTravelDestination());
        holder.estimatedBudgetTv.setText(tourPlanList.getEstimatedBudget());
        holder.fromDateTV.setText(tourPlanList.getFromDate());
        holder.toDateTV.setText(tourPlanList.getToDate());

    }

    @Override
    public int getItemCount() {
        return tourPlanLists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView travelDestinationTV;
        TextView estimatedBudgetTv;
        TextView fromDateTV;
        TextView toDateTV;


        public MyViewHolder(View itemView) {
            super(itemView);

            travelDestinationTV = itemView.findViewById(R.id.travel_destinationTV);
            estimatedBudgetTv = itemView.findViewById(R.id.estimated_budgetTV);
            fromDateTV = itemView.findViewById(R.id.fromDate_TV);
            toDateTV = itemView.findViewById(R.id.toDate_TV);


        }
    }
    public void updateData(ArrayList<TourPlanList> tourPlanLists)
    {
        this.tourPlanLists = tourPlanLists;
        notifyDataSetChanged();
    }
}
