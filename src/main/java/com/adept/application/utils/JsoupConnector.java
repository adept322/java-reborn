package com.adept.application.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupConnector {

    // Method for connect Jsoup with JavaFX Application
    public static String getDocument(String url) throws IOException {
        Document page = Jsoup.connect(url).get();
        return page.toString();
    }
}
