package pages;

import org.openqa.selenium.By;
import elements.Button;
import static conf.TestManager.getDriver; 

public class MainPage {
	
	private Button signInButton = new Button(By.id("gb_70"));
	
	public LoginPage clickLogIn() {
		signInButton.click();
		return new LoginPage();
		
	}
	
	public boolean isPresent() {
		
		return getDriver().getTitle().contains("Google");
		
	}

}
