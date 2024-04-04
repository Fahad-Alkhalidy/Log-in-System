package com.example.loginsystemusingjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    private Parent root;
    private Scene scene;
    private Stage stage;

    @FXML
    TextField userName;

    @FXML
    public void logInToMainPage(ActionEvent e) throws IOException {

        String user = userName.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = loader.load();

        SecondController secondController = loader.getController();
        secondController.communication(user);

//        root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}