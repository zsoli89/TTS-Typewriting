module com.zsoli.ttstypewriting {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires jakarta.persistence;

    opens com.zsoli.ttstypewriting to javafx.fxml;
    exports com.zsoli.ttstypewriting;
}