module com.example.cofeshopmanagmentsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;
    requires jasperreports;


    opens com.example.cofeshopmanagmentsystem to javafx.fxml;
    exports com.example.cofeshopmanagmentsystem;
}