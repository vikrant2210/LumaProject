package com.luma.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.Base.baseClass;

public class ShippingPage extends baseClass{

	@FindBy(xpath="//button[@class=\"action action-show-popup\"]")
	WebElement Address;
	
	
	@FindBy(xpath="//button[@class=\"button action continue primary\"]")
	WebElement next ;
	
	  public ShippingPage() {
			PageFactory.initElements(driver,this);
		}
	  public AddressPage newaddress() {
		  Address.click();
		  return new AddressPage();
		  
	  }
	  public PaymentPage Next() {
		  next.click();
		  return new PaymentPage();
		  
	  }
	  
}
