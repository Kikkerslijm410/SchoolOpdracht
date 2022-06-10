package com.gui;

import java.io.IOException;

import com.app.Medewerker;

import javafx.fxml.FXML;

public abstract class AController {

    private Medewerker medewerker;

    abstract void setUser(Medewerker medewerker);

    //just here cause errors
    public void fuckdit(){
        System.out.println(medewerker);
    }

    //switch statements
    @FXML
    public void switchToMedewerker() throws IOException {
        Main.show("medewerker", medewerker);
    }
    @FXML
    public void switchToPlanning() throws IOException {
        Main.show("planning", medewerker);
    }
    @FXML
    public void switchToHome() throws IOException {
        Main.show("dashboard", medewerker);
    }
    @FXML
    public void switchToVracht() throws IOException {
        Main.show("vracht", medewerker);
    }
    @FXML
    public void switchToVulnorm() throws IOException {
        Main.show("vulnorm", medewerker);
    }
    @FXML
    public void switchToAdd() throws IOException {
        Main.show("MAdd", medewerker);
    }
    @FXML
    public void switchToDelete() throws IOException {
        Main.show("MDelete", medewerker);
    }
    @FXML
    public void switchToMPlanning() throws IOException {
        Main.show("MPlanning", medewerker);
    }
    @FXML
    public void CloseProgram() throws IOException {
        System.exit(1);
    }
}
