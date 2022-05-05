module com.app {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.poi.ooxml;

    opens com.app to javafx.fxml;
    exports com.app;
}
