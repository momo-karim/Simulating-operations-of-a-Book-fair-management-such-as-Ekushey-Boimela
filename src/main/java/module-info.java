module com.example.finalprojectbookfair {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalprojectbookfair to javafx.fxml;


    exports com.example.finalprojectbookfair;
}