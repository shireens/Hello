module com.example.hello {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens com.example.hello to javafx.fxml;
    exports com.example.hello;
}