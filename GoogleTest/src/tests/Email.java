package tests;

import conf.TestManager;
import org.junit.Test;
import pages.InboxPage;

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
        inbox.sendEmail( getEmail() );
        assertTrue(inbox.isBodyPresent( getEmailBody() ));
    }
  
    
    @Test
    public void useAppMenu(){
        InboxPage inbox = mainPage.login().getNewInboxPage();
        //inbox.sendEmail("zekov.roman78@gmail.com");
        waitInSeconds(5);
        assertTrue("You are logged in. ", inbox.isInboxOpened());
    }
    
}