package com.goit.javaonline3.ee1;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by vbazylevych on 8/18/2016.
 */
public class StopwatchForTreeSet {
    
    private static String countAverageTreeSetPopulation(int numbersOfElements){
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            Populate.populateTreeSet(numbersOfElements);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Long.toString(sum/100);
    }

    private static String countAverageTreeSetAdd(int numbersOfElements){
        TreeSet<Integer> newTreeSet = Populate.populateTreeSet(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newTreeSet.add(100500);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newTreeSet.remove(numbersOfElements);
        }

        return Long.toString(sum/100);
    }

    private static String countAverageTreeSetRemoving(int numbersOfElements){
        TreeSet<Integer> newTreeSet = Populate.populateTreeSet(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newTreeSet.remove(numbersOfElements - 1);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newTreeSet.add(100500);
        }

        return Long.toString(sum/100);
    }

    private static String countAverageTreeSetContains(int numbersOfElements){
        TreeSet<Integer> newTreeSet = Populate.populateTreeSet(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newTreeSet.contains(100500);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Long.toString(sum/100);
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
