package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    private static final String SEARCHNAME = "_nkw";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        assert driver != null;
        driver.get("https://www.ebay.com");

        WebElement searchField = driver.findElement(By.name(SEARCHNAME));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
