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
        ArrayList<Integer> NewArrayList = new ArrayList();

        for(int i = 0; i < numberOfElements; i++) {
            NewArrayList.add(i);
        }
        return NewArrayList;
    }

    public static LinkedList<Integer> populateLinkedList(int numberOfElements){
        LinkedList<Integer> NewLinkedList = new LinkedList<>();

        for(int i = 0; i < numberOfElements; i++){
            NewLinkedList.add(i);
        }
        return  NewLinkedList;
    }

    public static HashSet<Integer> populateHashSet(int numberOfElements){
        HashSet<Integer> NewHashSet = new HashSet<>();

        for(int i = 0; i < numberOfElements; i++){
            NewHashSet.add(i);
        }
        return NewHashSet;
    }

    public static TreeSet<Integer> populateTreeSet(int numberOfElements){
      TreeSet<Integer> NewTreeSet = new TreeSet<>();

        for(int i = 0; i < numberOfElements; i++){
            NewTreeSet.add(i);
        }
        return NewTreeSet;
    }
}
