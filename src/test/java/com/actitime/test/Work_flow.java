package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.Acti_settings;
import com.actitime.pom.HomepageActi;

public class Work_flow extends BaseTest 
{
	@Test
	public void workflowClick()
	{
		HomepageActi got=new HomepageActi(driver);
		got.settingMethod();
		Acti_settings click1=new Acti_settings(driver);
		click1.workflowMethod();
		
		
	}

}
