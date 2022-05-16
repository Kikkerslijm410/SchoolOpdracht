package com.app;

import java.util.ArrayList;

public class Medewerker {
    public String naam;
    public double werktijd;
    public static ArrayList <Medewerker> MedewerkerList = new ArrayList<>();

    public Medewerker(String naam, double werktijd){
        this.naam = naam;
        this.werktijd = werktijd;
        MedewerkerList.add(this);
    }

    public String getNaam(){
        return this.naam;
    }

    public double getWerktijd(){
        return this.werktijd;
    }

    public void setWerktijd(double werktijd){
        this.werktijd = werktijd;
    }

    /**
     * Checkt of er medewerkers zijn
     * Bij medewerkers aanwezig worden deze uitgeprint en word er true teruggegeven
     * Bij geen medewerkers word geenMedewerkers() aangeroepen en false teruggegeven
     * @param scanner
     * @return
     */
    public static boolean getMedewerkers(IScanner scanner) {
        if(MedewerkerList.size() > 0){
            int i = 1;
            for (Medewerker e : Medewerker.MedewerkerList) {
                System.out.println(i + ") " + e.getNaam());
                i++;
            }
            UI.KeerTerugEnter();
            return true;
        }else{
            geenMedewerkers(scanner);
            return false;
        }
    }
    //Hoort bij getMedewerkers() 
    public static void geenMedewerkers(IScanner scanner) {
         System.out.println("Geen medewerkers beschikbaar om aan te passen.");
         UI.KeerTerugEnter();
         scanner.nextLine(); //just to wait for input
    }
    //Medewerker check zonder print statements
    public static boolean checkMedewerkers() {
        if (MedewerkerList.size() == 0){
            return false;
        }
        return true;
    }
    
    public static void werkTijdAdd(IScanner scanner){
        if (getMedewerkers(scanner)){
        System.out.println("Voer het nummer van de medewerker in om de werktijd aan te passen:");
        int medewerker = scanner.nextInt() - 1;
        if (medewerker >= 0) {
            UI.VoerWerktijdIn();
            double werktijd = (scanner.nextDouble() * 60);
            MedewerkerList.get(medewerker).werktijd = werktijd;
            System.out.println("Medewerker " + MedewerkerList.get(medewerker) + " is succesvol aangepast");
        }
        UI.KeerTerugEnter();
        scanner.nextLine(); //just to wait for input
        }
    }

    public static void medewerkerAdd(IScanner scanner){
        try{
            UI.VoerNaamin();
            String naam = scanner.nextLine();
            naam = naam.replace("\n", ""); 
            UI.VoerWerktijdIn();
            double nummer = (scanner.nextDouble() * 60);
            scanner.nextLine();
            Medewerker medewerker = new Medewerker(naam, nummer);
            UI.AddedToList(medewerker.getNaam());
            UI.KeerTerugEnter();
            scanner.nextLine(); //just to wait for input
        }
        catch(Exception e){
            UI.Error("medewerkerAdd");
            System.out.println(e);
        }
    }

    public static void medewerkerDelete(IScanner scanner){
        int counter = 1;
        for (Medewerker e : Medewerker.MedewerkerList){
            System.out.println(counter+") "+e.getNaam());
            counter++;
        }
        UI.KeerTerugGetal();
        System.out.println("Kies een medewerker:");
        int userMedewerkerChoice = scanner.nextInt();
        scanner.nextLine(); //just to wait for input
        if (userMedewerkerChoice > 0){
            Medewerker.MedewerkerList.remove(userMedewerkerChoice-1);
            System.out.println("Medewerker succesvol verwijderd");
            UI.KeerTerugEnter();
            scanner.nextLine();
        }else{
            System.out.println("Deze medewerker bestaat niet of is al verwijderd.");
            Vulplanning.mainMenu(scanner);
        }
    }
}
