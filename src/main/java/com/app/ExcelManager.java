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
        XSSFSheet spreadsheet = workbook.createSheet(" Vulplanning ");
        System.out.println("Workbook completed");
        // creating a row object
        XSSFRow row;
        // This data needs to be written (Object[])
        Map<String, Object[]> Vulplanning = new TreeMap<>();
        Vulplanning.put("1", new Object[] {});
        Vulplanning.put("2", new Object[] { "", "Totale:", "Vultijd:", vultijdTotaal(), "Vracht:", vrachtTotaal()  });
        Vulplanning.put("3", new Object[] { "", "Medewerkers:", "Paden", "Vracht", "Vultijd" });
  
        Vulplanning.put("4", new Object[] { "130", "Mohan", "2nd year" });
  
        Vulplanning.put("5", new Object[] { "131", "Radha", "2nd year" });

        Vulplanning.put("6", new Object[] { "hallo", "", "" });

        Vulplanning.put("7", new Object[] { "hallo dit is een nieuwe zin", "Gopal", "2nd year" });
  
  
        Set<String> keyid = Vulplanning.keySet();
  
        int rowid = 0;
  
        // writing the data into the sheets...
        for (String key : keyid) {
            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = Vulplanning.get(key);
            int cellid = 0;
            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
            }
        }
        //Stuff for saving the Excel file        
        String dir = System.getProperty("user.dir")+"\\data\\";
        FileOutputStream out = new FileOutputStream(new File(dir+"Vulplanning.xlsx"));
        workbook.write(out);
        out.close();
    }

    public static int vultijdTotaal (){
        int counter = 0;
        for (Pad e : Pad.PadList){
            int i = e.getAantalDozen() / e.getVulnorm() * 60;
            counter += i;
        }
        return counter;
    }

    public static int vrachtTotaal (){
        int counter = 0;
        for (Pad e : Pad.PadList){
            counter += e.getAantalDozen();
        }
        return counter;
    }

    public static String vultijd (String padNaam){
        for (Pad e : Pad.PadList){
            if(padNaam.equals(e.getPadNaam())){
                int i = e.getAantalDozen() / e.getVulnorm() * 60;
                return "" + i;
            }
        }
        return "Error";
    }

    public static String intToString(int getal){
        return "" + getal;
    }
}