package com.nat.mosaiq.qa.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Amazon {
	public Amazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[text()='Hello, Sign in']") 
	public WebElement btn_SignIn;

	@FindBy(how = How.NAME, using = "email") 
	public WebElement txt_username;

	@FindBy(how = How.NAME, using = "password") 
	public WebElement txt_password;

	@FindBy(how = How.ID, using = "signInSubmit") 
	public WebElement btn_SignInSubmit;

	@FindBy(how = How.XPATH, using = "//*[@id=\"auth-warning-message-box\"]/div/h4") 
	public WebElement errormessage;		 		 
}