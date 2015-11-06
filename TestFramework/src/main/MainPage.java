package main;

import org.openqa.selenium.By;

import main.components.TextInput;
import main.locators.Locators;

import static main.utils.TestManager.waitForPageToLoad;

/**
 * Created by Roman on 03.11.2015.
 */
public class MainPage {
	
	private By searchFieldInput = By.id(Locators.SEARCH_FIELD.getValue());

    public ResultPage search(String searchParameter){
        TextInput searchField = new TextInput(searchFieldInput);
    	searchField.type(searchParameter);
        waitForPageToLoad();
        return new ResultPage();
    }


}
