package com.example.finalprojectbookfair;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class resetpasswordController {
    @javafx.fxml.FXML
    private TextField userNameTextField;
    @javafx.fxml.FXML
    private Label messegeLabel;
    @javafx.fxml.FXML
    private TextField newPasswordtextField;
    @javafx.fxml.FXML
    private TextField confirmPasswordTextField;

    @javafx.fxml.FXML
    public void onConfirm(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }
}
