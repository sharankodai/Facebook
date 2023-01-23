package com.CreateAccount.SDP_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Account {
public static WebDriver driver;
	
	public Create_Account(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']")
	private WebElement create_New_Account;
	
	@FindBy(xpath="//input[@placeholder='First name']")
	private WebElement first_Name;
	
	@FindBy(xpath="//input[@aria-label='Surname']")
	private WebElement sur_Name;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobile_Number;
	
	@FindBy(xpath="//input[@autocomplete='new-password']")
	private WebElement pass1;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(xpath="//img[@class='_8idr img']")
	private WebElement click;
	
	public WebElement getClick() {
		return click;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreate_New_Account() {
		return create_New_Account;
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getSur_Name() {
		return sur_Name;
	}

	public WebElement getMobile_Number() {
		return mobile_Number;
	}

	public WebElement getPass1() {
		return pass1;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement male;
	
	@FindBy(xpath="//button[text()='Sign Up'][1]")
	private WebElement submit;
	

}
