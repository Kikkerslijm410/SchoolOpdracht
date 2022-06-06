package com.gui;

import com.app.Medewerker;

public abstract class AController {

    private Medewerker medewerker;

    abstract void setUser(Medewerker medewerker);

    //just here cause errors
    public void fuckdit(){
        System.out.println(medewerker);
    }
}
