package com.goit.javaonline3.ee1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vbazylevych on 8/9/2016.
 */
public class StopwatchForArrayList {

    public static String countAverageArrayListPopulation(int numbersOfElements){
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            Populate.populateArrayList(numbersOfElements);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Double.toString(sum/100);
    }

    public static String countAverageArrayListAdd(int numbersOfElements){
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

        return Double.toString(sum/100);
    }

    public static String countAverageArrayListGet(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newArrayList.get(numbersOfElements);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Double.toString(sum/100);
    }

    public static String countAverageArrayListRemoving(int numbersOfElements){
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

        return Double.toString(sum/100);
    }

    public static String countAverageArrayListContains(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newArrayList.contains(100500);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Double.toString(sum/100);
    }

    public static String countAverageArrayListIteratorAdd(int numbersOfElements){
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

        return Double.toString(sum/100);
    }

    public static  Map<String, String>  returnallMetricsForArrayList(int numbersOfElements){
        Map<String, String> aggregationMap = new HashMap<>();

        aggregationMap.put("add", countAverageArrayListAdd(numbersOfElements));
        aggregationMap.put("get", countAverageArrayListGet(numbersOfElements));
        aggregationMap.put("remove", countAverageArrayListRemoving(numbersOfElements));
        aggregationMap.put("contains", countAverageArrayListContains(numbersOfElements));
        aggregationMap.put("populate", countAverageArrayListPopulation(numbersOfElements));
        aggregationMap.put("iterator.add", countAverageArrayListIteratorAdd(numbersOfElements));
        aggregationMap.put("iterator.remove", "");

        return aggregationMap;
    }
}
