package com.example.montyhall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    ImageView door1View;
    @FXML
    ImageView item1View;
    @FXML
    ImageView door2View;
    @FXML
    ImageView item2View;
    @FXML
    ImageView door3View;
    @FXML
    //ImageView item3View;
    Image openDoorImg = new Image(getClass().getResourceAsStream("open_door.png"));
    Image goatImg = new Image(getClass().getResourceAsStream("goat.png"));
    Image carImg = new Image(getClass().getResourceAsStream("car.png"));

    public void switchToGameScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Game.class.getResource("game.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,1200, 800);

        stage.setScene(scene);
        stage.show();
    }

    public void openDoor1(){
        door1View.setImage(openDoorImg);
    }

    public void openDoor2(){
        door2View.setImage(openDoorImg);
    }
    public void openDoor3(){
        door3View.setImage(openDoorImg);
    }

}