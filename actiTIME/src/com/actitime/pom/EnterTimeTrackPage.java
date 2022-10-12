package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage 
{
	@FindBy(id="logoutLink")
	private WebElement lgtbtn;
	
	@FindBy(xpath = "//div[text()='Tasks']")
	private WebElement tasktab;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setLgtbtn(WebElement lgtbtn) 
	{
		lgtbtn.click();
	}

	public void setTasktab(WebElement tasktab) 
	{
		tasktab.click();
	}

	public WebElement getLgtbtn() 
	{
		return lgtbtn;
	}

	public WebElement getTasktab() 
	{
		return tasktab;
	}
	
	

}
