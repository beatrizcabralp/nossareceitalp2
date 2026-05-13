module com.example.nossareceitalp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nossareceitalp2 to javafx.fxml;
    exports com.example.nossareceitalp2;
}