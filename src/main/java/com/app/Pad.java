package com.app;

import java.util.ArrayList;

public class Pad {

    public String padNaam;
    public int vulnorm;
    public int aantalDozen;
    public static ArrayList <Pad> PadList = new ArrayList<>();

    public static Pad padInter = new Pad ("Internationaal", 60, 0);
    public static Pad padPotjes = new Pad ("Potjes", 60, 0);
    public static Pad padFrisdrank = new Pad ("Frisdrank", 60, 0);
    public static Pad padBier = new Pad ("BierChipsWijn", 60, 0);
    public static Pad padChips= new Pad ("Chips", 60, 0);
    public static Pad padWijn = new Pad ("Wijn", 60, 0);
    public static Pad padDierenvoeding = new Pad ("Internationaal", 60, 0);
    public static Pad padCosmetica = new Pad ("Cosmetica", 60, 0);
    public static Pad padKoek = new Pad ("Koek", 60, 0);
    public static Pad padOntbijt = new Pad ("Ontbijt", 60, 0);
    public static Pad padZuivelVVP = new Pad ("ZuivelVVP", 60, 0);
    public static Pad padVVP = new Pad ("VVP", 60, 0);
    public static Pad padDiepvries = new Pad("Diepvries", 60, 0);

    public Pad (String padNaam, int vulnorm, int dozen){
        this.padNaam = padNaam;
        this.vulnorm = vulnorm;
        this.aantalDozen = dozen;
        PadList.add(this);
    }

    public void setVulnorm (int norm){
        this.vulnorm = norm;
    }

    public void setAantalDozen(int dozen){
        this.aantalDozen = dozen;
    }

    /**
     * min vulnorm = 20
     * max vulnorm = 100
     * @param scanner
     */
    public static void vulnormAdd (IScanner scanner) {
        int i = 1;
        for (Pad e : Pad.PadList){
            System.out.println(i + ") Pad " + e.getPadNaam() + " heeft als vulnorm " + e.getVulnorm());
            i++;
        }
        UI.KeerTerugGetal();
        UI.KiesPadVulnorm();
        int pad = scanner.nextInt() - 1;
        if (pad >= 0){
            UI.GeefVulnorm();
            int vulnorm = scanner.nextInt();
            if (vulnorm >= 10 && vulnorm <= 100){
                PadList.get(pad).vulnorm = vulnorm;
                System.out.println("De vulnorm van " + PadList.get(pad).getPadNaam() + " is succesvol aangepast");
                //PadList.get(pad).setVulnorm(vulnorm);
                UI.KeerTerugEnter();
                scanner.nextLine(); //just here to wait for input
            }else{
                System.out.println("Probeer opnieuw");
                UI.KeerTerugEnter();
                scanner.nextLine(); //just here to wait for input
            }
        }
    }

        /**
     * min vulnorm = 20
     * max vulnorm = 100
     * @param scanner
     */
    public static void vrachtAdd (IScanner scanner) {
        int i = 1;
        for (Pad e : Pad.PadList){
            System.out.println(i + ") Pad " + e.getPadNaam() + " heeft als vracht " + e.getAantalDozen());
            i++;
        }
        UI.KeerTerugGetal();
        UI.KiesPadVracht();
        int pad = scanner.nextInt() - 1;
        if (pad >= 0){
            UI.GeefVracht();
            int vracht = scanner.nextInt();
            if (vracht <= 400 && vracht >= 0){
                PadList.get(pad).aantalDozen = vracht;
                System.out.println("De vracht van " + PadList.get(pad).getPadNaam() + " is succesvol aangepast");
                UI.KeerTerugEnter();
                scanner.nextLine(); //just here to wait for input
            }else{
                System.out.println("Probeer opnieuw");
                UI.KeerTerugEnter();
                scanner.nextLine(); //just here to wait for input
            }
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
        if (padInter.aantalDozen <= 400 && padInter.aantalDozen >= 0){
            return true;
        }
        return false;
    }

    /**
     * 
     * @return
     */
    public static boolean checkVulnorm() {
        if (padInter.getVulnorm() >= 10 && padInter.getVulnorm() <= 100){
            return true;
        }
        return false;
    }

    /**
     * 
     * @param scanner
     * @int aantalDozen
     */
    public static void vrachtAdd2(IScanner scanner){
        int aantalDozen = 0;
        System.out.println("Voer het aantal dozen in van Internationaal:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van Potjes:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van Frisdrank:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van Bier:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van Chips:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van Wijn:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van Cosmetica:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van Dierenvoeding:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van Koek:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van Ontbijt:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van Zuivel:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van VVP:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println("Voer het aantal dozen in van Diepvries:");
        aantalDozen = scanner.nextInt();
        setVracht(padInter, aantalDozen);
        System.out.println(padInter.getAantalDozen() + padBier.getAantalDozen());
        scanner.nextLine(); //just here to wait for input
        UI.KeerTerugEnter();
    }

    /**
     * min aantal dozen = 0
     * max aantal dozen = 400
     * @param pad
     * @param vracht
     */
    private static void setVracht(Pad pad, int vracht) {
        if (vracht <= 400 && vracht >= 0){
            System.out.println("Voer een geldige vracht tussen de 0 en 400 in.");
        }else{
            pad.aantalDozen = vracht;
        }
    }
}
