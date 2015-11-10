package pages;

import org.openqa.selenium.By;

import elements.Button;

import static conf.TestManager.getDriver;

public class LoginPage {
	
	private Button nextButton = new Button(By.id("next"));
	
	public LoginPage enterLogin (String login) {
		
		getDriver().findElement(By.id("Email")).clear();
		getDriver().findElement(By.id("Email")).sendKeys(login);
		return this;
	}
	
	public PasswordPage pressNext () {
		
		getDriver().findElement(By.id("next")).click();
		return new PasswordPage();
		
	}

}
