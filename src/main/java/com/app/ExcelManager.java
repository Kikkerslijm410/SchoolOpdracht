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

    static int getal = 0;

    public static void Start() throws IOException{
        if(LeaderBoard.planningMedewerkers.size() > 0){
            Excel();
        }else{
            System.out.println("================");//Debug
            System.out.println("Workbook Error");
        }
    }

    private static void Excel() throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet(" Vulplanning ");
        XSSFRow row;
            Map<Integer, Object[]> Vulplanning = new TreeMap<Integer, Object[]>();
                Vulplanning.put(1, new Object[] {});
                Vulplanning.put(2, new Object[] { "", "Totale:", "Vultijd:", vultijdTotaal(), "Vracht:", vrachtTotaal()  });
                Vulplanning.put(3, new Object[] { "", "Ploeg:", "Paden", "Vracht", "Vultijd" });
                Vulplanning.put(4, new Object[] { "", getMedewerker(true), "Internationaal", Pad.getAantalDozenString(0), getVultijd(0)});
                Vulplanning.put(5, new Object[] {});
                Vulplanning.put(6, new Object[] {"", getMedewerker(false), "Potjes", Pad.getAantalDozenString(1), getVultijd(1)});
                Vulplanning.put(7, new Object[] {});
                Vulplanning.put(8, new Object[] {"", getMedewerker(false), "Frisdrank", Pad.getAantalDozenString(2), getVultijd(2)});
                Vulplanning.put(9, new Object[] {});
                Vulplanning.put(10, new Object[] {"", getMedewerker(false), "Bier", Pad.getAantalDozenString(3), getVultijd(3)});
                Vulplanning.put(11, new Object[] {});
                Vulplanning.put(12, new Object[] {"", getMedewerker(false), "Wijn", Pad.getAantalDozenString(4), getVultijd(4)});
                Vulplanning.put(13, new Object[] {});
                Vulplanning.put(14, new Object[] {"", getMedewerker(false), "Chips", Pad.getAantalDozenString(5), getVultijd(5)});
                Vulplanning.put(15, new Object[] {});
                Vulplanning.put(16, new Object[] {"", getMedewerker(false), "Cosmetica", Pad.getAantalDozenString(6), getVultijd(6)});
                Vulplanning.put(17, new Object[] {});
                Vulplanning.put(18, new Object[] {"", getMedewerker(false), "Dierenvoeding", Pad.getAantalDozenString(7), getVultijd(7)});
                Vulplanning.put(19, new Object[] {});
                Vulplanning.put(20, new Object[] {"", getMedewerker(false), "Koek", Pad.getAantalDozenString(8), getVultijd(8)});
                Vulplanning.put(21, new Object[] {});
                Vulplanning.put(22, new Object[] {"", getMedewerker(false), "Ontbijt", Pad.getAantalDozenString(9), getVultijd(9)});
                Vulplanning.put(23, new Object[] {});
                Vulplanning.put(24, new Object[] {"", getMedewerker(false), "Zuivel", Pad.getAantalDozenString(10), getVultijd(10)});
                Vulplanning.put(25, new Object[] {});
                Vulplanning.put(26, new Object[] {"", getMedewerker(false), "VVP", Pad.getAantalDozenString(11), getVultijd(11)});
                Vulplanning.put(27, new Object[] {});
                Vulplanning.put(28, new Object[] {"", getMedewerker(false), "Diepvries", Pad.getAantalDozenString(12), getVultijd(12)});
                Vulplanning.put(29, new Object[] {});
            Set<Integer> keyid = Vulplanning.keySet();
        int rowid = 0;
        for (Integer key : keyid) {
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
        workbook.close();
        System.out.println("================");//Debug
        System.out.println("Workbook Completed");
    }

    public static String getVultijd(int pad) {
        int werktijd = 0;
        int dozen = Pad.PadList.get(pad).getAantalDozen();
        int norm = Pad.PadList.get(pad).getVulnorm();
        werktijd = dozen / norm;
        return "" + werktijd;
    }

    public static String vultijdTotaal (){
        if (Pad.PadList.size() > 0){
            Double counter = 0.0;
            for (Pad e : Pad.PadList){
                Double x = (double) e.getAantalDozen();
                Double y = (double) e.getVulnorm();
                Double i = (x / y) * 60;
                counter += i;
            }
            return "" + counter;
        }else{
             return "-1"; //debug and testing
        }
    }

    public static String vrachtTotaal (){
        if (Pad.PadList.size() > 0){
            int counter = 0;
            for (Pad e : Pad.PadList){
                counter += e.getAantalDozen();
            }
            return "" + counter;
        }else{
             return "-1"; //debug and testing
        }
    }

    public static String getMedewerker(boolean start){
        if (start){
            getal = 1;
            return LeaderBoard.planningMedewerkers.get(0).getNaam();
        }
        if (getal >= LeaderBoard.planningMedewerkers.size() || getal == 0){
            getal = 0;
            return "-1"; //debug and testing
        }else{
            for(Medewerker e : LeaderBoard.planningMedewerkers){
                if(e.getNaam().equals(LeaderBoard.planningMedewerkers.get(getal).getNaam())){
                    getal++;
                    return e.getNaam();
                }
            }
        }
        return "Error"; //debug and testing
    }
}