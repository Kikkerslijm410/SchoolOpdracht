package com.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.app.ExcelManager;
import com.app.Medewerker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class PlanningController extends AController implements Initializable {

    @FXML
    private void maakPlanning() throws IOException {
        ExcelManager.Start();
    }

    //Override just here because implementations
    @Override
    public void setUser(Medewerker medewerker) {}
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}    
}
