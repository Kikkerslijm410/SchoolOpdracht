package com.app;

import com.GsonManager;

public class Vulplanning {

    public static void main(String[] args){
        ScannerV3 scannakin = new ScannerV3();
        mainMenu(scannakin);
    }

    //mainMenu
    public static void mainMenu(IScanner scannakin) {
        GsonManager.loadFile();
        //UI.clearScreen();

        mainMenuLoop: while (true) {
            UI.printMainMenu();
            int chooseAction = scannakin.nextInt();
            try {
                switch (chooseAction) {
                    case (1):
                        UI.clearScreen();
                        maakPlanning();
                        UI.clearScreen();
                        break;
                    case (2):
                        UI.clearScreen();
                        Medewerker.getMedewerkers(scannakin);
                        UI.clearScreen();
                        break;
                    case (3):
                        UI.clearScreen();
                        Medewerker.medewerkerAdd(scannakin);
                        UI.clearScreen();
                        break;
                    case (4):
                        UI.clearScreen();
                        Medewerker.medewerkerDelete(scannakin);
                        UI.clearScreen();
                        break;
                    case (5):
                        UI.clearScreen();
                        Pad.vrachtAdd(scannakin);
                        UI.clearScreen();
                        break;
                    case (6):
                        UI.clearScreen();
                        Pad.vulnormAdd(scannakin);
                        UI.clearScreen();
                        break;
                    case (7):
                        UI.clearScreen();
                        Medewerker.werktijdAdd(scannakin);
                        UI.clearScreen();
                        break;
                    /*
                    case (8):
                        UI.clearScreen();

                        UI.clearScreen();
                        break; */
                    case(0):
                        UI.Exit();
                        GsonManager.saveFile();
                        break mainMenuLoop;
                    default:
                        UI.clearScreen();
                        UI.OnjuisteOptie();
                        UI.clearScreen();
                        break;
                }
            } catch (Exception e) {
                UI.Error("Vulplanning");
                System.out.println(e);
            }
        }
    }
        
    public static void maakPlanning() {
            //https://www.geeksforgeeks.org/how-to-write-data-into-excel-sheet-using-java/
            //https://howtodoinjava.com/java/library/json-simple-read-write-json-examples/
            //https://howtodoinjava.com/gson/gson-installation-maven-gradle-jar/
    }
}
