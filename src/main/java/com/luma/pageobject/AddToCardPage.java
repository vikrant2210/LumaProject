package com.luma.pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.Base.baseClass;

public class AddToCardPage extends baseClass {

	@FindBy(id="option-label-size-143-item-168")
	WebElement Size;
	
	
	@FindBy(id="option-label-color-93-item-56")
	WebElement Colour;
	 
	@FindBy(id="qty")
	WebElement Quantity;
	
	@FindBy(id="product-addtocart-button")
	WebElement AddToCar;
	
	@FindBy(linkText="shopping cart")
	WebElement ShoppingCart;
	
	public AddToCardPage() {
		PageFactory.initElements(driver,this);
	}
	public ShopingCart ProdctDetail(String Qnty) 
	{
		Size.click();
		Colour.click();
		Quantity.clear();
		Quantity.sendKeys(Qnty);
		AddToCar.click();
	
		
		return new ShopingCart();
		
	
	}

}

