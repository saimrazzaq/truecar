package com.tests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.uimappings.uimappings;

public class GetCertificate extends uimappings{

	@SuppressWarnings("deprecation")
	@Test
	public void test() throws InterruptedException {
	
		
		Thread.sleep(3000);
		
		WebElement nextButton = driver.findElement(By.xpath(getCertificateLocator));
		nextButton.click();
		String bodyText = driver.findElement(By.tagName(trimHeader)).getText();
		Assert.assertTrue("Text not found!", bodyText.contains(carTrim));
		
	}
	
	public void teardown()
	{
		driver.close();
	}

}
