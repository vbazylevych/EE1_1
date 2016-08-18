package com.goit.javaonline3.ee1;

import java.util.ArrayList;
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

    public static ArrayList<String> returnallMetricsForLinkedList(int numbersOfElements){
        ArrayList<String> aggregationArray = new ArrayList<>();

        aggregationArray.add(countAverageLinkedListAdd(numbersOfElements));
        aggregationArray.add(countAverageLinkedListGet(numbersOfElements));
        aggregationArray.add(countAverageLinkedListRemoving(numbersOfElements));
        aggregationArray.add(countAverageLinkedListContains(numbersOfElements));
        aggregationArray.add(countAverageLinkedListPopulation(numbersOfElements));
        aggregationArray.add(countAverageLinkedListIteratorAdd(numbersOfElements));
        aggregationArray.add("");

        return aggregationArray;
    }

}
