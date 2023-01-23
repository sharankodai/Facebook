package com.CreateAccount.SDP_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public static WebDriver driver;
	
	public Homepage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(xpath="//button[@data-testid=\"royal_login_button\"]")
	private WebElement login;

}
