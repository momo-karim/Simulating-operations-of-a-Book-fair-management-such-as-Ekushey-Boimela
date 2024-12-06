package com.example.finalprojectbookfair;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class Signincontroller {
    @javafx.fxml.FXML
    private TextField userNameField;
    @javafx.fxml.FXML
    private ComboBox <String>designationCombobox;
    @javafx.fxml.FXML
    private PasswordField passwordFiled;
    @javafx.fxml.FXML
    private ComboBox <String>genderCombobox;
    private ObservableList<UserClass>  userlist= FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private DatePicker datepicker;


    @javafx.fxml.FXML
    public void initialize(){
        genderCombobox.getItems().addAll("Male","female","Others");
        designationCombobox.getItems().addAll("Admin","Logistics");

    }

    @javafx.fxml.FXML
    public void onSignInButtonClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");

        String Name= userNameField.getText();
        String Password= passwordFiled.getText();
        String Gender =genderCombobox.getSelectionModel().getSelectedItem();
        String designation =designationCombobox.getSelectionModel().getSelectedItem();
        LocalDate dob = datepicker.getValue();
        UserClass newuser= new UserClass("id",Name, Password,Gender,designation,dob);
        userlist.add(newuser);



    }
}
