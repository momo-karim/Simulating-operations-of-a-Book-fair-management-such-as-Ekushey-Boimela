package com.example.finalprojectbookfair;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardController {
    @Deprecated
    public void onExibitorApplication(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onLogOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "hello-view.fxml");
    }

    @javafx.fxml.FXML
    public void manageUserRoleOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void eventProposalModuleOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"eventScheduler.fxml");
    }

    @javafx.fxml.FXML
    public void scheduledEventOnACtion(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void boothAllocationOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void monitoringONAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void complaintsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exibitorApplicationAction(ActionEvent actionEvent) {
    }
}
