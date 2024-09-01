package com.luma.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.Base.baseClass;

public class ShopingCart extends baseClass {
	@FindBy(linkText="shopping cart")
	WebElement ShoppingCart;
	
	@FindBy(linkText="scope: 'minicart_content'")
	WebElement wishlistcart;
	
	
	@FindBy(xpath="//button[@id=\"top-cart-btn-checkout\"]")
	WebElement proceedToCheckOut;
	
	public ShopingCart() {
		PageFactory.initElements(driver,this);
	}
	public ShippingPage shopingcartt() {
		
		wishlistcart.click();
		proceedToCheckOut.click();
		return new ShippingPage();
	}
}
