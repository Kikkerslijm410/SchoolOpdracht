package App;

import java.util.ArrayList;
import java.util.Scanner;

public class Medewerker {
    public String naam;
    public int werkTijd;
    public static ArrayList <Medewerker> MedewerkerList = new ArrayList<>();
    public ArrayList <Integer> PadKeerList;

    int padInter;
    int padPotjes;
    int padFrisdrank;
    int padBier;
    int padCosmetica;
    int padDierenvoeding;
    int padKoek;
    int padOntbijt;
    int padDiepvries;
    int padZuivelVVP;
    
    public Medewerker(String naam, int werkTijd){
            this.naam = naam;
            this.werkTijd = werkTijd;
            MedewerkerList.add(this);
            this.padSetup();
    }

    public void padSetup(){
        this.PadKeerList.add(padInter); 
        this.PadKeerList.add(padPotjes);
        this.PadKeerList.add(padFrisdrank);
        this.PadKeerList.add(padBier);
        this.PadKeerList.add(padCosmetica);
        this.PadKeerList.add(padDierenvoeding);
        this.PadKeerList.add(padKoek);
        this.PadKeerList.add(padOntbijt);
        this.PadKeerList.add(padZuivelVVP);
    }

    /*
    public static void setWerkTijd(Scanner scanner){
        for ( Medewerker e : Medewerker.MedewerkerList){
            int i = 1;
            System.out.println(i + ")" + e.getNaam());
            i++;
        }
        System.out.println("0) Terug naar het hoofdmenu");
        System.out.println("Voor de naam van de medewerker in om deze aan te passen:");
        String naam = scanner.nextLine();
        System.out.println("Geef de nieuwe werktijd:");
        int nummer = scanner.nextInt();
        naam.werkTijd(nummer);
    }

    public void setWerkTijd(int werkTijd){
        this.werkTijd = werkTijd;
    }
    */

    public String getNaam(){
        return this.naam;
    }

    public static void medewerkerAdd(Scanner scanner){
        try{
            System.out.println ("Voer de voor- en achternaam in:");
            String naam = scanner.nextLine();
            naam = naam.replace("\n", ""); 
            System.out.println("Voer de werktijd in:");
            int nummer = scanner.nextInt();
            scanner.nextLine();
            Medewerker medewerker = new Medewerker(naam, nummer);
            System.out.println(medewerker.getNaam() + " is toegevoegd aan de medewerker lijst.");
            System.out.println("Press enter to continue");
            scanner.nextLine();
        }
        catch(Exception e){
            System.out.println("Medewerker kon niet toegevoegd worden");
            System.out.println(e);
        }
    }

    public static void medewerkerDelete(Scanner scanner){
        int counter = 1;
        for (Medewerker e : Medewerker.MedewerkerList){
            System.out.println(counter+") "+e.getNaam());
            counter++;
        }
        System.out.println("0) Terug naar het hoofdmenu");
        System.out.println("Kies een medewerker:");
        int userMedewerkerChoice = scanner.nextInt();
        scanner.nextLine();
        if (userMedewerkerChoice > 0){
        Medewerker.MedewerkerList.remove(userMedewerkerChoice-1);
        System.out.println("Medewerker succesvol verwijderd");
        System.out.println("druk op enter om terug te gaan naar het menu");
        scanner.nextLine();
        }else{
            System.out.println("Deze medewerker bestaat niet of is al verwijderd.");
            Vulplanning.mainMenu(scanner);
        }
    }

    public void padKeer(String gewerktOpPad){

    }
}
