package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class Acti_LoginPage extends BasePage implements AutoConstant 
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keeploggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public Acti_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_path,sheet_name, 0, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_path, sheet_name, 0, 1));
		keeploggedinCheckbox.click();
		loginButton.click();
	}
	
	public void forgotpasswordMethod()
	{
		System.out.println(forgotyourpasswordLink.getText());
		forgotyourpasswordLink.click();
	}

	public void actitimeincMethod()
	{
		System.out.println(actitimeincLink.getText());
		actitimeincLink.click();
	}

}
