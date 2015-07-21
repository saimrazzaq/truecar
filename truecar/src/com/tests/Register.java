package com.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.uimappings.uimappings;

public class Register extends uimappings{

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.id(fNamelocator));
		firstName.sendKeys(userFirstName);
		WebElement lastName = driver.findElement(By.id(lNamelocator));
		lastName.sendKeys(userLastName);
		WebElement userAddress = driver.findElement(By.id(address));
		userAddress.sendKeys(fakeAddress);
		WebElement phoneNumber = driver.findElement(By.id(phone));
		phoneNumber.sendKeys(userphone);
		WebElement userEmail = driver.findElement(By.id(emailIdlocator));
		userEmail.sendKeys(emailid);
		WebElement dealerPricing = driver.findElement(By.xpath(seeDealerPricing));
        dealerPricing.click();
		
		
		
	}

}
