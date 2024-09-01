package com.luma.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.Base.baseClass;

public class PaymentPage extends baseClass{

	@FindBy(xpath="//button[@title=\"Place Order\"]")
	WebElement placeOrder;

public PaymentPage() {
	PageFactory.initElements(driver,this);
	
}
public OrderConfirmationPage placeOrder() {
	placeOrder.click();
	return new OrderConfirmationPage();
	
}

}