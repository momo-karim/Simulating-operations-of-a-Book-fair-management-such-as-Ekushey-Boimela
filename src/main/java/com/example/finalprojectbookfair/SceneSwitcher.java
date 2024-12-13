package com.example.finalprojectbookfair;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.ArrayList;

public class SceneSwitcher {

    public static <T> T switchScene(ActionEvent event, String fxmlFile) throws IOException {
        FXMLLoader loader = new FXMLLoader(SceneSwitcher.class.getResource(fxmlFile));
        Parent root = loader.load();
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

        return loader.getController();
    }

    public static void switchSceneWithData(ActionEvent event, String fxmlFile, ArrayList<UserClass> userList) throws IOException {
        FXMLLoader loader = new FXMLLoader(SceneSwitcher.class.getResource(fxmlFile));
        Parent root = loader.load();

        // Dynamically check the controller type
        Object controller = loader.getController();

        if (controller instanceof HelloController) {
            HelloController helloController = (HelloController) controller;
            helloController.setUserList(userList);
        } else if (controller instanceof Signincontroller) {
            Signincontroller signinController = (Signincontroller) controller;
            signinController.setUser(userList);
        } else {
            throw new IllegalStateException("Controller type not recognized: " + controller.getClass().getName());
        }

        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}