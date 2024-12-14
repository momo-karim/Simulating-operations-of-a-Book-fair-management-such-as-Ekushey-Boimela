package com.example.finalprojectbookfair.Admin.Goal2;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.IOException;

public class exibitorApplicationCOntroller {

    @FXML
    private TableView<Exhibitor> ExibitorApplicationListTV;
    @FXML
    private TableColumn<Exhibitor, String> PhoneNoTC;
    @FXML
    private TableColumn<Exhibitor, String> nameTC;
    @FXML
    private TableColumn<Exhibitor, String> statusTC;
    @FXML
    private TableColumn<Exhibitor, String> TypeOfStallTC;
    @FXML
    private TableColumn<Exhibitor, String> ComPanyNameTC;
    @FXML
    private ComboBox<String> companyNameCB;
    @FXML
    private Button Approve;
    @FXML
    private Label messageLabel;

    private final ObservableList<Exhibitor> exhibitors = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        PhoneNoTC.setCellValueFactory(new PropertyValueFactory<>("phoneNo"));
        ComPanyNameTC.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        TypeOfStallTC.setCellValueFactory(new PropertyValueFactory<>("typeOfStall"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));


        ExibitorApplicationListTV.setItems(exhibitors);


        exhibitors.add(new Exhibitor("Alice", "123456789", "ABC Corp", "Food Stall", "Pending"));
        exhibitors.add(new Exhibitor("Bob", "987654321", "XYZ Inc", "Book Stall", "Pending"));


        companyNameCB.setItems(FXCollections.observableArrayList("ABC Corp", "XYZ Inc", "DEF Ltd"));
    }

    @FXML
    public void ApprovebuttonOnClIk(ActionEvent actionEvent) {
        Exhibitor selectedExhibitor = ExibitorApplicationListTV.getSelectionModel().getSelectedItem();
        if (selectedExhibitor != null) {
            selectedExhibitor.setStatus("Approved");
            ExibitorApplicationListTV.refresh();
            messageLabel.setText("Exhibitor approved successfully!");
        } else {
            messageLabel.setText("Please select an exhibitor to approve.");
        }
    }

    @FXML
    public void rejectButtonOnCLiCk(ActionEvent actionEvent) {
        Exhibitor selectedExhibitor = ExibitorApplicationListTV.getSelectionModel().getSelectedItem();
        if (selectedExhibitor != null) {
            selectedExhibitor.setStatus("Rejected");
            ExibitorApplicationListTV.refresh();
            messageLabel.setText("Exhibitor rejected successfully!");
        } else {
            messageLabel.setText("Please select an exhibitor to reject.");
        }
    }

    @FXML
    public void backbuttonOnClick(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchScene(actionEvent, "adminDashboard.fxml");
    }

    @FXML
    public void logoutbuttonOnClick(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchScene(actionEvent, "login.fxml");
        messageLabel.setText("Logged out successfully.") ;
    }
}