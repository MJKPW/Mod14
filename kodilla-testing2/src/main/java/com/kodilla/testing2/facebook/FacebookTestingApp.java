package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String XPATH_SIGN_IN = "//div[contains(@class, \"_6ltg\")]/a[1]";
    public static final String XPATH_NAME = "//*/input[@name=\"firstname\"]";
    public static final String XPATH_LASTNAME = "//input[@name=\"lastname\"]";
    public static final String XPATH_EMAIL = "//input[@name=\"reg_email__\"]";
    public static final String XPATH_PASSWORD = "//input[@name=\"reg_passwd__\"]";
    public static final String XPATH_DAY = "//select[@id=\"day\"]";
    public static final String XPATH_MONTH = "//select[@id=\"month\"]";
    public static final String XPATH_YEAR = "//select[@id=\"year\"]";
    public static final String XPATH_MAN = "//div[contains(@class, \"mtm _5wa2 _5dbb\")]/span/span[2]/input";
    public static final String XPATH_END = "//div[contains(@class, \"_1lch\")]/button";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://pl-pl.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed());

        WebElement acceptCookiesButton = driver.findElement(By.xpath(XPATH_COOKIES));
        acceptCookiesButton.click();

        while (!driver.findElement(By.xpath(XPATH_SIGN_IN)).isDisplayed());

        WebElement signUpButton = driver.findElement(By.xpath(XPATH_SIGN_IN));
        signUpButton.click();

        while (!driver.findElement(By.xpath(XPATH_NAME)).isDisplayed());
        WebElement name = driver.findElement(By.xpath(XPATH_NAME));
        name.sendKeys("Jan");

        WebElement lastname = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastname.sendKeys("Kowalski");

        WebElement email = driver.findElement(By.xpath(XPATH_EMAIL));
        email.sendKeys("r_Test12@wp.pl");

        WebElement password = driver.findElement(By.xpath(XPATH_PASSWORD));
        password.sendKeys("12Random_Password");

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(14);

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(6);

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByIndex(40);

        WebElement man = driver.findElement(By.xpath(XPATH_MAN));
        man.click();

        WebElement button = driver.findElement(By.xpath(XPATH_END));
        button.click();

    }
}
