module com.gui {
    requires org.apache.poi.ooxml;
    requires com.google.gson;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gui to javafx.fxml;
    exports com.gui;
}
