package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public final static String FIREFOX = "FIREFOX_DRIVER";
    public final static String CHROME = "CHROME_DRIVER";
<<<<<<< HEAD
    public static WebDriver getDriver(final String driver){
        System.setProperty("webdriver.gecko.driver","c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","c:\\Selenium-drivers\\Chrome\\chromedriver.exe");

        if (driver.equals(FIREFOX)){
            return new FirefoxDriver();
        } else if (driver.equals(CHROME)){
            return new ChromeDriver();
        }else {
            return null;
        }
    }

}
=======

    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");

        if (driver.equals(FIREFOX)) {
            return new FirefoxDriver();
        }else if (driver.equals(CHROME)) {
          return new ChromeDriver();
            }else {
                return null;
                }
        }
    }

>>>>>>> 55686fe32a2c0e0083102ca5cf592c5cfba8c31e
