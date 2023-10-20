package com.adept.application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main-view.fxml"));                 // load fxml view
        Scene scene = new Scene(fxmlLoader.load());                                                                    // make a scene
        stage.setTitle("Simple parser");                                                                               // set title in window
        stage.setScene(scene);                                                                                         // set scene to stage
        stage.show();                                                                                                  // show stage
    }

    public static void main(String[] args) {
        launch();
    }
}