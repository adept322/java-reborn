package com.adept.application.controllers;

import com.adept.application.utils.JsoupConnector;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MainController {

    @FXML
    private TextArea textArea;

    @FXML
    private TextField searchField;

    @FXML
    protected void onSearchButtonClock() throws IOException {
        String www = searchField.getText();
        textArea.setText(JsoupConnector.getDocument(www));
    }
}