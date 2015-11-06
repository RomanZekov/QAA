package main.components;

import org.openqa.selenium.By;
//import static main.utils.TestManager.getDriver;

/**
 * Created by Roman on 03.11.2015.
 */
public class TextInput extends Element {
	
	public TextInput(By by) {
		
		super(by);
	}
	
	public void type (String string) {
		
		composeWebElement().clear();
		composeWebElement().sendKeys(string);
	}

}
