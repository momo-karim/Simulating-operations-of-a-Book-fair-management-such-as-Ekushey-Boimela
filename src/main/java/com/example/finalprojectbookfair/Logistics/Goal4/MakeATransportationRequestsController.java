package com.example.finalprojectbookfair.Logistics.Goal4;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;
import java.time.LocalDate;

public class MakeATransportationRequestsController {
    @javafx.fxml.FXML
    private DatePicker deliveryDateDP;
    @javafx.fxml.FXML
    private ToggleGroup tg;
    @javafx.fxml.FXML
    private TextField DropoffLocationField;
    @javafx.fxml.FXML
    private TextField vendorNameField;
    @javafx.fxml.FXML
    private TextField deliveryTimeField;
    @javafx.fxml.FXML
    private TextField pickUpLoactionField;
    @javafx.fxml.FXML
    private ComboBox deliveryItemsComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;

//    @javafx.fxml.FXML
//    public void mainMenuButtonOnClick(ActionEvent actionEvent) {
//    }

    @javafx.fxml.FXML
    public void pendingDeliveiresButtonOnClIck(ActionEvent actionEvent) throws IOException {
        PendingdeliveriesController PDC=SceneSwitcher.switchScene(actionEvent, "pendingDeliveries.fxml");
    }

    @javafx.fxml.FXML
    public void confirmButtonOnClick(ActionEvent actionEvent) {
        String vendorName = vendorNameField.getText().trim();
        String pickupLocation = pickUpLoactionField.getText().trim();
        String dropoffLocation = DropoffLocationField.getText().trim();
        String deliveryTime = deliveryTimeField.getText().trim();
        //String deliveryItem = deliveryItemsComboBox.getSelectionModel().getSelectedItem();
        LocalDate deliveryDate = deliveryDateDP.getValue();
        if (vendorName.isEmpty() || pickupLocation.isEmpty() || dropoffLocation.isEmpty() ||
                deliveryTime.isEmpty()  || deliveryDate == null) {
            messageLabel.setText("Please fill in all the fields.");
            messageLabel.setStyle("-fx-text-fill: red;");
            return;
        }
        RadioButton selectedToggle = (RadioButton) tg.getSelectedToggle();
        String deliveryType = selectedToggle != null ? selectedToggle.getText() : "Standard";
        DeliveryRequest request = new DeliveryRequest(vendorName, pickupLocation, dropoffLocation, deliveryDate, deliveryTime, "deliveryItem", deliveryType);
        messageLabel.setText("Transportation request confirmed!");
        messageLabel.setStyle("-fx-text-fill: green;");


    }


    @javafx.fxml.FXML
    public void logoutButtonOnCliCk(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "login.fxml");
    }

    @javafx.fxml.FXML
    public void BackButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "LogisticDashboard.fxml");
    }
}
