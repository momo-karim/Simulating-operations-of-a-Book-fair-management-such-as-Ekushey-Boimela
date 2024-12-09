package com.example.finalprojectbookfair;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

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
    ArrayList<admin> adminArrayList=new ArrayList<>();
    ArrayList<Logistics>logisticsArrayList=new ArrayList<>();

    public void setAdminArrayList(ArrayList<admin> adminArrayList) {
        this.adminArrayList = adminArrayList;
    }

    @FXML
    public void initialize(){
        admin Admin =new admin("Id","admin","asdw","male","admin", LocalDate.now());
        adminArrayList.add(Admin);
        System.out.println(Admin);

    }







    @FXML
    public void onLoginButton(ActionEvent actionEvent) throws IOException {

        AdminDashboardController ADC=SceneSwitcher.switchScene(actionEvent,"adminDashboard.fxml");
        ADC.setArrayList(adminArrayList);




        //SceneSwitcher.switchScene(actionEvent,"adminDashboard.fxml");
        //data passing
        //HelloController hc= fxmlLoader.getController();
        //hc.setStudList(Studlist);


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