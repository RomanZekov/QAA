package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextInput;
import org.openqa.selenium.By;

import data.Locators;

import static conf.TestManager.getDriver;
import static conf.TestManager.waitInSeconds;
import static conf.TestManager.getEmailSubject;
import static conf.TestManager.getEmailBody;
import static conf.TestManager.getEmailReceiversInStr;

/**
 * Created by User on 13.11.2015.
 */
public class InboxPage {

	private Button composeButton = new Button(By.className( Locators.COMPOSE_NEW_MAIL.getValue()) );
    private Button sendButton = new Button(By.xpath( Locators.SEND_EMAIL.getValue()) );
    private Button email = new Button( By.xpath( Locators.EMAIL.getValue()) );
    private Button body = new Button(By.xpath( Locators.BODY.getValue() ));
    private Button delEmailButton;

    private TextInput receiverInput = new TextInput(By.xpath( Locators.RECEIVER_INPUT.getValue() ));
    private TextInput subjectInput = new TextInput(By.className( Locators.SUBJECT_INPUT.getValue() ));
    private TextInput bodyInput = new TextInput(By.xpath( Locators.BODY_INPUT.getValue() ));
    private Checkbox checkToDelete;
    
    

    public InboxPage sendEmail(String address) {
        composeButton.waitForElement();
        composeButton.click();
        
        sendButton.waitForElement();
        receiverInput.type( getEmailReceiversInStr() );
        subjectInput.type( getEmailSubject() );
        bodyInput.type( getEmailBody());
        sendButton.click();
        waitInSeconds(5);
        getDriver().navigate().refresh();

        return this;
    }
    
    public InboxPage deleteEmail(String body) {

    	findCheckBoxForEmailAndCheck( getEmailBody() );
    	delEmailButton = getDeleteEmailButton();
    	delEmailButton.click();
    	
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
	
	public void findCheckBoxForEmailAndCheck(String body){
		String locator;
		
		locator = "//span[contains(text(),'" + body + "')]/../../../../..//div[@role='checkbox']";
		checkToDelete = new Checkbox(By.xpath(locator));
		checkToDelete.check();
		
	}
	
	public Button getDeleteEmailButton() {
		
		return new Button(By.xpath( Locators.DELETE_EMAIL_BUTTON.getValue() ));
		
	}
	
	
}