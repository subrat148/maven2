package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageActi 
{
	@FindBy(xpath ="(//div[@class='popup_menu_icon'])[2]")
	private WebElement settings;
	
	@FindBy(xpath = "//a[@class=\"content tasks\"]")
	private WebElement tasks;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public HomepageActi(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void settingMethod()
	{
		settings.click();
	}
	
	public void taskMethod()
	{
		tasks.click();
	}
	
	public void logoutMethod()
	{
		logoutLink.click();
		
	}


}
