package com.ibm.jenkins.com.ibm.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class launchTest {
	WebDriver driver;
	@Test
	
	public void demoTest() {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium setup files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://retail.hommelle.com/admin ");
		String actual = driver.getTitle();
		System.out.println(actual);
		String expected="Retail";
		Assert.assertEquals(expected, actual);
		
	}

}
