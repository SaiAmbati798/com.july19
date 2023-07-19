package com.TestNG06jul;


import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class Demo4 implements IInvokedMethodListener{

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		
		System.out.println("Before invokation "+method.getTestMethod().getMethodName());
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		
		System.out.println("After invokation "+method.getTestMethod().getMethodName());
		
	}
//
//	public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
//		
//		
//	}
//
//	public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
//		
//		
//	}

}
