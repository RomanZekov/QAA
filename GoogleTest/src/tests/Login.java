package tests;

import conf.TestManager;

import static org.junit.Assert.*;

import org.junit.*;


public class Login  extends TestManager{


  @Test
  public void Login() {

	  mainPage.clickLogIn().
	  		   enterLogin("zekov.roman78").
	  		   pressNext().
	  		   enterPassword("Nthvbyfnjh").
	  		   checkRememberMe().
	  		   clickSignIn();
	  assertTrue("Incorrect page is displayed.", mainPage.isPresent());
  }

}
