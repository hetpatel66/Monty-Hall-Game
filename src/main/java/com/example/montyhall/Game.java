package com.example.montyhall;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

public class Game extends Application implements EventHandler<ActionEvent> {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Game.class.getResource("instructions.fxml"));
        Scene scene = new Scene(root, 1200, 800);
        stage.setTitle("Monty Hall Game");
        stage.setResizable(false);

        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {

    }

    public static void main (String[]args){
        launch();
    }
}