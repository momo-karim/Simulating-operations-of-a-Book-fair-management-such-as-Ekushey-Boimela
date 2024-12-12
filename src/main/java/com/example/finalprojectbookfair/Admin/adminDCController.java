package com.example.finalprojectbookfair.Admin;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class adminDCController {
    public void setter() throws IOException{

    }
    admin Admin;
    public void setter(admin Admin) {
        this.Admin = Admin;
    }

    @javafx.fxml.FXML
    public void manageUserRoleOnAction(ActionEvent actionEvent) throws IOException {



    }

    @javafx.fxml.FXML
    public void eventProposalModuleOnAction(ActionEvent actionEvent) throws IOException {

    }

    @javafx.fxml.FXML
    public void scheduledEventOnACtion(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"eventScheduler.fxml");
    }

    @javafx.fxml.FXML
    public void onLogOut(ActionEvent actionEvent) {
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
