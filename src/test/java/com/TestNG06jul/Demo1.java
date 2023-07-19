package com.TestNG06jul;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Demo1 implements ISuiteListener {

	public void onStart(ISuite suite) {
		
		System.out.println("On Start "+suite.getName() );
	}

	public void onFinish(ISuite suite) {
		
		System.out.println("On Finish "+suite.getName() );
	}
		
	
}
