package com.example.finalprojectbookfair;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Signin {
    @javafx.fxml.FXML
    private TextField userNameField;
    @javafx.fxml.FXML
    private ComboBox designationCombobox;
    @javafx.fxml.FXML
    private PasswordField passwordFiled;
    @javafx.fxml.FXML
    private ComboBox genderCombobox;

    @javafx.fxml.FXML
    public void onSignInButtonClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }
}
