package com.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.app.GsonManager;
import com.app.Medewerker;
import com.app.Pad;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PadController extends AController implements Initializable{

    private static ArrayList <Label> LabelList = new ArrayList<>();
    private static ArrayList <TextField> TextFieldList = new ArrayList<>();

    @FXML
    private Label ScreenLabel;

    //Alle textfields
    @FXML
    private TextField Internationaal, Potjes, Frisdrank, Bier, Wijn, Chips, Cosmetica, Dierenvoeding, Koek, Ontbijt, Zuivel, VVP, Diepvries;

    //Alle Labels
    @FXML
    private Label inter, potjes, fris, bier, wijn, chips, dierenvoeding, cosmetica, koek, ontbijt, zuivel, vvp, diepvries;

    @FXML 
    private void Opslaan() throws IOException {
        GsonManager.saveFile();
        ScreenLabel.setText("Kies een optie om deze aan te passen.");
        LabelList.clear();
        TextFieldList.clear();
        setUser(medewerker);
        Clear();
    }

    @FXML
    public void Reset() throws IOException {
        setZero();
        Opslaan();
    }

    //for changing the top label
    @FXML
    private void setSpiegel() {
        Spiegel();
    }
    @FXML
    private void setVracht() {
        Vracht();
    }
    @FXML
    private void setNorm() {
        Vulnorm();
    }

    @FXML
    private void VrachtOpslaan()throws IOException {
        if (ScreenLabel.getText().equals("Vracht")){
            int i = 0;
            for (TextField e : TextFieldList){
                if (!e.getText().isBlank()){
                    Pad.setAantalDozen(i, StringToInt(i, e.getText()));
                }else{
                    Pad.setAantalDozen(i, Pad.PadList.get(i).getAantalDozen());
                }
                i++;
                Vracht();
            }
        }else if(ScreenLabel.getText().equals("Vulnorm")){
            int i = 0;
            for (TextField e : TextFieldList){
                if (!e.getText().isBlank()){
                    Pad.setVulnorm(i, StringToInt(i, e.getText()));
                }else{
                    Pad.setVulnorm(i, Pad.PadList.get(i).getVulnorm());
                }
                i++;
                Vulnorm();
            }
        }else if(ScreenLabel.getText().equals("Spiegeltijd")){
            int i = 0;
            for (TextField e : TextFieldList){
                if (!e.getText().isBlank()){
                    Pad.setSpiegeltijd(i, StringToInt(i, e.getText()));
                }else{
                    Pad.setSpiegeltijd(i, Pad.PadList.get(i).getSpiegeltijd());
                }
                i++;
                Spiegel();
            }
        }else{
            ScreenLabel.setText("Kies een optie om deze aan te passen.");
        }
    }

    private void Clear(){
        Internationaal.clear();
        Potjes.clear();
        Frisdrank.clear();
        Bier.clear();
        Wijn.clear();
        Chips.clear();
        Cosmetica.clear();
        Dierenvoeding.clear();
        Koek.clear();
        Ontbijt.clear();
        Zuivel.clear();
        VVP.clear();
        Diepvries.clear();
    }

    public void setZero(){
        if (ScreenLabel.getText().equals("Vracht")){
            for (int i = 0; i < Pad.PadList.size(); i++){
                Pad.setAantalDozen(i, 0);
            }
        }else if(ScreenLabel.getText().equals("Vulnorm")){
            for (int i = 0; i < Pad.PadList.size(); i++){
                Pad.setVulnorm(i, 60);
            }
        }else if(ScreenLabel.getText().equals("Spiegeltijd")){
            for (int i = 0; i < Pad.PadList.size(); i++){
                Pad.setSpiegeltijd(i, 30);
            }
        }else{
            ScreenLabel.setText("Kies een optie om deze aan te passen.");
        }
    }

    public static int StringToInt(int pad, String text) {
        if (text.isBlank()){
            return Pad.PadList.get(pad).aantalDozen ;
        }
        return Integer.parseInt(text);
    }

    private void Vracht(){
        ScreenLabel.setText("Vracht");
        int i = 0;
        for (Label e : LabelList){
            e.setText(Pad.getAantalDozenString(i));
            if (i  == 13){
                break;
            }
            i++;
        }
    }
    private void Vulnorm(){
        ScreenLabel.setText("Vulnorm");
        int i = 0;
        for (Label e : LabelList){
            e.setText(Pad.getVulnormString(i));
            if (i  == 13){
                break;
            }
            i++;
        }
    }
    private void Spiegel(){
        ScreenLabel.setText("Spiegeltijd");
        int i = 0;
        for (Label e : LabelList){
            e.setText(Pad.getSpiegeltijdString(i));
            if (i  == 13){
                break;
            }
            i++;
        }
    }

    @Override
    public void setUser(Medewerker medewerker) {
        LabelList.add(inter);
        LabelList.add(potjes);
        LabelList.add(fris);
        LabelList.add(bier);
        LabelList.add(chips);
        LabelList.add(wijn);
        LabelList.add(dierenvoeding);
        LabelList.add(cosmetica);
        LabelList.add(koek);
        LabelList.add(ontbijt);
        LabelList.add(zuivel);
        LabelList.add(vvp);
        LabelList.add(diepvries);

        TextFieldList.add(Internationaal);
        TextFieldList.add(Potjes);
        TextFieldList.add(Frisdrank);
        TextFieldList.add(Bier);
        TextFieldList.add(Chips);
        TextFieldList.add(Wijn);
        TextFieldList.add(Dierenvoeding);
        TextFieldList.add(Cosmetica);
        TextFieldList.add(Koek);
        TextFieldList.add(Ontbijt);
        TextFieldList.add(Zuivel);
        TextFieldList.add(VVP);
        TextFieldList.add(Diepvries);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ScreenLabel.setText("Kies een optie om deze aan te passen.");
    }  
}