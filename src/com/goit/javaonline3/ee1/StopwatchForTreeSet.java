package com.goit.javaonline3.ee1;

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
            newTreeSet.remove(numbersOfElements);
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

    public static Map<String, String> returnallMetricsForTreeSet(int numbersOfElements){
        Map<String, String> aggregationMap = new TreeMap<>();

        aggregationMap.put("add", countAverageTreeSetAdd(numbersOfElements));
        aggregationMap.put("get", "");
        aggregationMap.put("remove", countAverageTreeSetRemoving(numbersOfElements));
        aggregationMap.put("contains", countAverageTreeSetContains(numbersOfElements));
        aggregationMap.put("populate", countAverageTreeSetPopulation(numbersOfElements));
        aggregationMap.put("iterator.add", "");
        aggregationMap.put("iterator.remove", "");

        return aggregationMap;
    }
}
