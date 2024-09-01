package com.luma.pageobject; 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.Base.baseClass;

public class HomePage extends baseClass {
	
	@FindBy(id="search")
	WebElement SearchBox;
	
	
	@FindBy(xpath="//button[@title=\"Search\"]")
	WebElement SearchButton;
	
	@FindBy(id="//a[@class=\"action showcart active\"]")
	WebElement WishCart;
	
	

    public HomePage() {
	PageFactory.initElements(driver,this);
}
    public ShopingCart ShopingCarT() {
    	WishCart.click();
    	return new ShopingCart();
    }
    public SearchResultPage searchinBox(String Productname) {
	SearchBox.sendKeys(Productname);
	SearchButton.click();
	return new SearchResultPage();
}
    
}