package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCustomerPage 
{
	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement newCampaignbtn;
	
	public DisplayingCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setNewCampaignbtn() 
	{
		newCampaignbtn.click();
	}
	
	

}
