package com.app;

public class Vracht {
    int aantalDozen;

    public Vracht (int aantalDozen){
        this.aantalDozen = aantalDozen;
    }

    public static void vrachtAdd(ScannerV3 scannakin){ 
        System.out.println("Voer het aantal dozen in van Internationaal:");
        int padInter       = scannakin.nextInt();
        System.out.println("Voer het aantal dozen in van Potjes:");
        int padPotjes          = scannakin.nextInt();
        System.out.println("Voer het aantal dozen in van Frisdrank:");
        int padFrisdrank       = scannakin.nextInt();
        System.out.println("Voer het aantal dozen in van Bier/Chips/Wijn:");
        int padBier            = scannakin.nextInt();
        System.out.println("Voer het aantal dozen in van Cosmetica:");
        int padCosmetica       = scannakin.nextInt();
        System.out.println("Voer het aantal dozen in van Dierenvoeding:");
        int padDierenvoeding   = scannakin.nextInt();
        System.out.println("Voer het aantal dozen in van Koek:");
        int padKoek            = scannakin.nextInt();
        System.out.println("Voer het aantal dozen in van Ontbijt:");
        int padOntbijt         = scannakin.nextInt();
        System.out.println("Voer het aantal dozen in van Zuivel/VVP:");
        int padZuivelVVP       = scannakin.nextInt();
        System.out.println("Voer het aantal dozen in van Diepvries:");
        int padDiepvries       = scannakin.nextInt();
        System.out.println(padInter + padPotjes + padFrisdrank + padBier + padCosmetica
         + padDierenvoeding + padKoek + padOntbijt + padZuivelVVP + padDiepvries);
    }   
}