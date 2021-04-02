package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class ActiCreateCustomerpage extends BasePage implements AutoConstant 
{
public WebDriver driver;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createCustomer;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	public ActiCreateCustomerpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void entercustomernameMethod() throws IOException
	{
		entercustomernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_path, sheet_name, 0, 5));
	}
	
	public void createCustomerMethod()
	{
	
		createCustomer.click();
	}
	public void cancelMethod()
	{
		cancelButton.click();
	}
	

}
