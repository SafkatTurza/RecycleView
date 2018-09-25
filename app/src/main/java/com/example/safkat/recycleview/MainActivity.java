package com.example.safkat.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import static com.example.safkat.recycleview.R.layout.recycleview;

public class MainActivity extends AppCompatActivity {

    private EditText mTravelDestinationET;
    private EditText mEstimatedBudgetET;
    private EditText mFromDateET;
    private EditText mToDateET;
    private Button mCreateBTN;

    String travelDestination;
    String estimatedBudget;
    String fromDate;
    String toDate;
    ArrayList<TourPlanList> tourPlanLists;
    CustomAdapter adapter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTravelDestinationET = findViewById(R.id.travel_destinationET);
        mEstimatedBudgetET = findViewById(R.id.estimated_budgetET);
        mFromDateET = findViewById(R.id.from_dateET);
        mToDateET = findViewById(R.id.to_dateET);
        mCreateBTN = findViewById(R.id.createBTN);


        recyclerView = findViewById(R.id.recycleView);
        tourPlanLists = new ArrayList<>();
        adapter=new CustomAdapter(MainActivity.this, tourPlanLists);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);


        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

       mCreateBTN.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               travelDestination = mTravelDestinationET.getText().toString();
               estimatedBudget = mEstimatedBudgetET.getText().toString();
               fromDate = mFromDateET.getText().toString();
               toDate = mToDateET.getText().toString();

               TourPlanList tourPlanList = new TourPlanList(travelDestination,estimatedBudget,fromDate,toDate);
               tourPlanLists.add(tourPlanList);
               adapter.updateData(tourPlanLists);

//               Intent intent = new Intent(MainActivity.this,RecyclerView.class);
//               intent.putExtra("Travel Destination", travelDestination);
//               intent.putExtra("Estimated Budget", estimatedBudget);
//               intent.putExtra("From Date", fromDate);
//               intent.putExtra("To Date", toDate);
//               startActivity(intent);

           }
       });


    }

}
