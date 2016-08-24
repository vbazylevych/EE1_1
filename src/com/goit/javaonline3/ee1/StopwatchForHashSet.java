package com.goit.javaonline3.ee1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by vbazylevych on 8/18/2016.
 */
public class StopwatchForHashSet {

    public static String countAverageHashSetPopulation(int numbersOfElements){
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            Populate.populateHashSet(numbersOfElements);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Long.toString(sum/100);
    }

    public static String countAverageHashSetAdd(int numbersOfElements){
        HashSet<Integer> newHashSet = Populate.populateHashSet(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newHashSet.add(100500);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newHashSet.remove(numbersOfElements);
        }

        return Long.toString(sum/100);
    }

    public static String countAverageHashSetRemoving(int numbersOfElements){
        HashSet<Integer> newHashSet = Populate.populateHashSet(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newHashSet.remove(numbersOfElements - 1);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newHashSet.add(100500);
        }

        return Long.toString(sum/100);
    }

    public static String countAverageHashSetContains(int numbersOfElements){
        HashSet<Integer> newHashSet = Populate.populateHashSet(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newHashSet.contains(100500);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Long.toString(sum/100);
    }

    public static ArrayList<String>  returnallMetricsForHashSet(int numbersOfElements){
        ArrayList<String> aggregationArray = new ArrayList<>();

        aggregationArray.add("HashSet");
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
