package com.example.safkat.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleView extends AppCompatActivity {

    private ArrayList<TourPlanList> tourPlanLists;
    public CustomAdapter adapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview);

//        recyclerView = findViewById(R.id.recycleView);
//        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
//        recyclerView.setLayoutManager(manager);
//        recyclerView.setAdapter(adapter);
//
//        tourPlanLists = new ArrayList<>();
//        adapter=new CustomAdapter(this, tourPlanLists);
//
//        Intent intent = getIntent();
//        String travelDestination = intent.getStringExtra("Travel Destination");
//        String estimatedBudget = intent.getStringExtra("Estimated Budget");
//        String fromDate = intent.getStringExtra("Travel Destination");
//        String toDate = intent.getStringExtra("Travel Destination");
//
//        TourPlanList tourPlanList = new TourPlanList(travelDestination,estimatedBudget,fromDate,toDate);
//        tourPlanLists.add(tourPlanList);
//
//
//
//        adapter.updateData(tourPlanLists);
//
//
//    finish();



    }
}
