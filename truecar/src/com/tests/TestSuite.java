package com.tests;

//import com.regression.automation.Login;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({

SelectCar.class,
ConfigureCar.class,
Register.class,
GetCertificate.class




})
public class TestSuite {

	@Test
	public void Alltests() {
		
	}

}
