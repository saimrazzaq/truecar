package com.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uimappings.*;

import static org.junit.Assert.*;



public class SelectCar extends uimappings{

	@Test
	public void test() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement elementToSelect = driver.findElement(By.xpath(makeDropdown));
		elementToSelect.click();
		
		Thread.sleep(3000);
		WebElement makeSearch = driver.findElement(By.xpath(makeSearchtext));
		makeSearch.sendKeys("Lincoln");
		Thread.sleep(3000);
		WebElement searchResultLincoln = driver.findElement(By.xpath(searchResult));
		searchResultLincoln.click();
		
		WebElement modelDropdownIcon = driver.findElement(By.xpath(modelDropdown));
		modelDropdownIcon.click();
		Thread.sleep(3000);
		WebElement modelDropdownSearchbox = driver.findElement(By.xpath(modelDropdownSearch));
		modelDropdownSearchbox.sendKeys("MKS");
		Thread.sleep(3000);
		WebElement modelSelectValue = driver.findElement(By.xpath(modelSelect));
		modelSelectValue.click();
		WebElement zipCodeTextBox = driver.findElement(By.id(zipCode));
		zipCodeTextBox.clear();
		zipCodeTextBox.sendKeys(zipCodeNumber);
		Thread.sleep(3000);
		
		WebElement goButtonClick = driver.findElement(By.id(goButton));
		goButtonClick.click();
		
	
		
		
		
		
	    
	}

}
