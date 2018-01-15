package com.kodilla.testing2.facebook;

        import com.kodilla.testing2.config.WebDriverConfig;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECTDAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECTMOUNTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECTYEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";


    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(" https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_SELECTDAY)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECTDAY));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(24);

        while (!driver.findElement(By.xpath(XPATH_SELECTMOUNTH)).isDisplayed());

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_SELECTMOUNTH));
        Select selectBoard1 = new Select(selectCombo1);
        selectBoard1.selectByIndex(9);

        while (!driver.findElement(By.xpath(XPATH_SELECTYEAR)).isDisplayed());

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECTYEAR));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByIndex(41);
    }
}
