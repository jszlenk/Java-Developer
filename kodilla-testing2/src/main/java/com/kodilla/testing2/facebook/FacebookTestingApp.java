package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private static final String XPATH_FIRSTNAME = "//input[@id='u_0_j']";
    private static final String XPATH_LASTNAME = "//input[@id='u_0_l']";
    private static final String XPATH_PLACEHOLDER = "//input[contains(@aria-label, 'Numer telefonu komórkowego lub e-mail')]";
    private static final String XPATH_PLACEHOLDER2 = "//input[contains(@aria-label, 'Wprowadź ponownie adres e-mail')]";

    private static final String XPATH_SELECT = "//span[contains(@class, '5k_4')]//parent::span";
    private static final String XPATH_SELECT_DAY = XPATH_SELECT + "/select[1]";
    private static final String XPATH_SELECT_MONTH = XPATH_SELECT + "/select[2]";
    private static final String XPATH_SELECT_YEAR = XPATH_SELECT + "/select[3]";

    private static final String XPATH_SEX = "//label[contains(text(),'Mężczyzna')]//preceding::input[1]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        assert driver != null;
        driver.get("https://www.facebook.com/");

        WebElement firstName = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstName.sendKeys("Jakub");

        WebElement lastName = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastName.sendKeys("Kowalski");

        WebElement placeHolder = driver.findElement(By.xpath(XPATH_PLACEHOLDER));
        placeHolder.sendKeys("java@developer.com");

        WebElement placeHolderTwo = driver.findElement(By.xpath(XPATH_PLACEHOLDER2));
        placeHolderTwo.sendKeys("java@developer.com");

        WebElement comboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(comboDay);
        selectDay.selectByValue("2");

        WebElement comboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(comboMonth);
        selectMonth.selectByValue("3");

        WebElement comboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(comboYear);
        selectYear.selectByValue("1983");

        WebElement genderWraper = driver.findElement(By.xpath(XPATH_SEX));
        genderWraper.click();
    }
}
