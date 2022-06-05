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
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MedewerkerController extends AController implements Initializable {

    private List<Medewerker> users = new ArrayList<>();

    Medewerker medewerker;

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
    private TableView<Medewerker> leaderboard;

    @FXML
    private final TableColumn<Object, Object> namesKolom = new TableColumn<>();

    @FXML
    private final TableColumn<Object, Object> puntenKolom = new TableColumn<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        users = LeaderBoard.getUsers();
        namesKolom.setCellValueFactory(new PropertyValueFactory<>("naam"));
        puntenKolom.setCellValueFactory(new PropertyValueFactory<>("werktijd"));
        ObservableList<Medewerker> data = FXCollections.observableArrayList(users);
        leaderboard.setItems(data);
        namesKolom.setSortable(false);
            leaderboard.setRowFactory(tv -> new TableRow<>() {
            @Override
            protected void updateItem(Medewerker item, boolean empty) {
                super.updateItem(item, empty);
                if (item.getWerktijd() == 270)
                    setStyle("-fx-background-color: green;");
                else if (item.getWerktijd() == 180)
                    setStyle("-fx-background-color: orange;");
                else if (item.getWerktijd() == 0)
                    setStyle("-fx-background-color: red;");
                else
                    setStyle("-fx-background-color: blue");
            }
        });
    }

    //Override just here because implementations
    @Override
    void setUser(Medewerker medewerker) {}
}
