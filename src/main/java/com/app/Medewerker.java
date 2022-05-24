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
     */
    public static void getMedewerkers(IScanner scanner) {
        if(checkMedewerkers(scanner)){
            int i = 1;
            for (Medewerker e : Medewerker.MedewerkerList) {
                System.out.println(i + ") " + e.getNaam() + e.getWerktijd());
                i++;
            }
            UI.KeerTerugEnter();
            scanner.nextLine(); //just to wait for input
        }
    }

    public static boolean checkMedewerkers(IScanner scanner) {
        if (MedewerkerList.size() == 0){
            System.out.println("Geen medewerkers beschikbaar.");
            UI.KeerTerugEnter();
            scanner.nextLine(); //just to wait for input
            return false;
        }
        return true;
    }
    
    public static void werktijdAdd(IScanner scanner) {
        if (checkMedewerkers(scanner)){
            getMedewerkers(scanner);
            UI.medewerkerAanpassen();
            int medewerker = scanner.nextInt() - 1;
            if (medewerker >= 0) {
                UI.VoerWerktijdIn();
                Medewerker.MedewerkerList.get(medewerker).setWerktijd(scanner.nextDouble() * 60);
                System.out.println("Medewerker " + MedewerkerList.get(medewerker).getNaam() + " is succesvol aangepast");
                UI.KeerTerugEnter();
                scanner.nextLine(); //just to wait for input
                scanner.nextLine(); //just to wait for input
            }else{
                UI.ongeldigeMedewerker();    
            }
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
        if (checkMedewerkers(scanner)){
            getMedewerkers(scanner);
            UI.medewerkerAanpassen();
            int userMedewerkerChoice = scanner.nextInt();
            scanner.nextLine(); //just to wait for input
            if (userMedewerkerChoice > 0){
                Medewerker.MedewerkerList.remove(userMedewerkerChoice-1);
                System.out.println("Medewerker succesvol verwijderd");
                UI.KeerTerugEnter();
                scanner.nextLine(); //just to wait for input
            }else{
                UI.ongeldigeMedewerker();
            }
        }
    }
}
