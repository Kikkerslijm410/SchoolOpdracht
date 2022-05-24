package com.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class ExcelManager {

    public static void Start() throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet(" Student Data ");
        System.out.println("I work");

        // creating a row object
        XSSFRow row;
  
        // This data needs to be written (Object[])
        Map<String, Object[]> studentData = new TreeMap<String, Object[]>();
  
        studentData.put("1", new Object[] { "Roll No", "NAME", "Year" });
  
        studentData.put("2", new Object[] { "126", "Aditya", "2nd year" });
  
        studentData.put("3", new Object[] { "129", "Narayana", "2nd year" });
  
        studentData.put("4", new Object[] { "130", "Mohan", "2nd year" });
  
        studentData.put("5", new Object[] { "131", "Radha", "2nd year" });

        studentData.put("6", new Object[] { "", "", "" });
  
        studentData.put("7", new Object[] { "132", "Gopal", "2nd year" });
  
        Set<String> keyid = studentData.keySet();
  
        int rowid = 0;
  
        // writing the data into the sheets...
  
        for (String key : keyid) {
  
            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = studentData.get(key);
            int cellid = 0;
  
            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
            }
        }
        
        String dir = System.getProperty("user.dir")+"\\data\\";
        FileOutputStream out = new FileOutputStream(
            new File(dir+"Vulplanning.xlsx"));
        workbook.write(out);
        out.close();
    }
}


