package com.TestNG06jul;

import java.util.*;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Demo5 implements IMethodInterceptor{

	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		
		List<IMethodInstance> list1 = new ArrayList<IMethodInstance>();
		
		for(IMethodInstance method2 : methods) {
			Test tmethods = method2.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
			
			if(tmethods.priority()==1){
				list1.add(method2);
			}
		}
		
		return list1;
	}

}
