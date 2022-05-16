package com.app;

import java.util.ArrayList;

public class Pad {

    public String padNaam;
    public int vulnorm;
    public int aantalDozen;
    public static ArrayList <Pad> PadList = new ArrayList<>();

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

    public static void vulnormAdd (IScanner scanner) {
        int i = 1;
        for (Pad e : Pad.PadList){
            System.out.println(i + ") Pad " + e.getPadNaam() + " heeft als vulnorm " + e.getVulnorm());
            i++;
        }
        UI.KeerTerugGetal();
        UI.KiesPad();
        int pad = scanner.nextInt() - 1;
        if (pad >= 0){
            UI.GeefVulnorm();
            int vulnorm = scanner.nextInt();
            PadList.get(pad).vulnorm = vulnorm;
            System.out.println("Medewerker " + PadList.get(pad) + " is succesvol aangepast");
            //PadList.get(pad).setVulnorm(vulnorm);
        }
    }

    public int getVulnorm(){
        return this.vulnorm;
    }

    public int getAantalDozen(){
        return this.aantalDozen;
    }

    public String getPadNaam(){
        return this.padNaam;
    }

    public static boolean checkVracht() {
        return padInter.getAantalDozen() > 0;
    }

    public static boolean checkVulnorm() {
        return Pad.padInter.getVulnorm() > 0;
    }

    public static void vrachtAdd(IScanner scanner){
        System.out.println("Voer het aantal dozen in van Internationaal:");
        padInter.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Potjes:");
        padPotjes.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Frisdrank:");
        padFrisdrank.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Bier:");
        padBier.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Chips:");
        padChips.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Wijn:");
        padWijn.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Cosmetica:");
        padCosmetica.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Dierenvoeding:");
        padDierenvoeding.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Koek:");
        padKoek.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Ontbijt:");
        padOntbijt.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Zuivel:");
        padZuivelVVP.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van VVP:");
        padVVP.aantalDozen = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Diepvries:");
        padDiepvries.aantalDozen = scanner.nextInt();
    }
}