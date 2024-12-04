package com.example.finalprojectbookfair;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Button signUpbutton;
    @FXML
    private TextField userIdTextField;
    @FXML
    private Button forgetPassWordButton;
    @FXML
    private Button lohinbutton;
    @FXML
    private Label messageLabel;



    @FXML
    public void onLoginButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"adminDashboard.fxml");
    }

    @FXML
    public void onForgetPassword(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"resetpassword.fxml");
    }

    @FXML
    public void onSignUp(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"signin.fxml");

    }
}