import java.util.ArrayList;
import java.util.Scanner;

public class Medewerker {
    String naam;
    int werkTijd;
    public static ArrayList<Medewerker> MedewerkerList;
    
    /*
    ff hiernaar kijken hoe dit het beste aangegeven kan worden misschien aparte class
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

    public static void newStudent(Scanner scanner){
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

}
