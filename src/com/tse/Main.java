package com.tse;

public class Main {

    public static void main(String[] args) {

        SalesRepresentatives[] rep = {new SalesRepresentatives("Sorin", 30, 50),
                new SalesRepresentatives("Ionut", 20, 25),
                new SalesRepresentatives("Ioana", 80, 80),
                new SalesRepresentatives("Georgel", 200, 50)};


        for(int i=0;i<rep.length-1;i++){
            for(int j=0;j<rep.length-i-1;j++){
                if(rep[j].totalSales() < rep[j+1].totalSales()){
                    SalesRepresentatives temp = rep[j];
                    rep[j] = rep[j+1];
                    rep[j+1] = temp;

                }
            }
        }

        for(int i=0;i<rep.length;i++){
            System.out.println(rep[i].totalSales());
        }

    }
}

