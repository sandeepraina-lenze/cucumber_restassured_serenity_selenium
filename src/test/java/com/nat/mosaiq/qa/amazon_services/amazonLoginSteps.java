package com.nat.mosaiq.qa.amazon_services;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import com.nat.mosaiq.qa.repository.Amazon;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazonLoginSteps {	
	Amazon amazon;
	public static WebDriver driver;	
	
	@Step
	public void user_is_on_Home_Page(String pageAddress) {
		ChromeOptions opt = new ChromeOptions();
		opt.setHeadless(true);

		System.setProperty("webdriver.chrome.driver","src/test/resources/BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pageAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Step
	public void user_Navigate_to_LogIn_Page() {
		amazon=new Amazon(driver);
		amazon.btn_SignIn.click();
	}
	
	@Step
	public void user_enters_UserName_and_Password(String username, String password) {
		amazon.txt_username.sendKeys(username);
		amazon.txt_password.sendKeys(password);
		amazon.btn_SignInSubmit.click();
	}
	
	@Step
	public void message_displayed_Login_Successfully()
	{
		String msg=amazon.errormessage.getText();
		System.out.println(msg);
		Assert.assertEquals(msg, "Important Message!");
		driver.close();
		driver.quit();	 
	}	 
}
