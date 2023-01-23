package com.CreateAccount.SDP_Facebook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup extends Baseclass{
WebDriver driver = null;
SDP1 s;
	
	String check="Facebook";
	
	@BeforeTest
	public void browser_Launch() {
		driver=browserlaunch("chrome");
		driver.manage().window().maximize();
	}

	@BeforeClass
	@SuppressWarnings("deprecation")
	public void url_Launch() {
		
		getUrl("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = getTitle();
//		System.out.println(title);
		
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		if(title.contains(check)){
			System.out.println("Correct url");
		}
		else
		{
			System.out.println("Incorrect Url");
		}
	}
	
	@Test
	public void login() throws InterruptedException {
		s = new SDP1(driver);
		sendKey(s.getHomepage().getEmail(), "babu@gmail.com");
		sendKey(s.getHomepage().getPass(), "tiger");
		click(s.getHomepage().getLogin());
		Thread.sleep(5000);
	}
	
	@Test(dependsOnMethods = "login")
	
	public void screen_Shot1() throws IOException {
		capture("Facebook");
		navigateBack();
	}
	
	@Test(dependsOnMethods = "screen_Shot1")
	
	public void create_Account() throws InterruptedException {
		
		
		click(s.getCreate_Account().getCreate_New_Account());
		
		sleep();
		
		sendKey(s.getCreate_Account().getFirst_Name(), "sharan");
		sendKey(s.getCreate_Account().getSur_Name(), "kumar");
		sendKey(s.getCreate_Account().getMobile_Number(), "9999999999");
		sendKey(s.getCreate_Account().getPass1(), "Black@123");
		click(s.getCreate_Account().getDay());

		select(s.getCreate_Account().getDay(), "value", "23");
		click(s.getCreate_Account().getMonth());

		select(s.getCreate_Account().getMonth(), "text", "Feb");
		click(s.getCreate_Account().getYear());

		select(s.getCreate_Account().getYear(), "value", "1993");
		click(s.getCreate_Account().getMale());
		click(s.getCreate_Account().getSubmit());
	}
	
	@Test(dependsOnMethods = "create_Account")
	
	public void screen_Shot2() throws IOException {
		
		capture("Facebook create account");
		click(s.getCreate_Account().getClick());
	}
	
	
	@AfterTest
	public void close1() {
		String title2 = getTitle();
		System.out.println("============================="+title2);
		
		if(title2.contains(check)){
			driver.close();
		}
	}

}

