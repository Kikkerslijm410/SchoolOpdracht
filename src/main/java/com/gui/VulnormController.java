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

public class VulnormController extends AController implements Initializable {

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
    public void Reset() throws IOException {
        setZero();
        Opslaan();
    }

    public static void setZero(){
        for (int i = 0; i < Pad.PadList.size(); i++){
            Pad.setVulnorm(i, 0);
        }
    }

    @FXML
    public void VulnormOpslaan() throws IOException {
        Pad.setVulnorm(0, StringToInt(0, VrachtInternationaal.getText()));
        Pad.setVulnorm(1, StringToInt(1, VrachtPotjes.getText()));
        Pad.setVulnorm(2, StringToInt(2, VrachtFrisdrank.getText()));
        Pad.setVulnorm(3, StringToInt(3, VrachtBier.getText()));
        Pad.setVulnorm(4, StringToInt(4, VrachtWijn.getText()));
        Pad.setVulnorm(5, StringToInt(5, VrachtChips.getText()));
        Pad.setVulnorm(6, StringToInt(6, VrachtCosmetica.getText()));
        Pad.setVulnorm(7, StringToInt(7, VrachtDierenvoeding.getText()));
        Pad.setVulnorm(8, StringToInt(8, VrachtKoek.getText()));
        Pad.setVulnorm(9, StringToInt(9, VrachtOntbijt.getText()));
        Pad.setVulnorm(10, StringToInt(10, VrachtZuivel.getText()));
        Pad.setVulnorm(11, StringToInt(11, VrachtVVP.getText()));
        Pad.setVulnorm(12, StringToInt(12, VrachtDiepvries.getText()));
        start();
    }

    public static int StringToInt(int pad, String text) {
        if (text.isBlank()){
            return Pad.PadList.get(pad).vulnorm ;
        }
        return Integer.parseInt(text);
    }

    @FXML 
    public void Opslaan() throws IOException {
        GsonManager.saveFile();
        Main.show("vulnorm", medewerker);
    }

    public void start(){
        inter.setText(Pad.getVulnormString(0));
        potjes.setText(Pad.getVulnormString(1));
        fris.setText(Pad.getVulnormString(2));
        bier.setText(Pad.getVulnormString(3));
        wijn.setText(Pad.getVulnormString(4));
        chips.setText(Pad.getVulnormString(5));
        cosmetica.setText(Pad.getVulnormString(6));
        dierenvoeding.setText(Pad.getVulnormString(7));
        koek.setText(Pad.getVulnormString(8));
        ontbijt.setText(Pad.getVulnormString(9));
        zuivel.setText(Pad.getVulnormString(10));
        vvp.setText(Pad.getVulnormString(11));
        diepvries.setText(Pad.getVulnormString(12));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        start();
    }
    
    //Override. Empty just because of the implementations
    @Override
    void setUser(Medewerker medewerker) {}   
}

