package com.luma.Testcase;



import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.Base.baseClass;
import com.luma.pageobject.AddToCardPage;
import com.luma.pageobject.HomePage;

import com.luma.pageobject.SearchResultPage;
import com.luma.pageobject.ShopingCart;

public class addtocartpageTest extends baseClass{
	
	
		SearchResultPage searchresultpage;
		HomePage homepage;
		AddToCardPage addtocardpage;
		ShopingCart shopingcart;
		
		
		@BeforeMethod
		public void setup () throws IOException  {
			
			LaunchApp();
		}
		@AfterMethod
		public void Teardown () {
			driver.quit();
		}
		
    @Test
    public void productInfo() throws InterruptedException  {
    	
    	
    	homepage= new HomePage ();
		 
		searchresultpage=homepage.searchinBox("T-shirt");
		 searchresultpage =new SearchResultPage ();
		addtocardpage=	searchresultpage.clickOnProduct();  
		shopingcart =  new ShopingCart();
		shopingcart=addtocardpage.ProdctDetail("3");
		
	   driver.navigate().back();
		
		
		
    	 
		
		
		
		
		
    }
    
    
    
}
