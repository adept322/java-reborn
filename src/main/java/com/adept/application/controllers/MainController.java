package com.adept.application.controllers;

import com.adept.application.utils.JsoupConnector;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
     *  Methods that handles button actions
     */

    @FXML
    protected void onSearchButtonClick() {
        logger.log(Level.INFO, "Successful: search button clicked");
        String www = searchField.getText();
        textArea.setText(JsoupConnector.getDocumentToString(www));
    }

    @FXML
    protected void onMenuHelpButtonClick() {
        logger.log(Level.INFO, "Successful: help menu button clicked");
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                logger.log(Level.INFO, "Successful: open help in browser");
                Desktop.getDesktop().browse(new URI("https://github.com/adept322/simple-parser"));
            } catch (IOException | URISyntaxException e) {
                logger.log(Level.SEVERE, "Error");
            }
        }
    }
}