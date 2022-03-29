package App;
import java.util.ArrayList;
import java.util.Scanner;

public class Medewerker {
    public String naam;
    public int werkTijd;
    public static ArrayList<Medewerker> MedewerkerList = new ArrayList<>();
    public static ArrayList<Integer> PadKeerList;
    
/*
    int padInter;
    int padPotjes;
    int padFris;
    int padBier;
    int padChips;
    int padWijn;
    int padCosmetica;
    int padDierenvoeding;
    int padKoek;
    int padOntbijt;
    int padDiepvries;
    int padZuivel;
    int padVVP;
    */

    public Medewerker(String naam, int werkTijd){
            this.naam = naam;
            this.werkTijd = werkTijd;
            MedewerkerList.add(this);
    }

    public void setWerkTijd(int werkTijd){
        this.werkTijd = werkTijd;
    }

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
            System.out.println("Press return to continue");
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
/*
    public void padSetup(){
        this.padInter = 0;
        this.padPotjes = 0;
    }
    */

    public void padKeer(String gewerktOpPad){

    }
}
