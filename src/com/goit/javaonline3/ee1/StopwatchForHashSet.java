package com.goit.javaonline3.ee1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vbazylevych on 8/18/2016.
 */
public class StopwatchForHashSet {

    public static String countAverageHashSetPopulation(int numbersOfElements){
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            Populate.populateHashSet(numbersOfElements);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Double.toString(sum/100);
    }

    public static String countAverageHashSetAdd(int numbersOfElements){
        HashSet<Integer> newHashSet = Populate.populateHashSet(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newHashSet.add(100500);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newHashSet.remove(numbersOfElements);
        }

        return Double.toString(sum/100);
    }

    public static String countAverageHashSetRemoving(int numbersOfElements){
        HashSet<Integer> newHashSet = Populate.populateHashSet(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newHashSet.remove(numbersOfElements);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newHashSet.add(100500);
        }

        return Double.toString(sum/100);
    }

    public static String countAverageHashSetContains(int numbersOfElements){
        HashSet<Integer> newHashSet = Populate.populateHashSet(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newHashSet.contains(100500);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Double.toString(sum/100);
    }

    public static ArrayList<String>  returnallMetricsForHashSet(int numbersOfElements){
        ArrayList<String> aggregationArray = new ArrayList<>();

        aggregationArray.add(countAverageHashSetAdd(numbersOfElements));
        aggregationArray.add("");
        aggregationArray.add(countAverageHashSetRemoving(numbersOfElements));
        aggregationArray.add(countAverageHashSetContains(numbersOfElements));
        aggregationArray.add(countAverageHashSetPopulation(numbersOfElements));
        aggregationArray.add("");
        aggregationArray.add("");

        return aggregationArray;
    }
}
