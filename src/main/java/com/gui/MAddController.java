package com.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.app.GsonManager;
import com.app.Medewerker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MAddController extends AController implements Initializable{

    @FXML
    private TextField naam;

    @FXML
    private TextField werktijd;

    @FXML
    private Label MedewerkerNaam;

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

    @FXML
    private void MedewerkerAdd() throws IOException {
        if (!naam.getText().isBlank() && !werktijd.getText().isBlank()){
            Double wt = (double) Integer.parseInt(werktijd.getText());
            // bij false is het in minuten ingevoerd, bij true is het in uren ingevuld
            if (wt < 10){
                wt = wt * 60;
            } 
            Medewerker medewerker = new Medewerker(naam.getText(), wt);
            GsonManager.saveFile();
            Main.show("MAdd", medewerker);
        }
    }

    //Override just here because implementations
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
    @Override
    void setUser(Medewerker medewerker) {}   
}
