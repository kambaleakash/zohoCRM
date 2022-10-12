package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement lgtlnk;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignsTab;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLgtlnk() 
	{
		return lgtlnk;
	}

	public void setLgtlnk(WebElement lgtlnk) {
		this.lgtlnk = lgtlnk;
	}
	
	public WebElement getCampaignsTab() 
	{
		return campaignsTab;
	}

	public void setCampaignsTab(WebElement campaignsTab) 
	{
		campaignsTab.click();
	}

	
	
	

}
