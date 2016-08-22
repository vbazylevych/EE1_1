package com.goit.javaonline3.ee1;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;

/**
 * Created by vbazylevych on 8/18/2016.
 */
public class StopwatchForTreeSet {
    
    public static String countAverageTreeSetPopulation(int numbersOfElements){
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            Populate.populateTreeSet(numbersOfElements);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Double.toString(sum/100);
    }

    public static String countAverageTreeSetAdd(int numbersOfElements){
        TreeSet<Integer> newTreeSet = Populate.populateTreeSet(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newTreeSet.add(100500);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newTreeSet.remove(numbersOfElements);
        }

        return Double.toString(sum/100);
    }

    public static String countAverageTreeSetRemoving(int numbersOfElements){
        TreeSet<Integer> newTreeSet = Populate.populateTreeSet(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newTreeSet.remove(numbersOfElements - 1);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newTreeSet.add(100500);
        }

        return Double.toString(sum/100);
    }

    public static String countAverageTreeSetContains(int numbersOfElements){
        TreeSet<Integer> newTreeSet = Populate.populateTreeSet(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newTreeSet.contains(100500);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Double.toString(sum/100);
    }

    public static ArrayList<String> returnallMetricsForTreeSet(int numbersOfElements){
        ArrayList<String> aggregationArray = new ArrayList<>();

        aggregationArray.add("Treeset");
        aggregationArray.add(countAverageTreeSetAdd(numbersOfElements));
        aggregationArray.add("");
        aggregationArray.add(countAverageTreeSetRemoving(numbersOfElements));
        aggregationArray.add(countAverageTreeSetContains(numbersOfElements));
        aggregationArray.add(countAverageTreeSetPopulation(numbersOfElements));
        aggregationArray.add("");
        aggregationArray.add("");

        return aggregationArray;
    }
}
