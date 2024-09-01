package com.luma.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.Base.baseClass;
import com.luma.pageobject.AddToCardPage;
import com.luma.pageobject.AddressPage;
import com.luma.pageobject.HomePage;
import com.luma.pageobject.IndexPage;
import com.luma.pageobject.SearchResultPage;

public class SearchResultPageTest extends baseClass {
	SearchResultPage searchresultpage;
	HomePage homepage;
	AddToCardPage addtocardpage;
	
	@BeforeMethod
	public void setup () throws IOException {
		LaunchApp();
	}
	@AfterMethod
	public void Teardown () {
		driver.quit();
	}
	@Test
	public void ClickOnproduct() {
		
		homepage= new HomePage ();
		 
		searchresultpage=homepage.searchinBox("T-shirt");
		addtocardpage=	searchresultpage.clickOnProduct();      
		
		
	}
	
	
	
}
