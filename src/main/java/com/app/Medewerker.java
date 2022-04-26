package com.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Medewerker {
    public String naam;
    public int werkTijd;
    public static ArrayList <Medewerker> MedewerkerList = new ArrayList<>();
    
    public Medewerker(String naam, int werkTijd){
            this.naam = naam;
            this.werkTijd = werkTijd;
            MedewerkerList.add(this);
    }
    
    public static void setWerkTijd(Scanner scanner){
        for ( Medewerker e : Medewerker.MedewerkerList){
            int i = 1;
            System.out.println(i + ")" + e.getNaam());
            i++;
        }
        System.out.println("0) Terug naar het hoofdmenu");
        System.out.println("Voer het nummer van de medewerker in om de werktijd aan te passen:");
        int medewerker = scanner.nextInt();
        System.out.println("Geef de nieuwe werktijd:");
        int nummer = scanner.nextInt();
        Medewerker Heinrich = new Medewerker(MedewerkerList.get(medewerker).getNaam(), nummer);
        MedewerkerList.remove(medewerker);
        System.out.println("Medewerker " + Heinrich + " is succesvol aangepast");
    }
    
    public String getNaam(){
        return this.naam;
    }

    public static void medewerkerAdd(ScannerV3 scannakin){
        try{
            System.out.println ("Voer de voor- en achternaam in:");
            String naam = scannakin.nextLine();
            naam = naam.replace("\n", ""); 
            System.out.println("Voer de werktijd in:");
            int nummer = scannakin.nextInt();
            scannakin.nextLine();
            Medewerker medewerker = new Medewerker(naam, nummer);
            System.out.println(medewerker.getNaam() + " is toegevoegd aan de medewerker lijst.");
            System.out.println("Press enter to continue");
            scannakin.nextLine();
        }
        catch(Exception e){
            System.out.println("Medewerker kon niet toegevoegd worden");
            System.out.println(e);
        }
    }

    public static void medewerkerDelete(ScannerV3 scannakin){
        int counter = 1;
        for (Medewerker e : Medewerker.MedewerkerList){
            System.out.println(counter+") "+e.getNaam());
            counter++;
        }
        System.out.println("0) Terug naar het hoofdmenu");
        System.out.println("Kies een medewerker:");
        int userMedewerkerChoice = scannakin.nextInt();
        scannakin.nextLine();
        if (userMedewerkerChoice > 0){
        Medewerker.MedewerkerList.remove(userMedewerkerChoice-1);
        System.out.println("Medewerker succesvol verwijderd");
        System.out.println("druk op enter om terug te gaan naar het menu");
        scannakin.nextLine();
        }else{
            System.out.println("Deze medewerker bestaat niet of is al verwijderd.");
            Vulplanning.mainMenu(scannakin);
        }
    }
}
