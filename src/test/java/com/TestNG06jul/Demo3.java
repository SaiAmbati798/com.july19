package com.TestNG06jul;

import org.testng.IExecutionListener;

public class Demo3 implements IExecutionListener{

	public void onExecutionStart() {
		// TODO Auto-generated method stub
		System.out.println("On Execution Start ");
	}

	public void onExecutionFinish() {
		
		System.out.println("On Execution finish ");
	}

}
