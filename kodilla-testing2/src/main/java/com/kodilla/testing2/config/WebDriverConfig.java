package com.kodilla.testing2.config;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverConfig {
    public final static String FIREFOX = "FIREFOX_DRIVER";
    public final static String CHROME = "CHROME_DRIVER";



    public static WebDriver getDriver(final String driver) {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);


        System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");

        if (driver.equals(FIREFOX)) {
            return new FirefoxDriver(dc);
        }else if (driver.equals(CHROME)) {
          return new ChromeDriver(dc);
            }else {
                return null;
                }
        }
    }


