package com.app;

import java.util.ArrayList;

public class Pad {

    public String padNaam;
    public int vulnorm;
    public int aantalDozen;
    public ArrayList <Pad> PadList = new ArrayList<>();

    public static Pad padInter = new Pad ("Internationaal", 60);
    public static Pad padPotjes = new Pad ("Potjes", 60);
    public static Pad padFrisdrank = new Pad ("Frisdrank", 60);
    public static Pad padBier = new Pad ("BierChipsWijn", 60);
    public static Pad padChips= new Pad ("Chips", 60);
    public static Pad padWijn = new Pad ("Wijn", 60);
    public static Pad padDierenvoeding = new Pad ("Internationaal", 60);
    public static Pad padCosmetica = new Pad ("Cosmetica", 60);
    public static Pad padKoek = new Pad ("Koek", 60);
    public static Pad padOntbijt = new Pad ("Ontbijt", 60);
    public static Pad padZuivelVVP = new Pad ("ZuivelVVP", 60);
    public static Pad padVVP = new Pad ("VVP", 60);
    public static Pad padDiepvries = new Pad("Diepvries", 60);

    public Pad (String padNaam, int vulnorm, int dozen){
        this.padNaam = padNaam;
        this.vulnorm = vulnorm;
        this.aantalDozen = dozen;
        PadList.add(this);
    }

    public Pad (String padNaam, int vulnorm){
        this.padNaam = padNaam;
        this.vulnorm = vulnorm;
        this.aantalDozen = 0;
        PadList.add(this);
    }

    public void setVulnorm (int norm){
        this.vulnorm = norm;
    }

    public void setAantalDozen(int dozen){
        this.aantalDozen = dozen;
    }

    public int getVulnorm(){
        return this.vulnorm;
    }

    public int getAantalDozen(){
        return this.aantalDozen;
    }

    public static boolean checkVracht() {
        if (padDiepvries.getAantalDozen() == 0){
            return false;
        }
            return true;
    }

    public static boolean checkVulnorm() {
        if (Pad.padDiepvries.getVulnorm() == 0){
            return false;
        }
        return true;
    }

    public static void vrachtAdd(IScanner scanner){
        System.out.println("Voer het aantal dozen in van Internationaal:");
        padInter.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van Potjes:");
        padPotjes.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van Frisdrank:");
        padFrisdrank.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van Bier:");
        padBier.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van Chips:");
        padChips.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van Wijn:");
        padWijn.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van Cosmetica:");
        padCosmetica.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van Dierenvoeding:");
        padDierenvoeding.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van Koek:");
        padKoek.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van Ontbijt:");
        padOntbijt.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van Zuivel/VVP:");
        padZuivelVVP.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van VVP:");
        padVVP.setAantalDozen(scanner.nextInt());
        System.out.println("Voer het aantal dozen in van Diepvries:");
        padDiepvries.setAantalDozen(scanner.nextInt());
    }
}