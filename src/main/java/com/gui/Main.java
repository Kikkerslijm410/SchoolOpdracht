package com.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import com.app.Medewerker;

public class Main extends Application{

    private static Stage primaryStage;
    private static AnchorPane mainLayout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage ps) throws Exception {
        primaryStage = ps;
        primaryStage.getIcons().add(new Image("file:src/main/resources/com/gui/Images/logo.jpg"));
        Medewerker medewerker = null;
        show("dashboard", medewerker);
    }

    public static void show(String fxml, Medewerker user) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource(fxml + ".fxml"));
        mainLayout = loader.load();

        AController controller = loader.getController();
        controller.setUser(user);

        Scene scene = new Scene(mainLayout, 480, 640);
        primaryStage.setScene(scene);
        String c = fxml.substring(0, 1).toUpperCase();
        String title = c + fxml.substring(1);
        primaryStage.setTitle(title);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
