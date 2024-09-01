package com.luma.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.Base.baseClass;

public class AccoutCreationPage extends baseClass  {
	
	@FindBy(id="firstname")
	WebElement FirstName;
	
	
	@FindBy(id="lastname")
	WebElement LastName;
	
	@FindBy(id="email_address")
	WebElement Email;
	
	@FindBy(id="password")
	WebElement password1;
	
	
	@FindBy(id="password-confirmation")
	WebElement ConfirmPassword1;
	
	@FindBy(xpath="//button[@class=\"action submit primary\"]")
	WebElement CreateAnAccount;
	
	public AccoutCreationPage() {
		
		PageFactory.initElements(driver,this);
	}
	public HomePage CreatenewAccount(String firstname,String lastname,String email,String pass1,String Conpass1 ) {
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		Email.sendKeys(email);
		password1.sendKeys(pass1);
		ConfirmPassword1.sendKeys(Conpass1);
		CreateAnAccount.click();
		return new HomePage();
		
		
	}
	
	
}
