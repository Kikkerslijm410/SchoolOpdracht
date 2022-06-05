package com.gui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.app.GsonManager;
import com.app.Medewerker;
import com.google.gson.Gson;

import javafx.beans.binding.ObjectExpression;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

//Charts
import javafx.scene.Node;
import javafx.scene.chart.BarChart;                     
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;


public class DashController extends AController implements Initializable{
    Medewerker medewerker;


    //switch statement
    @FXML
    private void switchTo() throws IOException {
        Main.show("reisgegevens", medewerker);
    }

    //Parent methods overrides
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        GsonManager.saveFile();
    }

    @Override
    void setUser(Medewerker medewerker) { 
        this.medewerker = medewerker;      
    }
}
