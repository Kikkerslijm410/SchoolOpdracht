package com.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.app.LeaderBoard;
import com.app.Medewerker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MedewerkerController extends AController implements Initializable {

    private List<Medewerker> users = new ArrayList<>();

    Medewerker medewerker;

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
    public void switchToPlanning() throws IOException {
        super.switchToPlanning();
    }
    @FXML
    public void switchToHome() throws IOException {
        super.switchToHome();
    }
    @FXML
    public void switchToVracht() throws IOException {
        super.switchToVracht();
    }
    @FXML
    public void switchToAdd() throws IOException {
        super.switchToAdd();
    }
    @FXML
    public void switchToDelete() throws IOException {
        super.switchToDelete();
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
    public void setUser(Medewerker medewerker) {}
}
