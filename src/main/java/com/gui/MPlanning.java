package com.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.app.Medewerker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MPlanning extends AController implements Initializable{
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
    private void switchToVracht() throws IOException {
        Main.show("vracht", medewerker);
    }

    //Parent methods overrides
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    @Override
    public void setUser(Medewerker medewerker) {       
    }
}
