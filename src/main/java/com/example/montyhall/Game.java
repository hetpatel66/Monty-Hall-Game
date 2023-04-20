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
        //Image image = new Image("file:/main/resources/com/example/montyhall/closed_door.png");
        //ImageView imageView = new ImageView(image);
        //imageView.setX(400);
        //imageView.setY(400);
        //root.getChildrenUnmodifiable().add(imageView);and second door item
        Label title = new Label("Welcome to the Monty Hall Show!");
        title.setFont(Font.font("Verdana", 40));
        title.setTextAlignment(TextAlignment.CENTER);
        VBox text = new VBox();
        text.setSpacing(40);
        text.setAlignment(Pos.TOP_LEFT);
        text.setPadding(new Insets(40));
        text.getChildren().addAll(
                new Label("These are the Rules:"),
                new Label("1.The game consists of three doors. Behind one of the doors is a car, and behind the other two doors are goats.  "),
                new Label("2.The player chooses one of the three doors."),
                new Label("3.The game show host, who knows what's behind each door, then opens one of the other two doors to reveal a goat. " +
                        "The door that is opened will always be one that the player did not choose and that does not have the car behind it."),
                new Label("4.The game show host then gives the player the option to switch their choice to the other unopened door, or to stick with their original choice."),
                new Label("5.The player decides whether to stick with their original choice or switch to the other unopened door."),
                new Label("6.The game show host opens the door that the player has chosen, and the player wins whatever prize is behind that door."),
                new Label("7.If the player chose the door with the car behind it, they win a car. If the player chose a door with a goat behind it, they win a goat.")
        );

        BorderPane pane = new BorderPane();
        pane.setTop(title);
        pane.setCenter(text);
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