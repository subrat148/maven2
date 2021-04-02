package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class CreateNwWork extends BasePage implements AutoConstant 
{
	@FindBy(id="name")
	private WebElement workName;
	
	@FindBy(name="active")
	private WebElement dropdownList;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement billiable;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement nonbilliable;
	
	@FindBy(id="billingRate_input")
	private WebElement billingRate;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createWork;
	
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement cancelWork;
	
	@FindBy(id= "name")
	private WebElement editworkName;
	
	@FindBy(xpath = "//input[@value='   Save Changes   ']")
	private WebElement savechangesWork;
	
	
	
	public CreateNwWork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createNewWorkMethod() throws InterruptedException, IOException
	{
		workName.sendKeys(ExcelLibrary.getcellvalue(sheet_path, sheet_name, 0, 2));
		Thread.sleep(3000);
		selectbyvisbiletext(dropdownList,"archived");
		billingRate.sendKeys(ExcelLibrary.getcellvalue(sheet_path, sheet_name, 0, 3));
		Thread.sleep(3000);
		createWork.click();
	}
	

	public void editworkMethod() throws InterruptedException
	{
		Thread.sleep(4000);
		editworkName.sendKeys("-jspider");
		savechangesWork.click();
	}


}
