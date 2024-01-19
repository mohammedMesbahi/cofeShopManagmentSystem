module com.example.cofeshopmanagmentsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires java.sql;
    requires jasperreports;

    opens com.example.cofeshopmanagmentsystem to javafx.fxml;
    exports com.example.cofeshopmanagmentsystem;
}