package com.gui;

import java.io.IOException;
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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MPlanningController extends AController implements Initializable{

    private List<Medewerker> users = new ArrayList<>();
    private List<Medewerker> planningusers = new ArrayList<>();

    @FXML
    private TextField nummer;

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

    @FXML
    void PMClear() throws IOException {
        LeaderBoard.planningMedewerkers.clear();
        Main.show("MPlanning", medewerker);
    }

    @FXML
    void PMDelete() throws IOException {
        int getal = Integer.parseInt(nummer.getText());
        LeaderBoard.removePlanningUsers(getal);
        Main.show("MPlanning", medewerker);
    }

    @FXML
    void PMAdd() throws IOException {
        int getal = Integer.parseInt(nummer.getText());
        LeaderBoard.addPlanningUsers(getal);
        Main.show("MPlanning", medewerker);
    }

    public void start() {
        users = LeaderBoard.getUsers();
        rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));
        namesKolom.setCellValueFactory(new PropertyValueFactory<>("naam"));
        werktijdColumn.setCellValueFactory(new PropertyValueFactory<>("werktijd"));
        ObservableList<Medewerker> data = FXCollections.observableArrayList(users);
        leaderboard.setItems(data);

        planningusers = LeaderBoard.getPlanningUsers();
        PrankColumn.setCellValueFactory(new PropertyValueFactory<>("Prank"));
        PnamesKolom.setCellValueFactory(new PropertyValueFactory<>("naam"));
        PwerktijdColumn.setCellValueFactory(new PropertyValueFactory<>("werktijd"));
        ObservableList<Medewerker> Pdata = FXCollections.observableArrayList(planningusers);
        Planningleaderboard.setItems(Pdata);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        start();
    }

    //Override just here because implementations
    @Override
    public void setUser(Medewerker medewerker) {}
}
