package tests;

import conf.TestManager;
//import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;
import pages.InboxPage;
//import pages.MainPage;

import static org.junit.Assert.assertTrue;

/**
 * Created by User on 13.11.2015.
 */
public class Email extends TestManager {
    InboxPage inbox;

//    @Before
//    public void setUp() {
//        driver = new FirefoxDriver();
//        getDriver().get(emailBaseUrl);
//        inbox = new InboxPage();
//    }

    @Test
    public void firstEmail(){
        InboxPage inbox = mainPage.login().getInboxPage();
        inbox.sendEmail("zekov.roman78@gmail.com");
        assertTrue(inbox.isEmailPresent("zekov.roman78@gmail.com"));
    }
    
    @Test
    public void useAppMenu(){
        InboxPage inbox = mainPage.login().getNewInboxPage();
        //inbox.sendEmail("zekov.roman78@gmail.com");
        waitInSeconds(5);
        assertTrue("You are logged in. ", inbox.isInboxOpened());
    }
    
}