package com.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.app.Medewerker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class VulnormController extends AController implements Initializable {

    Medewerker medewerker;

    //switch statements
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

    //Override just here because implementations
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
    @Override
    void setUser(Medewerker medewerker) {}    
}

