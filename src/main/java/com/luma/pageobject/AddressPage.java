package com.luma.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.Base.baseClass;

public class AddressPage extends baseClass {
	@FindBy(xpath="//input[@id=\"P7JKPKX\"]")
	WebElement fname;
	
	
	@FindBy(xpath="//input[@id=\"F5YR471\"]")
	WebElement lname;
	
	@FindBy(xpath="//input[@id=\"F5YR471\"]")
	WebElement address;
	
	@FindBy(xpath="//input[@id=\"J9U8SDM\"]")
	WebElement city;
	
	
	@FindBy(xpath="//input[@id=\"JSKKA4A\"]")
	WebElement State;
	
	@FindBy(xpath="//input[@id=\"FN159RW\"]")
	WebElement pincode;
	@FindBy(xpath="//input[@id=\"M6I4579\"]")
	WebElement country;
	
	@FindBy(xpath="//input[@id=\"R8XKFGQ\"]")
	WebElement phonemnumber;

	@FindBy(xpath="//button[@fdprocessedid=\"vi62l\"]")
	WebElement shiping;
	@FindBy(xpath="//button[@class=\"button action continue primary\"]")
	WebElement next ;
	  public AddressPage() {
			PageFactory.initElements(driver,this);
		}
	  public void newAddressDetails(String FName,String LName,String Address,String City,String state,String pincode,String country,String phnumner) {
		  driver.switchTo().frame(fname);
		  fname.sendKeys(FName);
		  fname.sendKeys(LName);
		  fname.sendKeys(Address);
		  fname.sendKeys(City);
		  fname.sendKeys(state);
		  fname.sendKeys(pincode);
		  fname.sendKeys(country);
		  fname.sendKeys(phnumner);
		  driver.switchTo().defaultContent();
		  shiping.click();
		  driver.switchTo().defaultContent();
		
		  
	  }
	  public PaymentPage Next() {
		  next.click();
		  return new PaymentPage();
		  
	  }
}
