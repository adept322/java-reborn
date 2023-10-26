package com.adept.application.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Jsoup Connector links Jsoup and JavaFX application
 * @version 1.0
 * @author Adept
 */

public class JsoupConnector {

    /**
     *  Logger by java.util.logging (JUL)
     *  Temporarily replacement of SLF4J logger
     */

    private static final Logger logger = Logger.getLogger(JsoupConnector.class.getName());

    /**
     *  Method that gets the link and parses its contents
     * @param www the link to the page
     * @return html contents of document
     */

    public static String getDocumentToString(String www) {
        Document page = null;
        try {
            logger.log(Level.INFO, "Successful: parse document");
            page = Jsoup.connect(www).get();
            return page.toString();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error: invalid document");
            return "error";
        }
    }
}
