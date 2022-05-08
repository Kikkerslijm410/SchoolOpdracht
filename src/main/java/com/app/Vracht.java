package com.app;

public class Vracht {
    int aantalDozen;

    public Vracht (int aantalDozen){
        this.aantalDozen = aantalDozen;
    }

    public static void vrachtAdd(ScannerV3 scannakin){
        padInit();
        System.out.println("Voer het aantal dozen in van Internationaal:");
        Pad.padInter.setAantalDozen(scannakin.nextInt());
        System.out.println("Voer het aantal dozen in van Potjes:");
        Pad.padPotjes.setAantalDozen(scannakin.nextInt());
        System.out.println("Voer het aantal dozen in van Frisdrank:");
        Pad.padFrisdrank.setAantalDozen(scannakin.nextInt());
        System.out.println("Voer het aantal dozen in van Bier/Chips/Wijn:");
        Pad.padBier.setAantalDozen(scannakin.nextInt());
        System.out.println("Voer het aantal dozen in van Cosmetica:");
        Pad.padCosmetica.setAantalDozen(scannakin.nextInt());
        System.out.println("Voer het aantal dozen in van Dierenvoeding:");
        Pad.padDierenvoeding.setAantalDozen(scannakin.nextInt());
        System.out.println("Voer het aantal dozen in van Koek:");
        Pad.padKoek.setAantalDozen(scannakin.nextInt());
        System.out.println("Voer het aantal dozen in van Ontbijt:");
        Pad.padOntbijt.setAantalDozen(scannakin.nextInt());
        System.out.println("Voer het aantal dozen in van Zuivel/VVP:");
        Pad.padZuivelVVP.setAantalDozen(scannakin.nextInt());
        System.out.println("Voer het aantal dozen in van Diepvries:");
        Pad.padDiepvries.setAantalDozen(scannakin.nextInt());
    }

    public static void padInit(){
        if(Pad.padDiepvries == null){
            Pad padInter            = new Pad ("Inter");
            Pad padPotjes           = new Pad ("Potjes");
            Pad padFrisdrank        = new Pad ("Fris");
            Pad padBier             = new Pad ("Bier");
            Pad padCosmetica        = new Pad ("Cosmetica");
            Pad padDierenvoeding    = new Pad ("Dierenvoeding");
            Pad padKoek             = new Pad ("Koek");
            Pad padOntbijt          = new Pad ("Ontbijt");
            Pad padZuivelVVP        = new Pad ("Zuivel");
            Pad padDiepvries        = new Pad ("Diepvries");
        }
    }
}