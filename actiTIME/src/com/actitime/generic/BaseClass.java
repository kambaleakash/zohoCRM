package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	static WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException
	
	
	{
		FileLib f=new FileLib();
		String un = f.getPropertyData("Un");
		String pwd = f.getPropertyData("Pwd");
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
	
	@AfterMethod
	public void logout()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("logoutLink")).click();
	//	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	

}
