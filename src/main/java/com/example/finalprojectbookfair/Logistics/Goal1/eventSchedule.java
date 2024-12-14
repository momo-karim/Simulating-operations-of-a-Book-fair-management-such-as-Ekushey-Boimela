package com.example.finalprojectbookfair.Logistics.Goal1;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class  eventSchedule {
    @FXML
    private TableColumn<Event,String> timeTC;
    @FXML
    private TableColumn <Event,String> locationTC;

    private TableColumn <Event,String> LogisticsTC;
    @FXML
    private TableView <Event>eventscheduleTVC;
    @FXML
    private TableColumn<Event,String> equipmentTC;
    @FXML
    private Label massageLabel;
    @FXML
    private TableColumn <Event, LocalDate>dateTC;
    @FXML
    private TableColumn <Event,String>eventTitelTC;
    @FXML
    public void initialize() {
        eventTitelTC.setCellValueFactory(new PropertyValueFactory<>("Event Titel"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("Preferred Date"));
        timeTC.setCellValueFactory(new PropertyValueFactory<>("Time/duration"));
        equipmentTC.setCellValueFactory(new PropertyValueFactory<>("Equipments"));
        LogisticsTC.setCellValueFactory(new PropertyValueFactory<>("Logistics"));
        locationTC.setCellValueFactory(new PropertyValueFactory<>("Location"));

        ObservableList<Event> eventL = null;
        eventscheduleTVC.setItems(eventL);



    }

    @FXML
    public void LogoutButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "login.fxml");

    }

    @FXML
    public void backButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"LogisticDashboard.fxml");
    }
}

