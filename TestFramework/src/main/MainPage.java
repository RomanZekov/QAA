package main;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static main.utils.TestManager.getDriver;
import static main.utils.TestManager.waitForPageToLoad;

/**
 * Created by User on 03.11.2015.
 */
public class MainPage {

    public ResultPage search(String searchParameter){
        getDriver().findElement(By.id("lst-ib")).clear();
        getDriver().findElement(By.id("lst-ib")).sendKeys(searchParameter);
        waitForPageToLoad();
        return new ResultPage();
    }


}
