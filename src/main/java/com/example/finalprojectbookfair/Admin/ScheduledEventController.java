package com.example.finalprojectbookfair.Admin;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class  ScheduledEventController {


    @FXML
    private TableColumn <Event , LocalDate>PreferreddateTC;
    @FXML
    private TableColumn <Event , String>EquipmentTC;
    @FXML
    private TextField EventNameField;
    @FXML
    private TableColumn<Event , String> LogisticsTC;
    @FXML
    private TableView <Event >EventTC;
    @FXML
    private TableColumn resource;
    @FXML
    private TableColumn <Event , String>eventTilteTC;
    @FXML
    private TableView<Event> ResourcesTV;
    @FXML
    private Label massageLabel;
    @FXML
    private TableColumn <Event , String>TimeDurationTC;
    @FXML
    private TableColumn <Event , String>quantityTC;

    private final ObservableList<Event> events = FXCollections.observableArrayList();
    @FXML
    public void initialize() {
        eventTilteTC.setCellValueFactory(new PropertyValueFactory<>("Event Titel"));
        PreferreddateTC.setCellValueFactory(new PropertyValueFactory<>("Preferred Date"));
        TimeDurationTC.setCellValueFactory(new PropertyValueFactory<>("Time/duration"));
        EquipmentTC.setCellValueFactory(new PropertyValueFactory<>("Equipments"));
        LogisticsTC.setCellValueFactory(new PropertyValueFactory<>("Logistics"));
        resource.setCellValueFactory(new PropertyValueFactory<>("Resource"));
        quantityTC.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        EventTC.setItems(events);



    }


    @FXML
    public void aproveOnAction(ActionEvent actionEvent) {
        Event selectedEvent = EventTC.getSelectionModel().getSelectedItem();
    }

    @FXML
    public void onBackWordButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "adminDashboard.fxml");
    }

    @FXML
    public void onLogOutButtonClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "login.fxml");
    }

    @FXML
    public void createEventOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "createEvent.fxml");



    }
}




