package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class WebDriverConfig {

    public final static String CHROME = "CHROME_DRIVER";

    public String get() {
        return Objects.requireNonNull(getClass().getClassLoader()
                                                .getResource("chromedriver"))
                                                .getFile();
    }

    public static WebDriver getDriver(final String driver) {

        WebDriverConfig webDriverConfig = new WebDriverConfig();
        System.setProperty("webdriver.chrome.driver", webDriverConfig.get());

        if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }
    }
}
