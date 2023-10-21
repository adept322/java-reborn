package com.adept.application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * Application the main class of the program
 * @version 1.0
 * @author Adept
 */

public class Application extends javafx.application.Application {

    /**
     *  Logger by java.util.logging (JUL)
     *  Temporarily replacement of SLF4J logger
     */

    private static final Logger logger = Logger.getLogger(Application.class.getName());

    /**
     *  Method from which the program execution starts
     *  @param stage is the main stage of window
     */

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Simple parser");
        stage.setScene(scene);
        stage.show();
        logger.log(Level.INFO, "Application started");
    }

    /**
     *  Method from which the program execution starts
     *  @param args is arguments
     */

    public static void main(String[] args) {
        launch();
    }
}