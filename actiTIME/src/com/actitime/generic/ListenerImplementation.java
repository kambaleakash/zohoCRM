package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends BaseClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{

		ITestListener.super.onTestStart(result);
	}


	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
	}

	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String name = result.getName();
		TakesScreenshot t=(TakesScreenshot)driver;

		File src = t.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/"+name+".png");
		try 
		{
			FileUtils.copyFile(src, dst);
		}
		
		catch (IOException e) 
		{

			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{

		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{

		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{

		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) 
	{

		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) 
	{

		ITestListener.super.onFinish(context);
	}


}
