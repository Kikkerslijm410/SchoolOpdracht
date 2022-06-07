package com.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.app.Medewerker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MPlanning extends AController implements Initializable{
    Medewerker medewerker;

    //switch statements
    @FXML
    public void switchToMedewerker() throws IOException {
        super.switchToMedewerker();
    }
    @FXML
    public void switchToPlanning() throws IOException {
        super.switchToPlanning();
    }
    @FXML
    public void switchToHome() throws IOException {
        super.switchToHome();
    }
    @FXML
    public void switchToVracht() throws IOException {
        super.switchToVracht();
    }

    //Parent methods overrides
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    @Override
    public void setUser(Medewerker medewerker) {       
    }
}
