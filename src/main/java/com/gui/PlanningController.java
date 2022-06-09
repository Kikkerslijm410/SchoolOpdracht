package com.gui;

import java.net.URL;
import java.util.ResourceBundle;

import com.app.Medewerker;

import javafx.fxml.Initializable;

public class PlanningController extends AController implements Initializable {

    Medewerker medewerker;

    //Override just here because implementations
    @Override
    public void setUser(Medewerker medewerker) {}
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}    
}
