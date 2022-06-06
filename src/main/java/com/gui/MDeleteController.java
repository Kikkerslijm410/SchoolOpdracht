package com.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.app.GsonManager;
import com.app.LeaderBoard;
import com.app.Medewerker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MDeleteController extends AController implements Initializable{

    private List<Medewerker> users = new ArrayList<>();

    Medewerker medewerker;

    @FXML
    private TextField nummer;

    @FXML
    private TableView<Medewerker> leaderboard;

    @FXML
    private final TableColumn<Object, Object> rankColumn = new TableColumn<>();

    @FXML
    private final TableColumn<Object, Object> namesKolom = new TableColumn<>();

    @FXML
    private final TableColumn<Object, Object> werktijdColumn = new TableColumn<>();

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
    private void MedewerkerDelete() throws IOException {
        int getal = Integer.parseInt(nummer.getText());
        LeaderBoard.medewerkers.remove(getal-1);
        GsonManager.saveFile();
        Main.show("MDelete", medewerker);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        users = LeaderBoard.getUsers();
        rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));
        namesKolom.setCellValueFactory(new PropertyValueFactory<>("naam"));
        werktijdColumn.setCellValueFactory(new PropertyValueFactory<>("werktijd"));
        ObservableList<Medewerker> data = FXCollections.observableArrayList(users);
        leaderboard.setItems(data);
    }

    //Override just here because implementations
    @Override
    void setUser(Medewerker medewerker) {}   
}
