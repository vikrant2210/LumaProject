

package com.luma.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.Base.baseClass;
import com.luma.pageobject.IndexPage;

import junit.framework.Assert;

public class IndexPageTest extends baseClass{
	IndexPage indexpage;
	
	@BeforeMethod(groups="Sanity")
	public void setup () throws IOException {
		LaunchApp();
	}
	@AfterMethod(groups="Sanity")
	public void Teardown () {
		driver.quit();
	}
	@Test
	public void verifyLogo() {
		
		 indexpage =new IndexPage();
	boolean result = indexpage.validateLogo();
	    Assert.assertTrue(result);
	    driver.quit();
	}
	@Test(groups="Sanity")
	public void myLumaTitle() {
		indexpage =new IndexPage();
	String expResult = indexpage.GetTitle();
	System.out.println(expResult);
//	 String ActualResult = "Privacy Policy";
//		Assert.assertEquals(expResult, ActualResult);
//		driver.quit();
	}

}
