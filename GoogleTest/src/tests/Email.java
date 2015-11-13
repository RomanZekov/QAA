package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import conf.TestManager;

import static conf.TestManager.getDriver;

import pages.InboxPage;

public class Email extends TestManager {
	InboxPage inbox;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		getDriver().get(emailBaseUrl);
		inbox = new InboxPage();
		
	}
	
	@Test
	public void firstEmail() {
		inbox.sendEmail("roman.zekov78@gmail.com");
		assertTrue(inbox.isEmailPresent("roman.zekov78@gmail.com"));
		
	}
	
}
