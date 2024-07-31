package com.guru99.bank.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Util {

    public static final String FILE_PATH = "src/test/resources/testData (2).xlsx"; // File Path

    public static Object[][] getDataFromExcel(String xlFilePath, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(xlFilePath);
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rowCount - 1][colCount];
        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = cell.toString();
            }
        }
        workbook.close();
        file.close();
        return data;
    }
}

