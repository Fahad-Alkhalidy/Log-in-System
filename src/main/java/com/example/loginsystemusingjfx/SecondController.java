package com.example.loginsystemusingjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SecondController {

    @FXML
    Label Label;
    @FXML
    Parent root;
    Scene scene;
    Stage stage;

    Button logout;


    public void communication(String username){
        Label.setText("Hello " + username);
    }

    public void logout(ActionEvent e) throws IOException {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to logout");
        alert.setContentText("Are you sure you want to logout?");

        if(alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            stage.close();
        }

    }

}
