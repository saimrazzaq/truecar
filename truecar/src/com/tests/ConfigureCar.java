package com.tests;
import com.uimappings.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ConfigureCar extends uimappings {

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(4000);
		WebElement dropdown = driver.findElement(By.xpath(trimDropdown));
		dropdown.click();
		Thread.sleep(5000);
		WebElement searchTrimCar = driver.findElement(By.xpath(searchTrim));
        searchTrimCar.sendKeys(carTrim); 
        WebElement selectCarTrim = driver.findElement(By.xpath(selectTrim));
        selectCarTrim.click();
        WebElement optionId = driver.findElement(By.id(optionsId));
        optionId.click();
        Thread.sleep(3000);
        WebElement option1 = driver.findElement(By.id(carOption1));
        option1.click();
        Thread.sleep(3000);
        WebElement option2 = driver.findElement(By.id(carOption2));
        option2.click();
        Thread.sleep(3000);
        WebElement saveCarOptions = driver.findElement(By.xpath(saveOptions));
        saveCarOptions.click();
        
        Thread.sleep(4000);
		
        WebElement incentiveCarId = driver.findElement(By.id(incentiveId));
        incentiveCarId.click();
        Thread.sleep(3000);
        WebElement incentive1 = driver.findElement(By.id(incentiveId1));
        incentive1.click();
        Thread.sleep(3000);
        WebElement incentive2 = driver.findElement(By.id(incentiveId2));
        incentive2.click();
        Thread.sleep(3000);
        WebElement saveIncentiveOptions = driver.findElement(By.xpath(saveIncentive));
        saveIncentiveOptions.click();
        WebElement dealerPricing = driver.findElement(By.xpath(seeDealerPricing));
        dealerPricing.click();
		
	}

}
