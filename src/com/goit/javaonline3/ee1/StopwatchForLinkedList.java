package com.goit.javaonline3.ee1;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vbazylevych on 8/18/2016.
 */
public class StopwatchForLinkedList {
    
    public static String countAverageLinkedListPopulation(int numbersOfElements){
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            Populate.populateLinkedList(numbersOfElements);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Double.toString(sum/100);
    }

    public static String countAverageLinkedListAdd(int numbersOfElements){
        LinkedList<Integer> newLinkedList = Populate.populateLinkedList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newLinkedList.add(100500);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newLinkedList.remove(numbersOfElements);
        }

        return Double.toString(sum/100);
    }

    public static String countAverageLinkedListGet(int numbersOfElements){
        LinkedList<Integer> newLinkedList = Populate.populateLinkedList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newLinkedList.get(numbersOfElements);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Double.toString(sum/100);
    }

    public static String countAverageLinkedListRemoving(int numbersOfElements){
        LinkedList<Integer> newLinkedList = Populate.populateLinkedList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newLinkedList.remove(numbersOfElements);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newLinkedList.add(100500);
        }

        return Double.toString(sum/100);
    }

    public static String countAverageLinkedListContains(int numbersOfElements){
        LinkedList<Integer> newLinkedList = Populate.populateLinkedList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newLinkedList.contains(100500);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Double.toString(sum/100);
    }

    public static String countAverageLinkedListIteratorAdd(int numbersOfElements){
        LinkedList<Integer> newLinkedList = Populate.populateLinkedList(numbersOfElements);
        double sum = 0;

        for(int i = 0; i < 100; i++) {
            long startTask = System.currentTimeMillis();
            newLinkedList.add(numbersOfElements, 100500);
            long finishTask = System.currentTimeMillis();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newLinkedList.remove(numbersOfElements);
        }

        return Double.toString(sum/100);
    }

    public static Map<String, String> returnallMetricsForLinkedList(int numbersOfElements){
        Map<String, String> aggregationMap = new HashMap<>();

        aggregationMap.put("add", countAverageLinkedListAdd(numbersOfElements));
        aggregationMap.put("get", countAverageLinkedListGet(numbersOfElements));
        aggregationMap.put("remove", countAverageLinkedListRemoving(numbersOfElements));
        aggregationMap.put("contains", countAverageLinkedListContains(numbersOfElements));
        aggregationMap.put("populate", countAverageLinkedListPopulation(numbersOfElements));
        aggregationMap.put("iterator.add", countAverageLinkedListIteratorAdd(numbersOfElements));
        aggregationMap.put("iterator.remove", "");

        return aggregationMap;
    }

}
