package pages;

import elements.Button;
import elements.Link;
import org.openqa.selenium.By;
import elements.TextLabel;

import static conf.TestManager.getDriver;
//import static conf.TestManager.waitInSeconds; 

public class MainPage {
	
	private Button signInButton = new Button(By.id("gb_70"));
	private Button mailButton = new Button(By.xpath(".//*[@id='gb23']/span[1]"));
	private TextLabel nameLabel = new TextLabel(By.cssSelector(".gb_P.gb_R"));
	private Link googleApps = new Link(By.xpath(".//*[@id='gbwa']/div[1]/a"));
	
	
    public LoginPage clickLogIn(){
        signInButton.click();
        return new LoginPage();
    }

    public MainPage login(){
        clickLogIn().
                enterLogin("zekov.roman78").
                pressNext().
                enterPassword("Nthvbyfnjh").
                checkRememberMe().
                clickSignIn();
        return this;
    }
    
    //Created by Sergey M.
    public InboxPage getInboxPage(){
        getDriver().get("https://mail.google.com/");
        return new InboxPage();
    }
    
    //Created by Roman Z.
    public InboxPage getNewInboxPage(){
        
    	if ( googleApps.isPresent() ) {	googleApps.click(); } 
    	
    	else { googleApps.waitForElement(); }
    	
    	if ( mailButton.isPresent() ) {	mailButton.click(); }
    	
    	else { mailButton.waitForElement(); } 

        return new InboxPage();
    }    
	
	public boolean isPresent() {
		
		return getDriver().getTitle().contains("Google");
		
	}
	
	public boolean isLoggedIn() {
		
		return nameLabel.getText().contains("Roman");
		
	}

}
