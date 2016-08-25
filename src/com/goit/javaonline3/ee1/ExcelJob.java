package com.goit.javaonline3.ee1;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import java.io.File;
import java.io.IOException;

/**
 * Created by vbazylevych on 8/24/2016.
 */
public class ExcelJob {
    private static WritableWorkbook workbook;
    public static WritableSheet sheet;

    public static void exelSet() {

        try {
            workbook = Workbook.createWorkbook(new File("Result.xls"));
            sheet = workbook.createSheet("Result", 0);
            writeToExcel();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            workbook.write();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }

    }

    private static void writeToExcel() {
        String[] columnName = {"", "add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove"};

        for (int i = 0; i < columnName.length; i++) {
            Label cell = new Label(i, 0, columnName[i]);
            try {
                sheet.addCell(cell);
            } catch (RowsExceededException e) {
                e.printStackTrace();
            } catch (WriteException e) {
                e.printStackTrace();
            }
        }
    }
}
