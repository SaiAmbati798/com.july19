package com.TestNG06jul;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listenersprac implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		System.out.println("On Test Start "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("On Test Success "+result.getName());		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("On Test Failure "+result.getName());		
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("On Test Skipped "+result.getName());		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("On Test Failed But Success Percentage "+result.getName());		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("On Test Failed with Timeout "+result.getName());				
	}

	public void onStart(ITestContext context) {
		
	System.out.println("On Start");	
	}

	public void onFinish(ITestContext context) {
		
	System.out.println("On Finish");	
	}
  
}
