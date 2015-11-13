package pages;

//import static conf.TestManager.getDriver;

import org.openqa.selenium.By;

import elements.Button;
import elements.Checkbox;
import elements.TextInput;

public class PasswordPage {
	
	private TextInput passwordInput = new TextInput(By.id("Passwd"));
	private Button signInButton = new Button(By.id("signIn"));
	private Checkbox rememberMeCheckbox = new Checkbox(By.id("PersistentCookie"));
	
	
	public PasswordPage enterPassword (String password) {
		
		try {
		
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		
		}
		
		passwordInput.type(password);
		return this;
	
	}

	public PasswordPage checkRememberMe() {
	
		rememberMeCheckbox.check();
		return this;
	
	}

	public MainPage clickSignIn() {
	
		signInButton.click();
		return new MainPage();
	
	}

}
