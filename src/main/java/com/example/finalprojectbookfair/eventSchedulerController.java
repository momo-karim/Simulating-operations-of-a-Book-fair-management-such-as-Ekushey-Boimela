package com.example.finalprojectbookfair;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class eventSchedulerController {
    @javafx.fxml.FXML
    private Label massageLabel;

    @javafx.fxml.FXML
    public void createEventOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onBackWordButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "adminDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void onLogOutButtonClick(ActionEvent actionEvent) {
    }
}
