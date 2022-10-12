package com.actitime.testscript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage;

public class DemoLogin 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void login() throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		FileLib f=new FileLib();
		driver.get(f.getPropertyData("url"));
		LoginPage l=new LoginPage(driver);
		l.setLogin(f.getPropertyData("un"),f.getPropertyData("pwd"));
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		Thread.sleep(4000);
		e.setTasktab(e.getTasktab());
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		TaskListPage t=new TaskListPage(driver);
		t.setAddNewbtn();
		t.setNewTaskbtn(t.getNewTaskbtn());
		Thread.sleep(4000);
		String taskName = "Reading"+Math.random();
		t.setTaskNametxtbx(t.getTaskNametxtbx(),taskName );
		Thread.sleep(4000);
		t.setCreateTaskbtn(t.getCreateTaskbtn());
		Thread.sleep(4000);
	//	t.setAllCustomers(t.getAllCustomers());
		t.setFlightOps(t.getFlightOps());
		Thread.sleep(4000);
		driver.navigate().refresh();
//		t.setTaskArrow(t.getTaskArrow());
		
		 List<WebElement> allTasks = t.getActualTask();
		 SoftAssert s = new SoftAssert();
		 for(int i=0; i<allTasks.size(); i++)
		 {
			// Assert.assertEquals(w.getText(), taskName);
			 
			 s.assertEquals(allTasks.get(i).getText(), taskName);
			 
		 }
		 s.assertAll();
		
		
//		if(t.getActualTask().getText().equals(taskName))
//			Reporter.log("Pass",true);
//		else
//			Reporter.log("Fail",true);
//		Reporter.log(taskName,true);
		
		
	//	e.setLgtbtn(e.getLgtbtn());
	}

}
