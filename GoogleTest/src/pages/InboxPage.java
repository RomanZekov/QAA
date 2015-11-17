package pages;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;
//import org.openqa.selenium.UnhandledAlertException;

import static conf.TestManager.getDriver;
import static conf.TestManager.waitInSeconds;


/**
 * Created by User on 13.11.2015.
 */
public class InboxPage {

    private Button composeButton = new Button(By.className("T-I-KE"));
    private Button sendButton = new Button(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']"));
    private Button email = new Button(By.xpath("//span[@email='zekov.roman78@gmail.com']"));
    private Button body = new Button(By.xpath("//span[@class='y2']"));

    private TextInput receiverInput = new TextInput(By.xpath("//textarea[@aria-label='Кому']"));
    private TextInput subjectInput = new TextInput(By.className("aoT"));
    private TextInput bodyInput = new TextInput(By.xpath("//div[@aria-label='Тело письма']"));
    

    public InboxPage sendEmail(String address, String body) {
        composeButton.waitForElement();
        composeButton.click();
        sendButton.waitForElement();
        receiverInput.type(address);
        subjectInput.type("Subject");
        bodyInput.type(body);
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