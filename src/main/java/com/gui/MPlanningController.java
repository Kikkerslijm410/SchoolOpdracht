package com.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.app.LeaderBoard;
import com.app.Medewerker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MPlanningController extends AController implements Initializable{

    private List<Medewerker> users = new ArrayList<>();
    private List<Medewerker> planningusers = new ArrayList<>();


    Medewerker medewerker;

    //leaderboard 1 alle medewerkers
    @FXML
    private TableView<Medewerker> leaderboard;

    @FXML
    private final TableColumn<Object, Object> rankColumn = new TableColumn<>();

    @FXML
    private final TableColumn<Object, Object> namesKolom = new TableColumn<>();

    @FXML
    private final TableColumn<Object, Object> werktijdColumn = new TableColumn<>();

    //leaderboard 2 alleen de medewerkers voor de planning
    @FXML
    private TableView<Medewerker> Planningleaderboard;

    @FXML
    private final TableColumn<Object, Object> PrankColumn = new TableColumn<>();

    @FXML
    private final TableColumn<Object, Object> PnamesKolom = new TableColumn<>();

    @FXML
    private final TableColumn<Object, Object> PwerktijdColumn = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    //Parent methods overrides
    @Override
    public void setUser(Medewerker medewerker) {
        start();       
    }

    public void start() {
        users = LeaderBoard.getUsers();
        rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));
        namesKolom.setCellValueFactory(new PropertyValueFactory<>("naam"));
        werktijdColumn.setCellValueFactory(new PropertyValueFactory<>("werktijd"));
        ObservableList<Medewerker> data = FXCollections.observableArrayList(users);
        leaderboard.setItems(data);

        users = LeaderBoard.getPlanningUsers();
        System.out.println(users.size());
        PrankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));
        PnamesKolom.setCellValueFactory(new PropertyValueFactory<>("naam"));
        PwerktijdColumn.setCellValueFactory(new PropertyValueFactory<>("werktijd"));
        ObservableList<Medewerker> Pdata = FXCollections.observableArrayList(users);
        Planningleaderboard.setItems(Pdata);
    }
}
