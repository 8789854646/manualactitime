package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ActitimeCustomerModule extends BaseClass {
  @Test
  public void testTaskModule() {
	  Reporter.log("Task Module",true);
  }
}
