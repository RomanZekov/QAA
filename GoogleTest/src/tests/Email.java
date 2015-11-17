package tests;

import conf.TestManager;
import org.junit.Test;
import pages.InboxPage;
import java.util.Random;

import static org.junit.Assert.assertTrue;


/**
 * Created by User on 13.11.2015.
 */
public class Email extends TestManager {
    InboxPage inbox;
    private StringBuilder initialBody = new StringBuilder("Body ");
    private int randomIntToBody = new Random().nextInt(50);
    private String randomBody = new String(initialBody.append(randomIntToBody));

//    @Before
//    public void setUp() {
//        driver = new FirefoxDriver();
//        getDriver().get(emailBaseUrl);
//        inbox = new InboxPage();
//    }

    @Test
    public void firstEmail(){
        InboxPage inbox = mainPage.login().getInboxPage();
        inbox.sendEmail("zekov.roman78@gmail.com", randomBody);
        assertTrue(inbox.isBodyPresent(randomBody));
        //assertTrue(inbox.isEmailPresent("zekov.roman78@gmail.com"));
    }
  
    
    @Test
    public void useAppMenu(){
        InboxPage inbox = mainPage.login().getNewInboxPage();
        //inbox.sendEmail("zekov.roman78@gmail.com");
        waitInSeconds(5);
        assertTrue("You are logged in. ", inbox.isInboxOpened());
    }
    
}