package com.gui;

import java.net.URL;
import java.util.ResourceBundle;

import com.app.GsonManager;
import com.app.Medewerker;

import javafx.fxml.Initializable;

public class DashController extends AController implements Initializable{
    Medewerker medewerker;

    //Override just here because implementations
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        GsonManager.saveFile();
    }

    @Override
    public void setUser(Medewerker medewerker) { 
        this.medewerker = medewerker;      
    }
}
