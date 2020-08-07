package com.tse;

public class SalesRepresentatives {

    private String name;
    private int sales;
    private int quota;

    public SalesRepresentatives() {
    }

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

    public SalesRepresentatives[] sortedReps(SalesRepresentatives[] objectArray){
        for(int i=0;i<objectArray.length-1;i++){
            for(int j=0;j<objectArray.length-i-1;j++){
                if(objectArray[j].totalSales() < objectArray[j+1].totalSales()){
                    SalesRepresentatives temp = objectArray[j];
                    objectArray[j] = objectArray[j+1];
                    objectArray[j+1] = temp;
                }
            }
        }
        return objectArray;
    }


}
