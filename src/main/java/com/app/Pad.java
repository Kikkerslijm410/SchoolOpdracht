package com.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Pad {
    String padNaam;
    int vulnorm;
    int aantalDozen;
    static ArrayList <Pad> PadList;

    public Pad (String padNaam, int vulnorm){
        this.padNaam = padNaam;
        this.vulnorm = vulnorm;
        PadList.add(this);
    }

    public void setVulnorm (Scanner scanner){

    }
}