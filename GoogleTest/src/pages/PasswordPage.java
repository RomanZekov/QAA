package pages;

import static conf.TestManager.getDriver;

import org.openqa.selenium.By;

public class PasswordPage {
	
	public PasswordPage enterPassword (String password) {
		
		try {
		
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		
		}
	
		getDriver().findElement(By.id("password")).clear();
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this;
	
	}

	public PasswordPage checkRememberMe() {
	
		getDriver().findElement(By.id("PersistentCoockie")).click();
		return this;
	
	}

	public MainPage clickSignIn() {
	
		getDriver().findElement(By.id("signIn")).click();
		return new MainPage();
	
	}

}
