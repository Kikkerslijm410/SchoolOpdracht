package App;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.Scanner;

public class Vulplanning {

    private static final Scanner Scanner = null;

    public static void main( String[] args){
        Medewerker.medewerkerAdd(Scanner);
        Scanner scanner = new Scanner(System.in);
        Medewerker medewerker = new Medewerker("Lucas Clavel", 400);
        mainMenu(scanner);
        System.out.println(medewerker); //dit is tijdelijk
    }

        //mainMenu
        public static void mainMenu(Scanner Kaaskoekje) {
            clearScreen();
            mainMenuLoop: while (true) {
                printMainMenu();
                int chooseAction = Kaaskoekje.nextInt();
                Kaaskoekje.nextLine();
                try {
                    switch (chooseAction) {
                        case (1):
                            clearScreen();
                            maakPlanning();
                            clearScreen();
                            break;
                        case (2):
                            clearScreen();
                            getMedewerkers(Kaaskoekje);
                            clearScreen();
                            break;
                        case (3):
                            clearScreen();
                            Medewerker.medewerkerAdd(Kaaskoekje);
                            break;
                        case (4):
                            clearScreen();
                            Medewerker.medewerkerDelete(Kaaskoekje);
                            break;
                        case (5):
                            clearScreen();
                            
                            break;
                        case (6):
                            clearScreen();
                            
                            break;
                        case (7):
                            clearScreen();
                            
                            break;
                        case (8):
                            clearScreen();
                            ;
                            break;
                        case(0):
                            System.out.println("Saving Data.....");
                            break mainMenuLoop;
                        default:
                            System.out.println("Optie bestaat niet. Kies een juiste optie uit de lijst");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Error in the mainMenu method!");
                    System.out.println(e);
                }
            }
        }

        // clearScreen
        public static void clearScreen() {
            try {
                if (System.getProperty("os.name").contains("Windows"))
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                else
                    Runtime.getRuntime().exec("clear");
            } catch (IOException | InterruptedException ex) {}
        }
    
        // printMainMenu
        private static void printMainMenu() {
            System.out.println("1) Maak de planning");
            System.out.println("2) Lijst met medewerkers");
            System.out.println("3) Nieuwe medewerker aanmaken");
            System.out.println("4) Medewerker verwijderen");
            System.out.println("5) ");
            System.out.println("6) "); 
            System.out.println("7) ");
            System.out.println("8) ");
            System.out.println("0) Exit");
        }
        
        private static void maakPlanning() {

        }

        private static void getMedewerkers(Scanner james) {
            for (Medewerker e : Medewerker.MedewerkerList) {
                System.out.println(e.getNaam());
            }
        }
}
