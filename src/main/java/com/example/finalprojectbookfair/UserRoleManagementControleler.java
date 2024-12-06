package com.example.finalprojectbookfair;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class UserRoleManagementControleler {
    @javafx.fxml.FXML
    private TableColumn<UserClass, LocalDate> dobTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserClass, String>emailTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserClass, String>idTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserClass, String> passswordTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserClass, String> nameTableColumn;
    @javafx.fxml.FXML
    private TextField useridField;
    @javafx.fxml.FXML
    private TableColumn <UserClass, String>genderTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserClass, String>designationTableColumn;
    @javafx.fxml.FXML
    private ComboBox selectRoleComboBox;
    @javafx.fxml.FXML
    private TableView <UserClass>userInformationTableView;
    @javafx.fxml.FXML
    private Label messageLabel;
    private ObservableList <UserClass> userlist;

    public UserRoleManagementControleler(ObservableList<UserClass> userlist) {
        this.userlist = userlist;
        userInformationTableView.setItems(userlist);

    }

    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<>("Email"));
        designationTableColumn.setCellValueFactory(new PropertyValueFactory<>("Designation"));
        genderTableColumn.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        idTableColumn.setCellValueFactory(new PropertyValueFactory<>("Id"));
        dobTableColumn.setCellValueFactory(new PropertyValueFactory<>("Date of Birth"));
        passswordTableColumn.setCellValueFactory(new PropertyValueFactory<>("Password"));
        selectRoleComboBox.getItems().addAll("Admin","Logistics");
        useridField.getId();




    }

    @javafx.fxml.FXML
    public void deleteOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logOutbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backbuttonOnClick(ActionEvent actionEvent) {
    }
}