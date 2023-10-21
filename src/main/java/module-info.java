module com.adept.application {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;
    requires java.logging;



    opens com.adept.application to javafx.fxml;
    exports com.adept.application;
    exports com.adept.application.utils;
    opens com.adept.application.utils to javafx.fxml;
    exports com.adept.application.controllers;
    opens com.adept.application.controllers to javafx.fxml;
}