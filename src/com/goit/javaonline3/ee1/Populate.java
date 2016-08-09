package com.goit.javaonline3.ee1;

import java.util.ArrayList;

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
}
