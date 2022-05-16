package com.app;

public class Vulplanning {

    public static void main( String[] args){
        ScannerV3 scannakin = new ScannerV3();
        mainMenu(scannakin);
    }

    //mainMenu
    public static void mainMenu(IScanner scannakin) {
        UI.clearScreen();
        mainMenuLoop: while (true) {
            UI.printMainMenu();
            int chooseAction = scannakin.nextInt();
            UI.KeerTerugEnter();
            scannakin.nextLine();
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
                        Medewerker.werkTijdAdd(scannakin);
                        UI.clearScreen();
                        break;
                    /*
                    case (8):
                        UI.clearScreen();

                        UI.clearScreen();
                        break; */
                    case(0):
                        UI.Exit();
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
        
        private static void maakPlanning() {
        if(Pad.checkVracht() && Medewerker.checkMedewerkers() && Pad.checkVulnorm()) {
            System.out.println("gefeliciteerd alles is in orde");
        }
        if (!Medewerker.checkMedewerkers()){
            UI.geenMedewerkers();
        }
        if (!Pad.checkVulnorm()){
            UI.geenVulnorm();
        }
        if (!Pad.checkVracht()){
            UI.geenVracht();
        }
            //https://www.geeksforgeeks.org/how-to-write-data-into-excel-sheet-using-java/
        }
}
