package com.guru99.bank.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil {
    public static String getData(String filePath, int sheetIndex, int rowIndex, int cellIndex) {
        String data = "";
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(sheetIndex);
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(cellIndex);
            data = cell.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}

