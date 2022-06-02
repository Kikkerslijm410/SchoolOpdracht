package com.app;

import java.io.IOException;

public class Vulplanning {

    //mainMenu
    public static void mainMenu(IScanner scannakin) throws IOException {
        //loads all Gson files
        GsonManager.loadAllFiles();
        UI.clearScreen();

        //starts the main program
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
                        Medewerker.getMedewerkers2(scannakin);
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
    }
}
