package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.Acti_LoginPage;
import com.actitime.pom.HomepageActi;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant 
{
	public WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@BeforeMethod
	public void logintoActi() throws IOException
	{
		Acti_LoginPage login=new Acti_LoginPage(driver);
		login.loginMethod();
	}
	
	@AfterMethod
	public void logoutfromActi()
	{
		HomepageActi home=new HomepageActi(driver);
		home.logoutMethod();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}


}
