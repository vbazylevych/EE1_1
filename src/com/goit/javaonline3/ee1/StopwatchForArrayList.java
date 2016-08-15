package com.goit.javaonline3.ee1;

import com.goit.javaonline3.ee1.Populate;

import java.util.ArrayList;

/**
 * Created by vbazylevych on 8/9/2016.
 */
public class StopwatchForArrayList {
    public static double countAverageArrayListPopulation(int numbersOfElements){
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            Populate.populateArrayList(numbersOfElements);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return sum/100;
    }

    public static double countAverageArrayListAdd(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newArrayList.add(100500);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newArrayList.remove(numbersOfElements);
        }

        return sum/100;
    }

    public static double countAverageArrayListGet(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newArrayList.get(numbersOfElements);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return sum/100;
    }

    public static double countAverageArrayListRemoving(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newArrayList.remove(numbersOfElements);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newArrayList.add(100500);
        }

        return sum/100;
    }

    public static double countAverageArrayListContains(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newArrayList.contains(100500);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return sum/100;
    }

    public static double countAverageArrayListIteratorAdd(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newArrayList.add(numbersOfElements, 100500);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newArrayList.remove(numbersOfElements);
        }

        return sum/100;
    }

   // public static ArrayList<Double> returnallMetricsForarrayList(int numbersOfElements){



   // }
}
