package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_settings 
{
	@FindBy(xpath = "//div[.='Turn Features On / Off']")
	private WebElement turnOnOFFfeatures;
	
	@FindBy(xpath = "//li[@id='popup_menu_item_6']")
	private WebElement generalsettings;
	
	@FindBy(id="popup_menu_item_9")
	private WebElement workflowsettings;
	
	@FindBy(id="popup_menu_item_2")
	private WebElement typesOfWork;
	
	@FindBy(id="popup_menu_item_3")
	private WebElement typesOfLeave;
	
	@FindBy(xpath = "//li[.='Notifications']")
	private WebElement notifications;
	
	@FindBy(id="popup_menu_item_7")
	private WebElement logoSettings;
	
	@FindBy(id="popup_menu_item_8")
	private WebElement licences;
	
	public Acti_settings(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void typesOfWorkMethod()
	{
	
		typesOfWork.click();
	}
	
	public void typesOfLeaveMethod()
	{

		typesOfLeave.click();
	}

}
