package conf;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.MainPage;



public class TestManager {
	protected static WebDriver driver;
	private String baseUrl = "https://www.google.com.ua/";
	protected MainPage mainPage;
	
	@Before
	public void setUp() {
		
		driver = new FirefoxDriver();
		getDriver().get(baseUrl);
		mainPage = new MainPage();
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
		
	}
	
	public static WebDriver getDriver () {
		
		return driver;
		
	}
	
	public static void waitInSeconds(int seconds) {
		
		try {
			
			Thread.sleep(seconds*1000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
	
	}

}
