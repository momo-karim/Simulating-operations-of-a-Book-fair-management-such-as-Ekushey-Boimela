module com.example.simulatingoperationsofbookfairmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulatingoperationsofbookfairmanagement to javafx.fxml;
    exports com.example.simulatingoperationsofbookfairmanagement;
}