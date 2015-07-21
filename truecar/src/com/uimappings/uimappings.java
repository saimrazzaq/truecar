package com.uimappings;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class uimappings {
	
	public static WebDriver driver = new FirefoxDriver();
	protected static String baseUrl = "https://autoblog.truecar.com";
	protected static String makeDropDown = "s2id_home_select_make";
	protected static String makeOption = "select2-match";
	
	protected static String makeDropdown="/html/body/div[1]/div[3]/div/fieldset/ol/li[1]/div/a/div/b";
	protected static String makeSearchtext = "/html/body/div[4]/div/input";
	protected static String searchResult ="/html/body/div[4]/ul/li/div";
	protected static String modelDropdown = "/html/body/div[1]/div[3]/div/fieldset/ol/li[2]/div/a/div/b";
	
	protected static String modelDropdownSearch = "/html/body/div[5]/div/input";
	protected static String modelSelect = "/html/body/div[5]/ul/li[1]/ul/li/div/span";
	protected static String zipCode = "home_zip";
	
	protected static String zipCodeNumber = "90405";
	protected static String goButton = "home_cta";
	protected static String trimDropdown ="/html/body/div[1]/div[3]/div[2]/div[1]/div/div[2]/ol/li[1]/fieldset/div/a/div/b";
	protected static String carTrim = "3.5L EcoBoost AWD";
	protected static String searchTrim = "/html/body/div[4]/div/input";
	protected static String selectTrim ="/html/body/div[4]/ul/li/div";
	protected static String optionsId ="edit_opts";
	protected static String carOption1 ="tc_option_5";
	protected static String carOption2 ="tc_option_19";
	protected static String saveOptions ="//*[contains(text(), 'Save & Update')]";
	protected static String incentiveId ="edit_incs";
	protected static String incentiveId1 = "incentive_4000133735";
	protected static String incentiveId2 = "incentive_4000113423";
	protected static String saveIncentive = "//*[contains(text(), 'Save & Update')]";;
	protected static String seeDealerPricing = "//*[contains(text(), 'Next: View Dealer Pricing')]";
	protected static String fNamelocator = "given_name";
	protected static String lNamelocator = "family_name";
	protected static String address = "street_address";
	protected static String phone = "phone_number";
	protected static String seePricing = "//*[contains(text(), 'Next: View Dealer Pricing')]"; 
	protected static String emailIdlocator = "email_address"; 
	protected static String userFirstName = "XXXXXXX";
	protected static String userLastName = "ZZZZZZZ";
	protected static String fakeAddress = "11277 Henge Dr";
	protected static String userphone = "6617773333";
	protected static String emailid = "abc@cc.com";
	protected static String getCertificateLocator = "//*[contains(text(), 'Next')]";
	protected static String trimHeader = "h2";
	
	
	
	
	
	
	
}
