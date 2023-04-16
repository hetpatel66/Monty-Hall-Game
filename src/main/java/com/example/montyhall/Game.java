package com.example.montyhall;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Game extends Application implements EventHandler<ActionEvent> {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Game.class.getResource("instructions.fxml"));
        Scene scene = new Scene(root, 1200, 800);
        stage.setTitle("Monty Hall Game");
        stage.setScene(scene);
        stage.show();
    }

    public void handle(ActionEvent event) {

    }



    public static void main(String[] args) {
        launch();
    }
}