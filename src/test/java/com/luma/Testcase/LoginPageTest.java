package com.luma.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.Base.baseClass;
import com.luma.pageobject.HomePage;
import com.luma.pageobject.IndexPage;
import com.luma.pageobject.LoginPage;

public class LoginPageTest extends baseClass {
IndexPage indexpage;
LoginPage loginpage;
HomePage homepage;
	@BeforeMethod(groups="Sanity")
	public void setup () throws IOException {
		LaunchApp();
	}
	@AfterMethod(groups="Sanity")
	public void Teardown () {
		driver.quit();
	}
	@Test(groups="Sanity")
	
	public void LoginTest() {
		String ml= "viki@gmail.com";
		String ps ="Viki@123";
		indexpage =new IndexPage();
	loginpage =	indexpage.ClickOnSignButton();
	 loginpage=new LoginPage ();
	homepage=loginpage.Login(ml,ps);
	
	}
	
}
