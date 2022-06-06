package com.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.app.GsonManager;
import com.app.Medewerker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class DashController extends AController implements Initializable{
    Medewerker medewerker;


    //switch statement
    @FXML
    private void switchToMedewerker() throws IOException {
        Main.show("medewerker", medewerker);
    }
    @FXML
    private void switchToPlanning() throws IOException {
        Main.show("planning", medewerker);
    }
    @FXML
    private void switchToHome() throws IOException {
        Main.show("dashboard", medewerker);
    }
    @FXML
    private void switchToVracht() throws IOException {
        Main.show("vracht", medewerker);
    }

    //Parent methods overrides
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        GsonManager.saveFile();
    }

    @Override
    void setUser(Medewerker medewerker) { 
        this.medewerker = medewerker;      
    }
}
