package com.luma.pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.Base.baseClass;

public class IndexPage extends baseClass {

		

		@FindBy(linkText="Sign In")
		WebElement SignButn;
		
		@FindBy(id="search")
		WebElement SearchBox;
	
		@FindBy(xpath="//button[@title=\"Search\"]")
		WebElement SearchButton;
		
		@FindBy(xpath="//img[@src=\"https://magento.softwaretestingboard.com/pub/static/version1695896754/frontend/Magento/luma/en_US/images/logo.svg\"]")
		WebElement Logo;
		
		
		
		public IndexPage() {
			
			PageFactory.initElements(driver, this);
		}
		public LoginPage ClickOnSignButton() {
			SignButn.click();
			return new LoginPage();
		}
		public boolean validateLogo() {
			return	Logo.isDisplayed();
			
		}	
		public String GetTitle(){
			String title=driver.getTitle();
			return title;
		}
			
			public SearchResultPage searchinBox(String Productname) {
				SearchBox.sendKeys(Productname);
				SearchButton.click();
				return new SearchResultPage();
			
			}
			
		
		}
		

