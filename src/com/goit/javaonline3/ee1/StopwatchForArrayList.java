package com.goit.javaonline3.ee1;

import java.util.ArrayList;

/**
 * Created by vbazylevych on 8/9/2016.
 */
public class StopwatchForArrayList {

    private static String countAverageArrayListPopulation(int numbersOfElements){
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            Populate.populateArrayList(numbersOfElements);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Long.toString(sum/100);
    }

    private static String countAverageArrayListAdd(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newArrayList.add(100500);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newArrayList.remove(numbersOfElements);
        }

        return Long.toString(sum/100);
    }

    private static String countAverageArrayListGet(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newArrayList.get(numbersOfElements - 1);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Long.toString(sum/100);
    }

    private static String countAverageArrayListRemoving(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newArrayList.remove(numbersOfElements - 1);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newArrayList.add(100500);
        }

        return Long.toString(sum/100);
    }

    private static String countAverageArrayListContains(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        long sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newArrayList.contains(100500);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Long.toString(sum/100);
    }

    private static String countAverageArrayListIteratorAdd(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newArrayList.add(numbersOfElements, 100500);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newArrayList.remove(numbersOfElements);
        }

        return Long.toString(sum/100);
    }

    public static ArrayList<String> returnallMetricsForArrayList(int numbersOfElements){
        ArrayList<String> aggregationArray = new ArrayList<>();

        aggregationArray.add("ArrayList");
        aggregationArray.add(countAverageArrayListAdd(numbersOfElements));
        aggregationArray.add(countAverageArrayListGet(numbersOfElements));
        aggregationArray.add(countAverageArrayListRemoving(numbersOfElements));
        aggregationArray.add(countAverageArrayListContains(numbersOfElements));
        aggregationArray.add(countAverageArrayListPopulation(numbersOfElements));
        aggregationArray.add(countAverageArrayListIteratorAdd(numbersOfElements));
        aggregationArray.add(countAverageArrayListRemoving(numbersOfElements));

        return aggregationArray;
    }
}
