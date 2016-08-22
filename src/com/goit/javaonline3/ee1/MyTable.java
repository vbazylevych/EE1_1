package com.goit.javaonline3.ee1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by vbazylevych on 8/15/2016.
 */
public class MyTable {

    public static void createGUI( String[][] dataTable, String header) {
        JFrame frame = new JFrame(header);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                "  ",
                "add",
                "get",
                "remove",
                "contains",
                "populate",
                "iterator.add",
                "iterator.remove"
        };

        JTable table = new JTable(dataTable, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(750, 150));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void createTable(int numbersOfElements){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI(createDataTable(numbersOfElements), "Table for " + numbersOfElements + " elements");
            }
        });
    }

    public static String[][] createDataTable(int numbersOfElements){
        String[][] dataTable = new String[4][8];
        ArrayList<String> currentArrayList = StopwatchForArrayList.returnallMetricsForArrayList(numbersOfElements);
        ArrayList<String> currentLinkedList = StopwatchForLinkedList.returnallMetricsForLinkedList(numbersOfElements);
        ArrayList<String> currentHashSet = StopwatchForHashSet.returnallMetricsForHashSet(numbersOfElements);
        ArrayList<String> currentTreeSet = StopwatchForTreeSet.returnallMetricsForTreeSet(numbersOfElements);

        for (int i = 0; i < 8; i++) {
            dataTable[0][i] = currentArrayList.get(i);
        }

        for (int i = 0; i < 8; i++) {
            dataTable[1][i] = currentLinkedList.get(i);
        }

        for (int i = 0; i < 8; i++) {
            dataTable[2][i] = currentHashSet.get(i);
        }

        for (int i = 0; i < 8; i++) {
            dataTable[3][i] = currentTreeSet.get(i);
        }

        return dataTable;
    }

}
