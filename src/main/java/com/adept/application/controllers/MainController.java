package com.adept.application.controllers;

import com.adept.application.utils.JsoupConnector;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Main Controller is in charge of event processing on the main-view.xml form
 * @version 1.0
 * @author Adept
 */

public class MainController {

    /**
     *  Logger by java.util.logging (JUL)
     *  Temporarily replacement of SLF4J logger
     */

    private static final Logger logger = Logger.getLogger(MainController.class.getName());

    /**
     *  The text area where the contents of the document are placed
     */

    @FXML
    private TextArea textArea;

    /**
     *  The text field where the search link are placed
     */

    @FXML
    private TextField searchField;

    /**
     *  Method that handles button actions
     */

    @FXML
    protected void onSearchButtonClick() {
        logger.log(Level.INFO, "Button clicked");
        String www = searchField.getText();
        textArea.setText(JsoupConnector.getDocument(www));
    }
}