package com.example.finalprojectbookfair.Logistics.Goal4;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class PendingdeliveriesController {
    @javafx.fxml.FXML
    private TableColumn nameTC;
    @javafx.fxml.FXML
    private TableColumn deliveryTimeTC;
    @javafx.fxml.FXML
    private TableColumn pickUpLocationTC;
    @javafx.fxml.FXML
    private TableView deliveryTV;
    @javafx.fxml.FXML
    private TableColumn dropLocationTc;
    @javafx.fxml.FXML
    private TableColumn itemTC;
    @javafx.fxml.FXML
    private TableColumn deliveryDateTC;

    @javafx.fxml.FXML
    public void logOutbuttonOnCliCk(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "login.fxml");
    }

    @javafx.fxml.FXML
    public void backButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void mainMenubuttonOnClick(ActionEvent actionEvent) {
    }
}
