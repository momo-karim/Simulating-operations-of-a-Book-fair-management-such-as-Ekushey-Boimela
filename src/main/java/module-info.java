module com.example.finalprojectbookfair {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalprojectbookfair to javafx.fxml;


    exports com.example.finalprojectbookfair;
    exports com.example.finalprojectbookfair.Admin;
    opens com.example.finalprojectbookfair.Admin to javafx.fxml;
    exports com.example.finalprojectbookfair.Logistics;
    opens com.example.finalprojectbookfair.Logistics to javafx.fxml;
}