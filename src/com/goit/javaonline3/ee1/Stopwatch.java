package com.goit.javaonline3.ee1;

import com.goit.javaonline3.ee1.Populate;

import java.util.ArrayList;

/**
 * Created by vbazylevych on 8/9/2016.
 */
public class Stopwatch {
    public static long countAverageArrayListPopulation(int numbersOfElements){
        long sum = 0;

        for(int i = 0; i < 100; i++) {
            long startArrayListPopulation = System.currentTimeMillis();
            Populate.populateArrayList(numbersOfElements);
            long finishArrayListPopulation = System.currentTimeMillis();
            long linkedTime = finishArrayListPopulation - startArrayListPopulation;
            sum = sum + linkedTime;
        }

        return sum/100;
    }

    public static long countAverageArrayListAdd(int numbersOfElements){
        ArrayList<Integer> newArrayList = Populate.populateArrayList(numbersOfElements);
        long sum = 0;

        for(int i = 0; i < 100; i++) {
            long startArrayListPopulation = System.currentTimeMillis();
            newArrayList.add(100500);
            long finishArrayListPopulation = System.currentTimeMillis();
            long linkedTime = finishArrayListPopulation - startArrayListPopulation;
            System.out.println(linkedTime);
            sum = sum + linkedTime;
            newArrayList.remove(numbersOfElements);
        }

        return sum/100;
    }
}
