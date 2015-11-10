package pages;

import org.openqa.selenium.By;

import elements.Button;
import elements.TextInput;

import static conf.TestManager.getDriver;

public class LoginPage {
	
	private Button nextButton = new Button(By.id("next"));
	private TextInput loginInput = new TextInput(By.id("Email"));
	
	public LoginPage enterLogin (String login) {
		
		loginInput.type(login);
		return this;
	}
	
	public PasswordPage pressNext () {
		
		nextButton.click();
		return new PasswordPage();
		
	}

}
