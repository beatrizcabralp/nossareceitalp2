module com.example.nossareceitalp2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;


    opens com.example.nossareceitalp2 to javafx.fxml;
    exports com.example.nossareceitalp2;
}