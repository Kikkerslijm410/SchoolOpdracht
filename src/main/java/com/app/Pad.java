package com.app;

import java.util.ArrayList;

public class Pad {
    public static Pad padInter;
    public static Pad padPotjes;
    public static Pad padFrisdrank;
    public static Pad padBier;
    public static Pad padCosmetica;
    public static Pad padDierenvoeding;
    public static Pad padKoek;
    public static Pad padOntbijt;
    public static Pad padZuivelVVP;
    public static Pad padDiepvries;

    String padNaam;
    int vulnorm;
    int aantalDozen;
    public ArrayList <Pad> PadList = new ArrayList<>();

    public Pad (String padNaam, int vulnorm, int dozen){
        this.padNaam = padNaam;
        this.vulnorm = vulnorm;
        this.aantalDozen = dozen;
        PadList.add(this);
    }

    public Pad (String padNaam){
        this.padNaam = padNaam;
        this.vulnorm = 0;
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
}
//