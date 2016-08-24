package com.goit.javaonline3.ee1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by vbazylevych on 8/18/2016.
 */
public class StopwatchForLinkedList {
    
    public static String countAverageLinkedListPopulation(int numbersOfElements){
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            Populate.populateLinkedList(numbersOfElements);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Long.toString(sum/100);
    }

    public static String countAverageLinkedListAdd(int numbersOfElements){
        LinkedList<Integer> newLinkedList = Populate.populateLinkedList(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newLinkedList.add(100500);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newLinkedList.remove(numbersOfElements);
        }

        return Long.toString(sum/100);
    }

    public static String countAverageLinkedListGet(int numbersOfElements){
        LinkedList<Integer> newLinkedList = Populate.populateLinkedList(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newLinkedList.get(numbersOfElements - 1);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Long.toString(sum/100);
    }

    public static String countAverageLinkedListRemoving(int numbersOfElements){
        LinkedList<Integer> newLinkedList = Populate.populateLinkedList(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newLinkedList.remove(numbersOfElements - 1);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newLinkedList.add(100500);
        }

        return Long.toString(sum/100);
    }

    public static String countAverageLinkedListContains(int numbersOfElements){
        LinkedList<Integer> newLinkedList = Populate.populateLinkedList(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newLinkedList.contains(100500);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
        }

        return Long.toString(sum/100);
    }

    public static String countAverageLinkedListIteratorAdd(int numbersOfElements){
        LinkedList<Integer> newLinkedList = Populate.populateLinkedList(numbersOfElements);
        long sum = 0;

        for (int i = 0; i < 100; i++) {
            long startTask = System.nanoTime();
            newLinkedList.add(numbersOfElements, 100500);
            long finishTask = System.nanoTime();
            long lagTime = finishTask - startTask;
            sum = sum + lagTime;
            newLinkedList.remove(numbersOfElements);
        }

        return Long.toString(sum/100);
    }

    public static ArrayList<String> returnallMetricsForLinkedList(int numbersOfElements){
        ArrayList<String> aggregationArray = new ArrayList<>();

        aggregationArray.add("LinkedList");
        aggregationArray.add(countAverageLinkedListAdd(numbersOfElements));
        aggregationArray.add(countAverageLinkedListGet(numbersOfElements));
        aggregationArray.add(countAverageLinkedListRemoving(numbersOfElements));
        aggregationArray.add(countAverageLinkedListContains(numbersOfElements));
        aggregationArray.add(countAverageLinkedListPopulation(numbersOfElements));
        aggregationArray.add(countAverageLinkedListIteratorAdd(numbersOfElements));
        aggregationArray.add(countAverageLinkedListRemoving(numbersOfElements));

        return aggregationArray;
    }

}
