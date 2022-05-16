package com.app;

import java.io.IOException;

public abstract class UI {

    // printMainMenu
    public static void printMainMenu() {
        clearScreen();
        System.out.println("1) Maak de planning");
        System.out.println("2) Lijst met medewerkers");
        System.out.println("3) Nieuwe medewerker aanmaken");
        System.out.println("4) Medewerker verwijderen");
        System.out.println("5) Vracht toevoegen");
        System.out.println("6) Vulnorm Aanpassen"); 
        System.out.println("7) Werktijd aanpassen");
        System.out.println("8) "); //Deze is nog leeg.
        System.out.println("0) Exit");
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

    public static void VoerWerktijdIn(){
        System.out.println("Voer de werktijd in uren in:");
    }
    
    public static void VoerNaamin(){
        System.out.println("Voer de voor- en achernaam in:");
    }

    public static void KeerTerugGetal(){
        System.out.println("0) Keer terug naar het hoofdmenu.");
    }

    public static void KeerTerugEnter(){
        System.out.println("Press enter to continue.");
    }

    public static void Exit() {
        System.out.println("Saving Data.....");
    }

    public static void Error(String method) {
        System.out.println("Error in the " + method + " method!");
    }

    public static void OnjuisteOptie(){
        System.out.println("Optie bestaat niet kies een geldige optie.");
    }

    public static void geenMedewerkers() {
        System.out.println("Er zijn geen medewerkers beschikbaar. Voeg medewerkers toe om de planning te kunnen maken.");
    }

    public static void geenVulnorm() {
        System.out.println("Er is geen vulnorm beschikbaar voor de paden voeg deze toe om de planning te kunnen maken.");
    }

    public static void geenVracht() {
        System.out.println("Er is geen vracht beschikbaar voor de paden voeg deze toe om de planning te kunnen maken.");
    }

    public static void AddedToList(String naam) {
        System.out.println(naam + " is toegevoegd aan de medewerker lijst.");
    }

    public static void KiesPadVulnorm() {
        System.out.println("Kies een pad om de vulnorm aan te passen.");
    }

    public static void KiesPadVracht() {
        System.out.println("Kies een pad om de vracht aan te passen.");
    }

    public static void GeefVulnorm() {
        System.out.println("Geef de nieuwe vulnorm voor het pad.");
    }

    public static void GeefVracht() {
        System.out.println("Geef de nieuwe vracht voor het pad");
    }
}
