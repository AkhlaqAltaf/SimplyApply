module com.example.simplyapply {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.simplyapply to javafx.fxml;
    exports com.example.simplyapply;
    exports Animation;
    opens Animation to javafx.fxml;
    exports AdminControler;
    opens AdminControler to javafx.fxml;
}