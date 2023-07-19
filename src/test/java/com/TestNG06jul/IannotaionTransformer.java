package com.TestNG06jul;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
public class IannotaionTransformer implements IAnnotationTransformer {

	int counter = 3;

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if (testMethod.getName().equals("change")) {
			System.out.println("Inside the Transform Method");
			System.out.println("Changing invocation for the following method:");
			annotation.setInvocationCount(counter);
		}
	}
}