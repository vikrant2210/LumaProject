package com.luma.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.Base.baseClass;
import com.luma.pageobject.HomePage;
import com.luma.pageobject.IndexPage;
import com.luma.pageobject.LoginPage;
import com.luma.pageobject.SearchResultPage;
import com.luma.pageobject.ShopingCart;

public class HomePageTest extends baseClass {
	
	LoginPage loginpage;
	HomePage homepage;
	SearchResultPage serchingResultPage;
	@BeforeMethod(groups="Sanity")
	public void setup () throws IOException {
		LaunchApp();
}
	@AfterMethod(groups="Sanity")
	public void Teardown () {
		
		driver.quit();
	}
	
	@Test(groups="Sanity")
	
	public void searchingProduuct() {		
		
	
		 homepage= new HomePage ();
		 
		serchingResultPage=homepage.searchinBox("T-shirt");
			
	}
}
