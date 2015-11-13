package pages;

import org.openqa.selenium.By;
import elements.Button;
//import elements.Link;
import elements.TextLabel;

import static conf.TestManager.getDriver; 

public class MainPage {
	
	private Button signInButton = new Button(By.id("gb_70"));
	//private Link link = new Link(By.cssSelector(".gb_P.gb_R"));
	private TextLabel nameLabel = new TextLabel(By.cssSelector(".gb_P.gb_R"));
	
	public LoginPage clickLogIn() {
		
		signInButton.click();
		return new LoginPage();
		
	}
	
	public boolean isPresent() {
		
		return getDriver().getTitle().contains("Google");
		
	}
	
	public boolean isLoggedIn() {
		
		return nameLabel.getText().contains("Roman");
		
	}

}
