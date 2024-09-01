package com.luma.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.Base.baseClass;

public class LoginPage extends baseClass {

	@FindBy(id="email")
	WebElement EmailId;
	
	@FindBy(id="pass")
	WebElement Password;
	
	@FindBy(id="send2")
	WebElement LoginButton;
	
	@FindBy(xpath="//a[@class=\"action create primary\"]")
	WebElement CreateAccount;


public LoginPage() {
	
	PageFactory.initElements(driver,this);
}
  public HomePage Login(String Emalid,String Pass) {
	  EmailId.sendKeys(Emalid);
	  Password.sendKeys(Pass);
	  LoginButton.click();
	  return new HomePage();
	  
  }
  public AccoutCreationPage CreateNewAccount() {
	  CreateAccount.click();
	  return new AccoutCreationPage();
	  
  }
}
	