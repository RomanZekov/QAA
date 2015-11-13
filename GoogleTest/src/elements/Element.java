package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static conf.TestManager.getDriver;

public abstract class Element {
	
	protected By by;
	
	public Element (By by) {
		
		this.by = by;
		
	}
	
	protected WebElement composeWebElement() {
		
		return getDriver().findElement(by);
		
	}
	

	public String getText() {
		
		return getDriver().findElement(by).getText();
		
	}
	
}
