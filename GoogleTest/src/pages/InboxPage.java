package pages;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;

import data.EmailData;
import data.Locators;

import static conf.TestManager.getDriver;
import static conf.TestManager.waitInSeconds;


/**
 * Created by User on 13.11.2015.
 */
public class InboxPage {

	private Button composeButton = new Button(By.className( Locators.COMPOSE_NEW_MAIL.getValue()) );
    private Button sendButton = new Button(By.xpath( Locators.SEND_EMAIL.getValue()) );
    private Button email = new Button( By.xpath( Locators.EMAIL.getValue()) );
    private Button body = new Button(By.xpath( Locators.BODY.getValue() ));

    private TextInput receiverInput = new TextInput(By.xpath( Locators.RECEIVER_INPUT.getValue() ));
    private TextInput subjectInput = new TextInput(By.className( Locators.SUBJECT_INPUT.getValue() ));
    private TextInput bodyInput = new TextInput(By.xpath( Locators.BODY_INPUT.getValue() ));
    

    public InboxPage sendEmail(String address) {
        composeButton.waitForElement();
        composeButton.click();
        sendButton.waitForElement();
        EmailData emailData = new EmailData(address);
        receiverInput.type(emailData.getReceiversInString());
        subjectInput.type(emailData.getSubject());
        bodyInput.type(emailData.getBody());
        sendButton.click();
        waitInSeconds(5);
        getDriver().navigate().refresh();

        return this;
    }

    public boolean isEmailPresent(String s) {
        email.waitForElement();
        return email.isPresent();
    }
    
    public boolean isBodyPresent(String s) {
        body.waitForElement();
        return body.isPresent();
    }
    
	public boolean isInboxOpened() {
		
		return getDriver().getTitle().contains("Входящие");
		
	}
	
	
}