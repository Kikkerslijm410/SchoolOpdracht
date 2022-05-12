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
                        getMedewerkers();
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
                        
                        UI.clearScreen();
                        break;
                    case (7):
                        UI.clearScreen();
                        //Medewerker.setWerkTijd(Kaaskoekje);
                        UI.clearScreen();
                        break;
                    case (8):
                        UI.clearScreen();
                        
                        UI.clearScreen();
                        break;
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
        if(checkVracht() && checkMedewerkers() && checkVulnorm()) {

        }
        if (!checkMedewerkers()){
            UI.geenMedewerkers();
        }
        if (!checkVulnorm()){
            UI.geenVulnorm();
        }
        if (!checkVracht()){
            UI.geenVracht();
        }
            //https://www.geeksforgeeks.org/how-to-write-data-into-excel-sheet-using-java/
        }

    public static boolean checkVracht() {
        if (Pad.padDiepvries.getAantalDozen() == 0){
            return false;
        }
        return true;
    }

    private static boolean checkMedewerkers() {
        return true;
    }

    private static boolean checkVulnorm() {
        if (Pad.padDiepvries.getVulnorm() == 0){
            return false;
        }
        return true;
    }

    private static void getMedewerkers() {
            for (Medewerker e : Medewerker.MedewerkerList) {
                System.out.println(e.getNaam());
            }
        }
}
