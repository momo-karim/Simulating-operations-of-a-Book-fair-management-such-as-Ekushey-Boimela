package com.example.finalprojectbookfair.Admin;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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
        // Set up the table columns
        EventNameColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getEventName()));
        PreferreddateTC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getPreferredDate()));
        LogisticsColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getLogistics()));
        EquipmentColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getEquipment()));
        QuantityColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getQuantity()));
        TimeDurationColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getTimeDuration()));
        ResourcesColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getResources()));

        // Bind data to the table
        EventTable.setItems(events);
    }




}




