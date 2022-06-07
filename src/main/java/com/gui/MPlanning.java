package com.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.app.Medewerker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MPlanning extends AController implements Initializable{
    Medewerker medewerker;

    //Parent methods overrides
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    @Override
    public void setUser(Medewerker medewerker) {       
    }
}
