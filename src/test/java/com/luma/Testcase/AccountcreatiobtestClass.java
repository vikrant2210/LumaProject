package com.luma.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.Base.baseClass;
import com.luma.pageobject.AccoutCreationPage;
import com.luma.pageobject.HomePage;
import com.luma.pageobject.IndexPage;
import com.luma.pageobject.LoginPage;

public class AccountcreatiobtestClass extends baseClass{
	
		IndexPage indexpage;
		LoginPage loginpage;
		HomePage homepage;
		AccoutCreationPage	accountcreationpage;
		@BeforeMethod
 public void setup () throws IOException {
		LaunchApp();
 }

@AfterMethod
public void Teardown () {
	driver.quit();
}
		
		@Test
		public void CreatingAccount()
{
		
			indexpage =new IndexPage();
			
			loginpage =	indexpage.ClickOnSignButton();
		
			loginpage=new LoginPage ();
			accountcreationpage=loginpage.CreateNewAccount();
				accountcreationpage=new AccoutCreationPage();
			homepage=accountcreationpage.CreatenewAccount("sawd"," ndrsr",
					"satf@gmail.com", "san3ttfdwD221", "san3ttfdwD221" );
		
	
			
			}
}

