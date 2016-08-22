package com.goit.javaonline3.ee1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by vbazylevych on 8/9/2016.
 */
public class Populate {

    public static ArrayList<Integer> populateArrayList(int numberOfElements){
        ArrayList<Integer> newArrayList = new ArrayList();

        for (int i = 0; i < numberOfElements; i++) {
            newArrayList.add(i);
        }

        return newArrayList;
    }

    public static LinkedList<Integer> populateLinkedList(int numberOfElements){
        LinkedList<Integer> newLinkedList = new LinkedList<>();

        for (int i = 0; i < numberOfElements; i++) {
            newLinkedList.add(i);
        }

        return  newLinkedList;
    }

    public static HashSet<Integer> populateHashSet(int numberOfElements){
        HashSet<Integer> newHashSet = new HashSet<>();

        for (int i = 0; i < numberOfElements; i++) {
            newHashSet.add(i);
        }

        return newHashSet;
    }

    public static TreeSet<Integer> populateTreeSet(int numberOfElements){
        TreeSet<Integer> newTreeSet = new TreeSet<>();

        for (int i = 0; i < numberOfElements; i++) {
            newTreeSet.add(i);
        }

        return newTreeSet;
    }
}
