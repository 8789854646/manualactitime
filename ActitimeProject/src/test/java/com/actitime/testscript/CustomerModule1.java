package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass1;

public class CustomerModule1 extends BaseClass1 {
	@Test
	public void testCreateCustomer() {
		Reporter.log("Create Customer",true);
	}

}
