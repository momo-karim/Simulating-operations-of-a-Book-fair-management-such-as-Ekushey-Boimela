package com.example.finalprojectbookfair.Logistics.Goal5;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class venumaintenanceController {
    @javafx.fxml.FXML
    private TableColumn cleaningTC;
    @javafx.fxml.FXML
    private TableView MaintenanceRequestTV;
    @javafx.fxml.FXML
    private TableColumn repairsTC;
    @javafx.fxml.FXML
    private TableColumn TallnoTC;
    @javafx.fxml.FXML
    private TableColumn adjustmentTC;

    @javafx.fxml.FXML
    public void logOutButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "login.fxml");
    }

    @javafx.fxml.FXML
    public void backButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"LogisticDashboard.fxml");
    }
}
