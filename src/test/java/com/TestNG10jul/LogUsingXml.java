package com.TestNG10jul;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class LogUsingXml {
	static Logger log = Logger.getLogger("LogUsingXml.class");

	@Test
	void method1() {
//		PropertyConfigurator.configure("log.properties");
		DOMConfigurator.configure("log1.xml");
		log.error("error says");
		log.fatal("fatal msg");
		log.debug("debug msg");
	}
}
