package pages;

import org.openqa.selenium.By;

import elements.Button;
import elements.TextInput;

public class InboxPage {
	
	private Button composeButton = new Button(By.className("T-I"));
	private Button sendButton = new Button(By.xpath(""));
	private TextInput receiverInput = new TextInput(By.xpath(""));
	private TextInput subjectInput = new TextInput(By.className(""));
	private TextInput Input = new TextInput(By.className(""));
	
	
	public InboxPage sendEmail(String address) {
		
		return this;
		
	}


	public Object isEmailPresent(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
