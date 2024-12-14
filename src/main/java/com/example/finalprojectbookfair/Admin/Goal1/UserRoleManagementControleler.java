package com.example.finalprojectbookfair.Admin.Goal1;

import com.example.finalprojectbookfair.SceneSwitcher;
import com.example.finalprojectbookfair.UserClass;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class UserRoleManagementControleler {
    @javafx.fxml.FXML
    private TableColumn<UserClass, LocalDate> dobTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserClass, String>emailTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserClass, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserClass, String>genderTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserClass, String>designationTableColumn;
    @javafx.fxml.FXML
    private TableView <UserClass>userInformationTableView;
    @javafx.fxml.FXML
    private Label messageLabel;
    private ObservableList <UserClass> userlist;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField PNfield;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private RadioButton femaleRB;
    @javafx.fxml.FXML
    private ToggleGroup tg;
    @javafx.fxml.FXML
    private ComboBox designationComboBox;
    @javafx.fxml.FXML
    private RadioButton maleRB;
    @javafx.fxml.FXML
    private TableColumn PNTableColumn;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    verifiedUsers users;
    public void setter(verifiedUsers users){
        this.users= users ;


    }

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

        dobTableColumn.setCellValueFactory(new PropertyValueFactory<>("Date of Birth"));
        PNTableColumn.setCellValueFactory(new PropertyValueFactory<>("Password"));
        designationComboBox.getItems().addAll("Admin","Logistics","Exibitor","Event Organizer");







    }

    @javafx.fxml.FXML
    public void deleteOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignOnActionButton(ActionEvent actionEvent) {
        String designation,userName, Email, PhoneNumber, gender="" ;
        LocalDate dob;
        userName = nameField.getText();
        Email= emailTextField.getText();
        PhoneNumber= PNfield.getText();
        if (maleRB.isSelected()){
            gender="Male";

        } else if ( femaleRB.isSelected()) {
            gender="female";


        }
        dob= dobDP.getValue();
        designation=(String) designationComboBox.getValue();
        users.assignUser("",userName,"Password",gender,designation,dob,PhoneNumber,Email);



    }

    @javafx.fxml.FXML
    public void logOutbuttonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }

    @javafx.fxml.FXML
    public void backbuttonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "login.fxml");
    }
}