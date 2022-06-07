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
    private TextField VulnormInternationaal;
    @FXML
    private TextField VulnormPotjes;
    @FXML
    private TextField VulnormFrisdrank;
    @FXML
    private TextField VulnormBier;
    @FXML
    private TextField VulnormWijn;
    @FXML
    private TextField VulnormChips;
    @FXML
    private TextField VulnormCosmetica;
    @FXML
    private TextField VulnormDierenvoeding;
    @FXML
    private TextField VulnormKoek;
    @FXML
    private TextField VulnormOntbijt;
    @FXML
    private TextField VulnormZuivel;
    @FXML
    private TextField VulnormVVP;
    @FXML
    private TextField VulnormDiepvries;

    //Alle Labels
    @FXML
    private Label vinter;
    @FXML
    private Label vpotjes;
    @FXML
    private Label vfris;
    @FXML
    private Label vbier;
    @FXML
    private Label vwijn;
    @FXML
    private Label vchips;
    @FXML
    private Label vdierenvoeding;
    @FXML
    private Label vcosmetica;
    @FXML
    private Label vkoek;
    @FXML
    private Label vontbijt;
    @FXML
    private Label vzuivel;
    @FXML
    private Label vvvp;
    @FXML
    private Label vdiepvries;

    @FXML
    public void Reset() throws IOException {
        setZero();
        Opslaan();
    }

    public static void setZero(){
        for (int i = 0; i < Pad.PadList.size(); i++){
            Pad.setVulnorm(i, 60);
        }
    }

    @FXML
    public void VulnormOpslaan() throws IOException {
        Pad.setVulnorm(0, StringToInt(0, VulnormInternationaal.getText()));
        Pad.setVulnorm(1, StringToInt(1, VulnormPotjes.getText()));
        Pad.setVulnorm(2, StringToInt(2, VulnormFrisdrank.getText()));
        Pad.setVulnorm(3, StringToInt(3, VulnormBier.getText()));
        Pad.setVulnorm(4, StringToInt(4, VulnormWijn.getText()));
        Pad.setVulnorm(5, StringToInt(5, VulnormChips.getText()));
        Pad.setVulnorm(6, StringToInt(6, VulnormCosmetica.getText()));
        Pad.setVulnorm(7, StringToInt(7, VulnormDierenvoeding.getText()));
        Pad.setVulnorm(8, StringToInt(8, VulnormKoek.getText()));
        Pad.setVulnorm(9, StringToInt(9, VulnormOntbijt.getText()));
        Pad.setVulnorm(10, StringToInt(10, VulnormZuivel.getText()));
        Pad.setVulnorm(11, StringToInt(11, VulnormVVP.getText()));
        Pad.setVulnorm(12, StringToInt(12, VulnormDiepvries.getText()));
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
        vinter.setText(Pad.getVulnormString(0));
        vpotjes.setText(Pad.getVulnormString(1));
        vfris.setText(Pad.getVulnormString(2));
        vbier.setText(Pad.getVulnormString(3));
        vwijn.setText(Pad.getVulnormString(4));
        vchips.setText(Pad.getVulnormString(5));
        vcosmetica.setText(Pad.getVulnormString(6));
        vdierenvoeding.setText(Pad.getVulnormString(7));
        vkoek.setText(Pad.getVulnormString(8));
        vontbijt.setText(Pad.getVulnormString(9));
        vzuivel.setText(Pad.getVulnormString(10));
        vvvp.setText(Pad.getVulnormString(11));
        vdiepvries.setText(Pad.getVulnormString(12));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       
    }
    
    //Override. Empty just because of the implementations
    @Override
    void setUser(Medewerker medewerker) {}   
}

