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
    public static Pad padZuivel = new Pad ("ZuivelVVP", 60, 0);
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
        UI.KiesPadVulnorm();
        int vulnorm = scanner.nextInt() - 1;
        if (vulnorm == 13){
            vulnormAddTotaal(scanner);
        }
        if (vulnorm >= 0){
            UI.GeefVulnorm();
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
        padInter.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Potjes:");
        padPotjes.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Frisdrank:");
        padFrisdrank.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Bier:");
        padBier.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Chips:");
        padChips.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Wijn:");
        padWijn.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Cosmetica:");
        padCosmetica.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Dierenvoeding:");
        padDierenvoeding.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Koek:");
        padKoek.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Ontbijt:");
        padOntbijt.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Zuivel:");
        padZuivel.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor VVP:");
        padVVP.vulnorm = vulnormMethod(scanner);
        System.out.println("Voer de nieuwe vulnorm in voor Diepvries:");
        padDiepvries.vulnorm = vulnormMethod(scanner);
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
        UI.KiesPadVracht();
        int pad = scanner.nextInt() - 1;
        if (pad == 13){
            vrachtAddTotaal(scanner);
        }
        if (pad >= 0){
            UI.GeefVracht();
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
        padInter.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Potjes:");
        padPotjes.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Frisdrank:");
        padFrisdrank.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Bier:");
        padBier.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Chips:");
        padChips.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Wijn:");
        padWijn.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Cosmetica:");
        padCosmetica.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Dierenvoeding:");
        padDierenvoeding.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Koek:");
        padKoek.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Ontbijt:");
        padOntbijt.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Zuivel:");
        padZuivel.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van VVP:");
        padVVP.aantalDozen = vrachtMethod(scanner);
        System.out.println("Voer het aantal dozen in van Diepvries:");
        padDiepvries.aantalDozen = vrachtMethod(scanner);
        UI.AllePadenAangepast();
        UI.KeerTerugEnter();
        scanner.nextLine(); //just here to wait for input
    }
}
