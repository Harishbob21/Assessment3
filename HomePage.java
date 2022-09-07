package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	/*
	 * public HomePage verifyHomePage() {
	 * verifyDisplayed(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
	 * reportStep("Homepage is loaded", "pass"); return this; }
	 */
	
	/*
	 * public SalesPage verifyHomePage() {
	 * verifyDisplayed(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
	 * reportStep("Homepage is loaded", "pass"); return new SalesPage(); }
	 */
	
	public PreChattPage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
		reportStep("Homepage is loaded", "pass");
		return new PreChattPage();
	}
	
	/*
	 * public MyHomePage clickCrmsfaLink() { click(locateElement(Locators.LINK_TEXT,
	 * "CRM/SFA")); reportStep("CRM/SFA link is clicked", "pass"); return new
	 * MyHomePage(); }
	 */
	
}
