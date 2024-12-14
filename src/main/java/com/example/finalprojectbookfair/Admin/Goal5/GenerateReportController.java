package com.example.finalprojectbookfair.Admin.Goal5;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.time.LocalDate;

public class GenerateReportController {

    @FXML
    private TableView<Reports> reportsTable;
    @FXML
    private TableColumn<Reports, String> reportNameColumn;
    @FXML
    private TableColumn<Reports, LocalDate> reportDateColumn;
    @FXML
    private TableColumn<Reports, String> generatedByColumn;

    @FXML
    public void onBack(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchScene(actionEvent, "adminDashboard.fxml");
    }
}
