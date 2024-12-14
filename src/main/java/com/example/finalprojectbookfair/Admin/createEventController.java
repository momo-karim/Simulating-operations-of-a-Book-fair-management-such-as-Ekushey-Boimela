package com.example.finalprojectbookfair.Admin;

import com.example.finalprojectbookfair.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class  createEventController {
    @javafx.fxml.FXML
    private Label messsageLabel;

    @javafx.fxml.FXML
    public void onBackWordButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onLogOutButtonClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }
}
