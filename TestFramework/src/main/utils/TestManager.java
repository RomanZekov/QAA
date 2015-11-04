package main.utils;

import main.MainPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 03.11.2015.
 */
public class TestManager {
    private static WebDriver driver;
    public String baseUrl = "https://www.google.com.ua/";
    protected MainPage main;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        main = new MainPage();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void waitForPageToLoad() {
        getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
}
