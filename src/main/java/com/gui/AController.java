package com.gui;

import java.io.IOException;

import com.app.Medewerker;

import javafx.fxml.FXML;

public abstract class AController {

    private Medewerker medewerker;

    abstract void setUser(Medewerker medewerker);

    //laat dit even staan gaat mogelijk anders zodat het makkelijker wordt
    // @FXML
    // private void switchToReisGegevens() throws IOException {
    //     Main.show("reisgegevens", user);
    // }

    // @FXML
    // private void switchToLeaderboard() throws IOException {
    //     Main.show("leaderboard", user);
    // }

    // @FXML
    // public void onDBButtonClick() throws IOException {
    //     Main.show("dashboard", user);
    // }
}
