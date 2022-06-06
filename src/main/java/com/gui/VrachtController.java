package com.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.app.GsonManager;
import com.app.Medewerker;
import com.app.Pad;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VrachtController extends AController implements Initializable{
    
    Medewerker medewerker;

    //Alle textfields
    @FXML
    private TextField VrachtInternationaal;
    @FXML
    private TextField VrachtPotjes;
    @FXML
    private TextField VrachtFrisdrank;
    @FXML
    private TextField VrachtBier;
    @FXML
    private TextField VrachtWijn;
    @FXML
    private TextField VrachtChips;
    @FXML
    private TextField VrachtCosmetica;
    @FXML
    private TextField VrachtDierenvoeding;
    @FXML
    private TextField VrachtKoek;
    @FXML
    private TextField VrachtOntbijt;
    @FXML
    private TextField VrachtZuivel;
    @FXML
    private TextField VrachtVVP;
    @FXML
    private TextField VrachtDiepvries;

    //Alle Labels
    @FXML
    private Label inter;
    @FXML
    private Label potjes;
    @FXML
    private Label fris;
    @FXML
    private Label bier;
    @FXML
    private Label wijn;
    @FXML
    private Label chips;
    @FXML
    private Label dierenvoeding;
    @FXML
    private Label cosmetica;
    @FXML
    private Label koek;
    @FXML
    private Label ontbijt;
    @FXML
    private Label zuivel;
    @FXML
    private Label vvp;
    @FXML
    private Label diepvries;

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
    void switchToVulnorm() throws IOException {
        Main.show("Vulnorm", medewerker);
    }

    @FXML
    public void Reset() throws IOException {
        Pad.setAantalDozen(0, 0);
        Pad.setAantalDozen(1, 0);
        Pad.setAantalDozen(2, 0);
        Pad.setAantalDozen(3, 0);
        Pad.setAantalDozen(4, 0);
        Pad.setAantalDozen(5, 0);
        Pad.setAantalDozen(6, 0);
        Pad.setAantalDozen(7, 0);
        Pad.setAantalDozen(8, 0);
        Pad.setAantalDozen(9, 0);
        Pad.setAantalDozen(10, 0);
        Pad.setAantalDozen(11, 0);
        Pad.setAantalDozen(12, 0);
        Opslaan();
    }

    @FXML
    private void VrachtVulnormOpslaan()throws IOException {
        Pad.setAantalDozen(0, StringToInt(0, VrachtInternationaal.getText()));
        Pad.setAantalDozen(1, StringToInt(1, VrachtPotjes.getText()));
        Pad.setAantalDozen(2, StringToInt(2, VrachtFrisdrank.getText()));
        Pad.setAantalDozen(3, StringToInt(3, VrachtBier.getText()));
        Pad.setAantalDozen(4, StringToInt(4, VrachtWijn.getText()));
        Pad.setAantalDozen(5, StringToInt(5, VrachtChips.getText()));
        Pad.setAantalDozen(6, StringToInt(6, VrachtCosmetica.getText()));
        Pad.setAantalDozen(7, StringToInt(7, VrachtDierenvoeding.getText()));
        Pad.setAantalDozen(8, StringToInt(8, VrachtKoek.getText()));
        Pad.setAantalDozen(9, StringToInt(9, VrachtOntbijt.getText()));
        Pad.setAantalDozen(10, StringToInt(10, VrachtZuivel.getText()));
        Pad.setAantalDozen(11, StringToInt(11, VrachtVVP.getText()));
        Pad.setAantalDozen(12, StringToInt(12, VrachtDiepvries.getText()));
        start();
    }

    private int StringToInt(int pad, String text) {
        if (text.isBlank()){
            return Pad.PadList.get(pad).aantalDozen ;
        }
        return Integer.parseInt(text);
    }

    @FXML 
    public void Opslaan() throws IOException {
        GsonManager.saveFile();
        Main.show("vracht", medewerker);
    }

    public void start(){
        inter.setText(Pad.getAantalDozenString(0));
        potjes.setText(Pad.getAantalDozenString(1));
        fris.setText(Pad.getAantalDozenString(2));
        bier.setText(Pad.getAantalDozenString(3));
        wijn.setText(Pad.getAantalDozenString(4));
        chips.setText(Pad.getAantalDozenString(5));
        cosmetica.setText(Pad.getAantalDozenString(6));
        dierenvoeding.setText(Pad.getAantalDozenString(7));
        koek.setText(Pad.getAantalDozenString(8));
        ontbijt.setText(Pad.getAantalDozenString(9));
        zuivel.setText(Pad.getAantalDozenString(10));
        vvp.setText(Pad.getAantalDozenString(11));
        diepvries.setText(Pad.getAantalDozenString(12));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        start();
    }
    
    //Override. Empty just because of the implementations
    @Override
    void setUser(Medewerker medewerker) {}  
}