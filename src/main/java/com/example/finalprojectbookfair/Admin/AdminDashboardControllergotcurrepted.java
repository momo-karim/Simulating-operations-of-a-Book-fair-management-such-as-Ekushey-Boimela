package com.example.finalprojectbookfair.Admin;

import com.example.finalprojectbookfair.HelloController;
import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;

public class AdminDashboardControllergotcurrepted {
    //public void setter()throws IOException{}
    admin Admin;
    public void setter(admin Admin) {
        this.Admin = Admin;
    }





    @Deprecated
    public void onExibitorApplication(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onLogOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "hello-view.fxml");
    }

    @javafx.fxml.FXML
    public void manageUserRoleOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader((getClass().getResource("/com/example/finalprojectbookfair/Admin/Goal1/UserManagement.fxml")));
        Node node= fxmlLoader.load();
        HelloController hc= fxmlLoader.getController();
        hc.setter(Admin);


        // SceneSwitcher.switchScene(actionEvent,"/com/example/finalprojectbookfair/UserManagement.fxml");


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
