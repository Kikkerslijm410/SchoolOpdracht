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
    private TableView<Medewerker> Dleaderboard;

    @FXML
    private final TableColumn<Object, Object> DrankColumn = new TableColumn<>();

    @FXML
    private final TableColumn<Object, Object> DnamesKolom = new TableColumn<>();

    @FXML
    private final TableColumn<Object, Object> DwerktijdColumn = new TableColumn<>();

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

    //just here to make sure deleted users arent in the planningMedewerkers arraylist
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
        DrankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));
        DnamesKolom.setCellValueFactory(new PropertyValueFactory<>("naam"));
        DwerktijdColumn.setCellValueFactory(new PropertyValueFactory<>("werktijd"));
        ObservableList<Medewerker> data = FXCollections.observableArrayList(users);
        Dleaderboard.setItems(data);
    }

    //Override just here because implementations
    @Override
    public void setUser(Medewerker medewerker) {}   
}
