package com.tse;

public class SalesRepresentatives {
    private String name;
    private int sales;
    private int quota;

    public SalesRepresentatives(String name, int sales, int quota) {
        this.name = name;
        this.sales = sales;
        this.quota = quota;
    }

    public int totalSales(){
        return sales * quota;
    }

    public String getName() {
        return name;
    }
}
