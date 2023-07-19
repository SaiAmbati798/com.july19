package com.TestNG10jul;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class logBasicProp {
	static Logger log = Logger.getLogger("logBasicProp.class");
  @Test
  void Logging() {

	  BasicConfigurator.configure();
	  log.error("error");
	  log.fatal("fatal");
	  log.debug("debug");
  }
}
