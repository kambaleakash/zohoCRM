package com.zohocrm.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.zohocrm.pom.HomePage;
import com.zohocrm.pom.SignInPage;

public class BaseClass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	FileLib f=new FileLib();
	
	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.get(f.getPropertyData("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void signIn() throws IOException
	{
		
		SignInPage s=new SignInPage(driver);
		s.getUntbx().sendKeys(f.getPropertyData("un"));
		s.getPwdtbx().sendKeys(f.getPropertyData("pwd"));
		s.getSginbtn().click();
	}
	
	@AfterMethod(enabled = false)
	public void logOut()
	{
		HomePage h=new HomePage(driver);
		h.getLgtlnk().click();
	}
	
	@AfterTest(enabled = false)
	public void closeBrowser()
	{
		driver.close();
	}

}
