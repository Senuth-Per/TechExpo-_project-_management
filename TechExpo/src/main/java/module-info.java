module com.example.cwex1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.cwex1 to javafx.fxml;
    exports com.example.cwex1;
}