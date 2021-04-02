package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class CreateNwLeave extends BasePage implements AutoConstant 
{
	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement leaveName;
	
	@FindBy(id="processLeaveTimeCheckbox_createPopup")
	private WebElement processLeaveTime;
	
	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement asPTO;
	
	@FindBy(xpath = "(//input[@type='radio'])[4]")
	private WebElement asSickDays;
	
	@FindBy(id="leaveTypeLightBox_commitBtn")
	private WebElement newLeave;
	
	@FindBy(id="leaveTypeLightBox_cancelBtn")
	private WebElement leaveCancel;
	
	public CreateNwLeave(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createNewLeaveMethod() throws IOException
	{
		leaveName.sendKeys(ExcelLibrary.getcellvalue(sheet_path,sheet_name, 0, 4));
		newLeave.click();
	}
	
	
	

}
