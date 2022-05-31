package com.app;

import java.util.ArrayList;

public class Pad {

    public String padNaam;
    public int vulnorm;
    public int aantalDozen;
    public static ArrayList <Pad> PadList = new ArrayList<>();

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

    public int getVulnorm(){
        return this.vulnorm;
    }

    public int getAantalDozen(){
        return this.aantalDozen;
    }

    public String getPadNaam(){
        return this.padNaam;
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
        UI.AllesAanpassen("vulnormen");
        UI.KeerTerugGetal();
        UI.KiesPad("vulnorm");
        int vulnorm = scanner.nextInt() - 1;
        if (vulnorm == 13){
            vulnormAddTotaal(scanner);
        }
        if (vulnorm >= 0){
            UI.GeefWaarde("vulnorm");
                PadList.get(vulnorm).vulnorm = vulnormMethod(scanner);
                System.out.println("De vulnorm van " + PadList.get(vulnorm).getPadNaam() + " is succesvol aangepast");
                //PadList.get(pad).setVulnorm(vulnorm);
                UI.KeerTerugEnter();
                scanner.nextLine(); //just here to wait for input
        }
    }

    public static int vulnormMethod(IScanner scanner){
        while (true){
            int vulnorm = scanner.nextInt();
            if (vulnorm <= 100 && vulnorm >= 10){ 
            return vulnorm;
            }
            UI.GeefGeldigeGetal(10, 100);
        }
    }

    public static void vulnormAddTotaal(IScanner scanner){
        System.out.println("Voer de nieuwe vulnorm in voor Internationaal:");
        PadList.get(0).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Potjes:");
        PadList.get(1).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Frisdrank:");
        PadList.get(2).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Bier:");
        PadList.get(3).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Chips:");
        PadList.get(4).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Wijn:");
        PadList.get(5).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Cosmetica:");
        PadList.get(6).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Dierenvoeding:");
        PadList.get(7).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Koek:");
        PadList.get(8).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Ontbijt:");
        PadList.get(9).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Zuivel:");
        PadList.get(10).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor VVP:");
        PadList.get(11).vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Diepvries:");
        PadList.get(12).vulnorm = vulnormMethod(scanner);
        UI.AllePadenAangepast();
        UI.KeerTerugEnter();
        scanner.nextLine(); //just here to wait for input
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
        UI.AllesAanpassen("vracht");
        UI.KeerTerugGetal();
        UI.KiesPad("vracht");
        int pad = scanner.nextInt() - 1;
        if (pad == 13){
            vrachtAddTotaal(scanner);
        }
        if (pad >= 0){
            UI.GeefWaarde("vracht");
                PadList.get(pad).aantalDozen = vrachtMethod(scanner);
                System.out.println("De vracht van " + PadList.get(pad).getPadNaam() + " is succesvol aangepast");
                UI.KeerTerugEnter();
                scanner.nextLine(); //just here to wait for input
            }
        }

    public static int vrachtMethod(IScanner scanner){
        while (true){
            int vracht = scanner.nextInt();
            if (vracht <= 400 && vracht >= 0){ 
            return vracht;
            }
            UI.GeefGeldigeGetal(00, 400);
        }
    }

    public static void vrachtAddTotaal(IScanner scanner){
        System.out.println("Voer het aantal dozen in van Internationaal:");
        PadList.get(0).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Potjes:");
        PadList.get(1).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Frisdrank:");
        PadList.get(2).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Bier:");
        PadList.get(3).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Chips:");
        PadList.get(4).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Wijn:");
        PadList.get(5).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Cosmetica:");
        PadList.get(6).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Dierenvoeding:");
        PadList.get(7).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Koek:");
        PadList.get(8).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Ontbijt:");
        PadList.get(9).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Zuivel:");
        PadList.get(10).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van VVP:");
        PadList.get(11).aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Diepvries:");
        PadList.get(12).aantalDozen = vrachtMethod(scanner);
        UI.AllePadenAangepast();
        UI.KeerTerugEnter();
        scanner.nextLine(); //just here to wait for input
    }

    /*
    Legacy code dont touch
    public static void init(){
        Pad padInter = new Pad ("Internationaal", 60, 0);
        Pad padPotjes = new Pad ("Potjes", 60, 0);
        Pad padFrisdrank = new Pad ("Frisdrank", 60, 0);
        Pad padBier = new Pad ("BierChipsWijn", 60, 0);
        Pad padChips= new Pad ("Chips", 60, 0);
        Pad padWijn = new Pad ("Wijn", 60, 0);
        Pad padDierenvoeding = new Pad ("Internationaal", 60, 0);
        Pad padCosmetica = new Pad ("Cosmetica", 60, 0);
        Pad padKoek = new Pad ("Koek", 60, 0);
        Pad padOntbijt = new Pad ("Ontbijt", 60, 0);
        Pad padZuivel = new Pad ("ZuivelVVP", 60, 0);
        Pad padVVP = new Pad ("VVP", 60, 0);
        Pad padDiepvries = new Pad("Diepvries", 60, 0);
        }
        */
}
