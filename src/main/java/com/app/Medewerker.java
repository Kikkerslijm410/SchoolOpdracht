package com.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Medewerker {
    public String naam;
    public double werkTijd;
    public static ArrayList <Medewerker> MedewerkerList = new ArrayList<>();
    
    public Medewerker(String naam, double werkTijd){
            this.naam = naam;
            this.werkTijd = werkTijd;
            MedewerkerList.add(this);
    }
    
    public static void setWerkTijd(IScanner scanner){
        int i = 1;
        for ( Medewerker e : Medewerker.MedewerkerList){
            System.out.println(i + ")" + e.getNaam());
            i++;
        }
        UI.KeerTerugGetal();
        System.out.println("Voer het nummer van de medewerker in om de werktijd aan te passen:");
        int medewerker = scanner.nextInt();
        UI.VoerWerktijdIn();
        double nummer = (scanner.nextDouble() * 60);
        Medewerker Heinrich = new Medewerker(MedewerkerList.get(medewerker).getNaam(), nummer);
        MedewerkerList.remove(medewerker);
        System.out.println("Medewerker " + Heinrich + " is succesvol aangepast");
    }
    
    public String getNaam(){
        return this.naam;
    }

    public static void medewerkerAdd(IScanner scanner){
        try{
            UI.VoerNaamin();
            String naam = scanner.nextLine();
            naam = naam.replace("\n", ""); 
            UI.VoerWerktijdIn();
            int nummer = (scanner.nextInt() * 60);
            scanner.nextLine();
            Medewerker medewerker = new Medewerker(naam, nummer);
            UI.toegevoegdAanLijst(medewerker.getNaam());
            UI.KeerTerugEnter();
            scanner.nextLine();
        }
        catch(Exception e){
            UI.Error("medewerkerAdd");
            System.out.println(e);
        }
    }

    public static void medewerkerDelete(IScanner scannakin){
        int counter = 1;
        for (Medewerker e : Medewerker.MedewerkerList){
            System.out.println(counter+") "+e.getNaam());
            counter++;
        }
        UI.KeerTerugGetal();
        System.out.println("Kies een medewerker:");
        int userMedewerkerChoice = scannakin.nextInt();
        scannakin.nextLine();
        if (userMedewerkerChoice > 0){
        Medewerker.MedewerkerList.remove(userMedewerkerChoice-1);
        System.out.println("Medewerker succesvol verwijderd");
        UI.KeerTerugEnter();
        scannakin.nextLine();
        }else{
            System.out.println("Deze medewerker bestaat niet of is al verwijderd.");
            Vulplanning.mainMenu(scannakin);
        }
    }
}
