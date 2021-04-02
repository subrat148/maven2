package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;

public class CreateTypeOfLeave extends BasePage implements AutoConstant 
{
	public WebDriver driver;
	@FindBy(id = "ext-gen6")
	private WebElement createleaveType;
	
	@FindBy(xpath = "(//div[@class='leaveTypeNameText'])[6]")
	private WebElement createdLeave;
	 
	@FindBy(xpath = "(//td[@class='leaveTypeDeleteCell last'])[6]")
	private WebElement deleteLeave;
	
	@FindBy(id="inputDiv")
	private WebElement editLeave;
	
	@FindBy(xpath = "(//div[@class=\"applyButton\"])[2]")
	private WebElement clickEditLeave;
	
	
	public CreateTypeOfLeave(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void leaveTypeMethod()
	{
		createleaveType.click();
	}
	public void deleteLeaveMethod() throws InterruptedException
	{
		deleteLeave.click();
		Thread.sleep(5000);
		CreateTypeOfLeave ok=new CreateTypeOfLeave(driver);
		ok.alertok(driver);
	}

}
