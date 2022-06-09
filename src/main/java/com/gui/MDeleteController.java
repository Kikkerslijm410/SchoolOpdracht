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

    @FXML
    private void MedewerkerDelete() throws IOException {
        if (!nummer.getText().isBlank()){
            int getal = Integer.parseInt(nummer.getText());
            Pcheck(getal-1);
            LeaderBoard.medewerkers.remove(getal-1);
            GsonManager.saveFile();
        }
        Main.show("MDelete", medewerker);
    }

    private void Pcheck(int getal) {
        for (int i = 0; i < LeaderBoard.planningMedewerkers.size(); i++){
            if (LeaderBoard.medewerkers.get(getal).getNaam().equals(LeaderBoard.planningMedewerkers.get(i).getNaam())){
                LeaderBoard.planningMedewerkers.remove(i);
            }
        }
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
