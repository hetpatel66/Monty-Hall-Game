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
import java.util.Random;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    Random rand = new Random();
    private int winDoor = rand.nextInt((3 - 1) + 1) + 1;
    private boolean doorOne = false;
    private boolean doorTwo = false;
    private boolean doorThree = false;

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
    ImageView item3View;
    Image openDoorImg = new Image(getClass().getResourceAsStream("open_door.png"));
    Image car = new Image(getClass().getResourceAsStream("car.png"));

    public void switchToGameScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Game.class.getResource("game.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,1200, 800);

        stage.setScene(scene);
        stage.show();

        if (winDoor == 1){
            item1View.setImage(car);
        }
        else if (winDoor == 2){
            item2View.setImage(car);
        }
        else{
            item3View.setImage(car);
        }
    }

    public void pickDoor1(){
        if (winDoor == 2 && doorThree == false){
            door3View.setImage(openDoorImg);
            doorThree = true;
        }
        else if (winDoor == 3 && doorTwo == false){
            door2View.setImage(openDoorImg);
            doorTwo = true;
        }
        else{
            door1View.setImage(openDoorImg);
        }
    }
    public void pickDoor2(){
        if (winDoor == 3 && doorOne == false){
            door1View.setImage(openDoorImg);
            doorOne = true;
        }
        else if (winDoor == 1 && doorThree == false){
            door3View.setImage(openDoorImg);
            doorThree = true;
        }
        else{
            door2View.setImage(openDoorImg);
        }
    }
    public void pickDoor3(){
        if (winDoor == 1 && doorTwo == false){
            door2View.setImage(openDoorImg);
            doorTwo = true;
        }
        else if (winDoor == 2 && doorOne == false){
            door1View.setImage(openDoorImg);
            doorOne = true;
        }
        else{
            door3View.setImage(openDoorImg);
        }
    }

}