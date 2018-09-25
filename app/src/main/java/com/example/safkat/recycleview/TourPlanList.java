package com.example.safkat.recycleview;

public class TourPlanList {

    private String travelDestination;
    private String estimatedBudget;
    private String fromDate;
    private String toDate;

    public TourPlanList(String travelDestination, String estimatedBudget, String fromDate, String toDate) {
        this.travelDestination = travelDestination;
        this.estimatedBudget = estimatedBudget;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getTravelDestination() {
        return travelDestination;
    }

    public void setTravelDestination(String travelDestination) {
        this.travelDestination = travelDestination;
    }

    public String getEstimatedBudget() {
        return estimatedBudget;
    }

    public void setEstimatedBudget(String estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
}
