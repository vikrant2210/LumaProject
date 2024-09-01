package com.luma.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeTest;

public class baseClass {
	public static WebDriver driver;

	@BeforeTest
	public void LaunchApp() throws IOException {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// Instantiate a ChromeDriver class.
		driver = new ChromeDriver(options);
		File file = new File("configuration//config.properties");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(file);

		prop.load(fis);

		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

	}

}
