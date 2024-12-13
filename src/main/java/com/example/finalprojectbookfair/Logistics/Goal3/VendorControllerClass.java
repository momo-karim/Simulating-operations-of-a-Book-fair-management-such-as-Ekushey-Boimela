package com.example.finalprojectbookfair.Logistics.Goal3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class VendorControllerClass {
    @FXML
    private TableColumn<VendorMC ,String> ItemsTC;
    @FXML
    private TableColumn<VendorMC ,String> ServiceTC;
    @FXML
    private TableColumn <VendorMC ,String> VendorNameTC;
    @FXML
    private TableView <VendorMC>VendorTCV;

    public void Initialize(){
        ItemsTC.setCellValueFactory(new PropertyValueFactory<>("Items"));
        ServiceTC.setCellValueFactory(new PropertyValueFactory<>("Service"));
        VendorNameTC.setCellValueFactory(new PropertyValueFactory<>("Name"));
        VendorTCV.setItems(getVendorList);
    }
    private ObservableList<VendorMC> getVendorList;{

    }


    @javafx.fxml.FXML
    public void BackButtonOnCLIck(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutButtonOnCliCk(ActionEvent actionEvent) {
    }
}
