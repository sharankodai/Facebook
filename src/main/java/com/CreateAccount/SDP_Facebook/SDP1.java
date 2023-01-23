package com.CreateAccount.SDP_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SDP1 {

	public static WebDriver driver;
	private Homepage a;
	private Create_Account ca;
	
	
	public SDP1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}
	public Homepage getHomepage() {
	if(a==null) {	
		a= new Homepage(driver);
	}
		return a;
	}
	public Create_Account getCreate_Account() {
		if(ca==null) {
			ca = new Create_Account(driver);
		}
		return ca;
	}
	
	
}
