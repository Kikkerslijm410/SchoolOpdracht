package com.app;

import java.util.ArrayList;

public class Pad {

    public String padNaam;
    public int vulnorm;
    public int aantalDozen;
    public int Spiegeltijd;
    public static ArrayList <Pad> PadList = new ArrayList<>();

    public Pad (String padNaam, int vulnorm, int dozen, int Spiegeltijd){
        this.padNaam = padNaam;
        this.vulnorm = vulnorm;
        this.aantalDozen = dozen;
        this.Spiegeltijd = Spiegeltijd;
        PadList.add(this);
    }

    public static void setVulnorm (int pad, int norm){
        PadList.get(pad).vulnorm = norm;
    }

    public static void setAantalDozen(int pad, int dozen){
        PadList.get(pad).aantalDozen = dozen;
    }

    public static void setSpiegeltijd(int pad, int Spiegeltijd){
        PadList.get(pad).Spiegeltijd = Spiegeltijd;
    }

    public int getVulnorm(){
        return this.vulnorm;
    }

    public int getAantalDozen(){
        return this.aantalDozen;
    }

    public int getSpiegeltijd() {
        return this.Spiegeltijd;
    }

    public String getPadNaam(){
        return this.padNaam;
    }

    public static String getVulnormString(int pad){
        return "" + PadList.get(pad).getVulnorm();
    }

    public static String getAantalDozenString(int pad){
        return "" + PadList.get(pad).getAantalDozen();
    }

    public static String getSpiegeltijdString(int pad){
        return "" + PadList.get(pad).getSpiegeltijd();
    }
}
