module com.example.fxml {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.fxml to javafx.fxml;
    exports com.example.fxml;
}