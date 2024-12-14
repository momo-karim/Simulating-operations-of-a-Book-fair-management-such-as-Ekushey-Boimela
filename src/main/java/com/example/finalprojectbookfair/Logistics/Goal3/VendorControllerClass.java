package com.example.finalprojectbookfair.Logistics.Goal3;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.List;

public class VendorControllerClass {
    @FXML
    private TableColumn<VendorMC ,String> ItemsTC;
    @FXML
    private TableColumn<VendorMC ,String> ServiceTC;
    @FXML
    private TableColumn <VendorMC ,String> VendorNameTC;
    @FXML
    private TableView <VendorMC>VendorTCV;
    private List<com.example.finalprojectbookfair.Logistics.Goal3.VendorMC> VendorMC;
    private final ObservableList<VendorMC> vendorList= FXCollections.observableList(VendorMC);


    public void initialize(){
        ItemsTC.setCellValueFactory(new PropertyValueFactory<>("Items"));
        ServiceTC.setCellValueFactory(new PropertyValueFactory<>("Service"));
        VendorNameTC.setCellValueFactory(new PropertyValueFactory<>("Name"));
        populateVendorList();
        VendorTCV.setItems(vendorList);



    }

    private void populateVendorList() {

        vendorList.add(new VendorMC("Chairs, Tables", "Event Setup", "Vendor A"));
        vendorList.add(new VendorMC("Lighting Equipment", "Lighting Services", "Vendor B"));
        vendorList.add(new VendorMC("Audio Equipment", "Sound System", "Vendor C"));
    }







    @javafx.fxml.FXML
    public void BackButtonOnCLIck(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "login.fxml");

    }

    @javafx.fxml.FXML
    public void logoutButtonOnCliCk(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }
}
