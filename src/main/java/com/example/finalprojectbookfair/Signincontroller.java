package com.example.finalprojectbookfair;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Signincontroller {
    @javafx.fxml.FXML
    private TextField userNameField;
    @javafx.fxml.FXML
    private ComboBox <String>designationCombobox;
    @javafx.fxml.FXML
    private PasswordField passwordFiled;
    @javafx.fxml.FXML
    private ComboBox <String>genderCombobox;
    @javafx.fxml.FXML
    public void initialize(){
        genderCombobox.getItems().addAll("Male","female","Others");
        designationCombobox.getItems().addAll("Admin","Logistics");

    }

    @javafx.fxml.FXML
    public void onSignInButtonClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }
}
