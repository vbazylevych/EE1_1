package com.goit.javaonline3.ee1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vbazylevych on 8/15/2016.
 */
public class MyTable {

    public static void createGUI( String[][] dataTable, String header) {
        JFrame frame = new JFrame(header);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                "add",
                "get",
                "remove",
                "contains",
                "iterator.add",
                "iterator.remove"
        };

        JTable table = new JTable(dataTable, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void createTable(int numbersOfElements){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                MyTable.createGUI();
            }
        });
    }

}
