package com.Log4july07;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Demo1 {
	static Logger log = Logger.getLogger("Demo1.class");
  @Test
  public void log() {
	  BasicConfigurator.configure();
	  log.error("error");
	  log.fatal("fatal");
	  log.debug("debug");
  }
}
