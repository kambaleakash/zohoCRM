package com.actitime.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TaskListPage 
{
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewbtn;
	
	@FindBy(xpath = "//div[text()='+ New Tasks']")
	private WebElement newTaskbtn;
	
	@FindBy(xpath = "//input[@placeholder='Enter task name']")
	private WebElement taskNametxtbx;
	
	@FindBy (xpath = "//div[text()='Create Tasks']")
	private WebElement createTaskbtn;
	
	@FindBy(xpath = "//div[@class='title' and @title]")
	private List<WebElement> actualTask;
	
	@FindBy(xpath = "(//div[text()='All Customers'])")
	private WebElement allCustomers;
	
	@FindBy(xpath = "//span[@class='taskNameHeader']")
	private WebElement taskArrow;
	
	@FindBy(xpath = "(//div[text()='Flight operations'])[1]")
	private WebElement flightOps;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTaskArrow() 
	{
		return taskArrow;
	}

	public void setTaskArrow(WebElement taskArrow) 
	{
		taskArrow.click();
	}

	public WebElement getFlightOps() {
		
		return flightOps;
	}

	public void setFlightOps(WebElement flightOps) 
	{
		flightOps.click();
	}

	public WebElement getAllCustomers() 
	{
		return allCustomers;
	}


	public void setAllCustomers(WebElement allCustomers)
	{
		allCustomers.click();
	}


	public List<WebElement> getActualTask() 
	{
		return actualTask;
	}

	
	public WebElement getaddNewbtn() 
	{
		return addNewbtn;
	}
	
	public WebElement getNewTaskbtn()
	{
		return newTaskbtn;
	}
	
	
	public WebElement getTaskNametxtbx() 
	{
		return taskNametxtbx;
	}
	
	public WebElement getCreateTaskbtn() 
	{
		return createTaskbtn;
	}


	public void setAddNewbtn() 
	{
		addNewbtn.click();
	}


	public void setNewTaskbtn(WebElement newTaskbtn) 
	{
		
		newTaskbtn.click();
	}


	public void setTaskNametxtbx(WebElement taskNametxtbx, String taskName) 
	{
		taskNametxtbx.sendKeys(taskName);
	}


	public void setCreateTaskbtn(WebElement addTaskbtn) 
	{
		createTaskbtn.click();
	}

	
	
	

}
