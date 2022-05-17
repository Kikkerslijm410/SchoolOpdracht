package com.app;

public class Vliegtuig {

    int gewicht = 0;
    int passagiers = 0;
    int tegenwind = 0;
    boolean toestemming = false;
    boolean bagage = false;
    boolean Nederlands = false;

    //test checkBedrag1
    public Vliegtuig(int gewicht,int passagiers, int tegenwind, boolean toestemming, boolean bagage, boolean Nederlands){
        this.gewicht = gewicht;
        this.passagiers = passagiers;
        this.tegenwind = tegenwind;
        this.toestemming = toestemming;
        this.bagage = bagage;
        this.Nederlands = Nederlands;
    }

    //test Toestemming
    public Vliegtuig(int gewicht, int tegenwind, boolean toestemming){
        this.gewicht = gewicht;
        this.tegenwind = tegenwind;
        this.toestemming = toestemming;
    }

    //test checkBedrag2
    public Vliegtuig(int gewicht){
        this.gewicht = gewicht;
    }

    public boolean checkToestemming(){
        if (this.toestemming && (this.gewicht < 1000 || this.tegenwind > 50)){
            return true;
        }
        return false;
    }

    public static int checkBedrag1(int gewicht, int passagiers, boolean bagage, boolean Nederlands){
        int bedrag = 0;
        if (gewicht < 1000){
            bedrag = 100;
        }
        if (gewicht >= 1000 && gewicht < 5000){
            bedrag = 500;
        }
        if (gewicht >= 5000){
            bedrag = 2500;
        }
        if (passagiers >= 2){
            bedrag = (int) (bedrag * 1.5);
        }
        if (bagage){
            bedrag += 800;
        }
        if (Nederlands){
            bedrag = (int) (bedrag * 1.21);
        }
        return bedrag;
    }

    public int checkBedrag2(){
        int bedrag = 0;
        if (this.gewicht < 1000){
            bedrag = 100;
        }
        if (this.gewicht >= 1000 && gewicht < 5000){
            bedrag = 500;
        }
        if (this.gewicht >= 5000){
            bedrag = 2500;
        }
        return bedrag;
    }
}
