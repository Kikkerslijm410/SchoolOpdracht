package com.app;

public abstract class UI {

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

    public static void AddedToList(String naam) {
        System.out.println(naam + " is toegevoegd aan de medewerker lijst.");
    }

    public static void KiesPad(String padvulnorm) {
        System.out.println("Kies een pad om de " + padvulnorm + " aan te passen.");
    }

    public static void GeefWaarde(String padvulnorm) {
        System.out.println("Geef de nieuwe " + padvulnorm + " voor het pad.");
    }

    public static void AllesAanpassen(String soort) {
        System.out.println("14) Pas alle " + soort + " in één keer aan.");
    }

    public static void ongeldigeMedewerker() {
        System.out.println("Deze medewerker bestaat niet of is al verwijderd.");
    }

    public static void medewerkerAanpassen(String type) {
        System.out.println("Voer het nummer van de medewerker in om deze te " + type + ".");
    }

    public static void AllePadenAangepast() {
        System.out.println("Alle paden zijn aangepast.");
    }

    public static void GeefGeldigeGetal(int i, int j) {
        System.out.println("Voer een geldige getal in tussen de " + i + " en " + j + ".");
    }

    public static void medewerkerStart() {
        System.out.println("1) Medewerker toevoegen");
        System.out.println("2) Avondleider toevoegen");
        System.out.println("3) magazijnman toevoegen");
    }
}
