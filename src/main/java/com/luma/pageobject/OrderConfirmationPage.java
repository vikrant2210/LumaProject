package com.luma.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.Base.baseClass;

public class OrderConfirmationPage extends baseClass {

	@FindBy(xpath="//a[@class=\"order-number\"]")
	WebElement OrderIdNumber;
	
	@FindBy(xpath="//a[@class=\"action primary continue\"]")
	WebElement ContinueShoping;
	
	 public OrderConfirmationPage() {
			PageFactory.initElements(driver,this);
		}
	 public void confimorder() {
	boolean abc=	OrderIdNumber.isDisplayed();
		System.out.println(abc);
	 }
	 
	 public void continuesshoping() {
		 ContinueShoping.click();
	 }
	
}
