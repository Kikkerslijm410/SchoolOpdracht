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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PlanningController extends AController implements Initializable {

    Medewerker medewerker;

    private List<Medewerker> planningUsers = new ArrayList<>();

    @FXML
    private TableView<Medewerker> Planningleaderboard;

    @FXML
    private final TableColumn<Object, Object> rankColumn = new TableColumn<>();

    @FXML
    private final TableColumn<Object, Object> namesKolom = new TableColumn<>();

    @FXML
    private final TableColumn<Object, Object> werktijdColumn = new TableColumn<>();

    //switch statements
    @FXML
    public void switchToMedewerker() throws IOException {
        super.switchToMedewerker();
    }
    @FXML
    public void switchToHome() throws IOException {
        super.switchToHome();
    }
    @FXML
    public void switchToVracht() throws IOException {
        super.switchToVracht();
    }

    //managing planningUsers leaderboard
    public void addPlanningUsers(int medewerker){
        LeaderBoard.planningMedewerkers.add(LeaderBoard.medewerkers.get(medewerker-1));
    }
    public void deletePlanningUsers(int medewerker){
        LeaderBoard.planningMedewerkers.remove(medewerker-1);
    }
    public void clearPlanningUsers(){
        LeaderBoard.planningMedewerkers.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        planningUsers = LeaderBoard.getPlanningUsers();
        rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));
        namesKolom.setCellValueFactory(new PropertyValueFactory<>("naam"));
        werktijdColumn.setCellValueFactory(new PropertyValueFactory<>("werktijd"));
        ObservableList<Medewerker> data = FXCollections.observableArrayList(planningUsers);
        Planningleaderboard.setItems(data);
    }

    //Override just here because implementations
    @Override
    public void setUser(Medewerker medewerker) {}    
}
