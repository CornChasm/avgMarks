module com.example.znamky {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.znamky to javafx.fxml;
    exports com.example.znamky;
}