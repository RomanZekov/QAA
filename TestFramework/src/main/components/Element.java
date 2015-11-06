package main.components;

import static main.utils.TestManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Roman on 03.11.2015.
 */
public class Element {
	
	protected By by;
	
	protected Element(By by) {
		
		this.by = by;
	}
	
	protected WebElement composeWebElement() {
		
		return getDriver().findElement(by);
		
	}

}
