module com.example.javafx41a {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafx41a to javafx.fxml;
    exports com.example.javafx41a;
}