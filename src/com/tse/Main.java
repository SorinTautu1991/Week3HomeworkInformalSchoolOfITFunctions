package com.tse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SalesRepresentatives[] rep = {new SalesRepresentatives("Sorin", 30, 50),
                new SalesRepresentatives("Ionut", 20, 25),
                new SalesRepresentatives("Ioana", 80, 80),
                new SalesRepresentatives("Georgel", 200, 50)};


        SalesRepresentatives objectResult = new SalesRepresentatives();

        SalesRepresentatives[] result = objectResult.sortedReps(rep);
        for(int i=0;i<result.length;i++){
            System.out.println("The folowing sales representative: " + result[i].getName() + " has made sales of :  " + result[i].totalSales());
        }
        System.out.println("Results are already sorted in descending order using a bubbleSorting Algorithm!!!");

        }



}





