module com.example.electronicdevices1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.electronicdevices1 to javafx.fxml;
    exports com.example.electronicdevices1;
}