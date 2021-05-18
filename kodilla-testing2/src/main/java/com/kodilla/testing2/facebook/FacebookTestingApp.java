package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {
    public static final String XPATH_ACCEPT_COOKIES = "//button[contains(@title, \"Akceptuj wszystkie\")]";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//form/div/a[contains(@href, \"#\")]";
    public static final String XPATH_YEAR = "//select[contains(@name, \"birthday_year\")]";
    public static final String XPATH_MONTH = "//select[contains(@name, \"birthday_month\")]";
    public static final String XPATH_DAY = "//select[contains(@name, \"birthday_day\")]";
    public static final String ID_WAIT_FOR = "reg_form_box";

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.facebook.com");

        WebElement acceptButton = webDriver.findElement(By.xpath(XPATH_ACCEPT_COOKIES));
        acceptButton.click();

        WebElement createAccountButton = webDriver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT));
        createAccountButton.click();

        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(ID_WAIT_FOR)));

        WebElement dayCombo = webDriver.findElement(By.xpath(XPATH_DAY));
        Select daySelect = new Select(dayCombo);
        daySelect.selectByIndex(26);

        WebElement monthCombo = webDriver.findElement(By.xpath(XPATH_MONTH));
        Select monthSelect = new Select(monthCombo);
        monthSelect.selectByIndex(07);

        WebElement yearCombo = webDriver.findElement(By.xpath(XPATH_YEAR));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByVisibleText("1999");

    }
}
