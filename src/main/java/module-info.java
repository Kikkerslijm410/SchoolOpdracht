module com.gui {
    requires org.apache.poi.ooxml;
    requires transitive com.google.gson;
    requires transitive javafx.base;
    requires transitive javafx.graphics;
    //requires transitive javafx.media;
    requires transitive javafx.controls;
    requires transitive javafx.fxml;

    opens com.gui to javafx.fxml;
    exports com.gui;
    exports com.app;
}
