package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public final static String CHROME = "CHROME_DRIVER";
    public final static String FIREFOX = "FIREFOX_DRIVER";

    public static WebDriver getDriver(final String driver) {

        System.setProperty("webdriver.chrome.driver", "/home/username/Dokumenty/Development/Kodilla/chromedriver_linux64/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/home/username/Dokumenty/Development/Kodilla/geckodriver-v0.20.0-linux64/geckodriver");

        switch (driver) {
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
            default:
                return null;
        }
    }
}
