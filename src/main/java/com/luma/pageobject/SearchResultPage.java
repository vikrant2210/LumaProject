package com.luma.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.luma.Base.baseClass;

public class SearchResultPage extends baseClass{
	
	
	@FindBy(xpath="//img[@alt=\"Balboa Persistence Tee\"]")
	WebElement SearchProduct;

	
public SearchResultPage() {
	PageFactory.initElements(driver,this);
	
}
public void isproductavaliable() {
	boolean ProdcutDisplaied = SearchProduct.isDisplayed();
	System.out.println(ProdcutDisplaied);
	Assert.assertTrue(ProdcutDisplaied);
}
	public AddToCardPage clickOnProduct() {
		SearchProduct.click();
		return new AddToCardPage();
	}

}