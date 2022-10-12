package com.zohocrm.testscript;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.zohocrm.generic.BaseClass;
import com.zohocrm.generic.FileLib;
import com.zohocrm.pom.CreateCampaignPage;
import com.zohocrm.pom.DisplayingCustomerPage;
import com.zohocrm.pom.HomePage;
import com.zohocrm.pom.StartDatePage;

public class Demo extends BaseClass
{
	@Test
	public void demo() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Hello",true);
		HomePage h=new HomePage(driver);
		h.setCampaignsTab(h.getCampaignsTab());
		DisplayingCustomerPage d=new DisplayingCustomerPage(driver);
		d.setNewCampaignbtn();

		CreateCampaignPage c=new CreateCampaignPage(driver);
		c.getCampNametbx().sendKeys("Akash");
		c.getStartDateClndr().click();

//		Set<String> awh = driver.getWindowHandles();
//		for(String st: awh)
//		{
//			driver.switchTo().window(st);
//
//
//			if(driver.getTitle().equals("Start Date"))
//			{
//				StartDatePage s=new StartDatePage(driver);
//				String calTitle = s.getCalTitle().getText();
//
//				String[] calTitleSplit = calTitle.split(" ");
//				List l=new ArrayList<>();
//				l.add(calTitleSplit);
//				String smonth = (String) l.get(0);
//				String syear = (String) l.get(1);
//
//				int month=Integer.parseInt(smonth);
//				int year=Integer.parseInt(syear);
//
//				if(s.getCalTitle().getText().contains(syear))
//				{
//
//					if(s.getCalTitle().getText().contains(smonth))
//					{
//						s.getFifteen().click();
//					}
//
//					else
//					{
//						FileLib f=new FileLib();
//						StartDatePage s1=new StartDatePage(driver);
//						for(int i=1; i<=11; i++ )
//						{
//							String temp = f.getExcelData("calendar", i, 1);
//							if(temp.contains(st))
//							s1.getNextMonthLookUp().click();
//						}
//					}
//
//				}
//				else if(year<2020)
//				{
//					StartDatePage s1=new StartDatePage(driver);
//					s1.getPrevYearLookUp().click();
//				}
//
//				else if(year>2020)
//				{
//					StartDatePage s1=new StartDatePage(driver);
//					s1.getNextYearLookUp().click();
//				}
//			}
//
//			else
//			{
//				StartDatePage s=new StartDatePage(driver);
//				String calTitle = s.getCalTitle().getText();
//
//
//				String[] calTitleSplit = calTitle.split(" ");
//				List l=new ArrayList<>();
//				l.add(calTitleSplit);
//				Object month = l.get(0);
//				Object year = l.get(1);
//
//				System.out.println(month);
//
//
//			}













		}

	}
