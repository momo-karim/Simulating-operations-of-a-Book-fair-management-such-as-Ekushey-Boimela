package com.example.finalprojectbookfair.Logistics;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class Logisticsdashboardcontroller {
    @javafx.fxml.FXML
    public void VendorOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"UserManagement.fxml");
    }

    @javafx.fxml.FXML
    public void StallAllocationOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void VenueMaintenanceOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void TransportationAndDeliveryOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void InventoryOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CommunicationCoordinateOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void EmergencyResponceOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void EventSchedulebuttonOnClick(ActionEvent actionEvent) {
    }
}
