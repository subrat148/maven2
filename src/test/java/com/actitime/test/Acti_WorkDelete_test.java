package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.Acti_settings;
import com.actitime.pom.CreateTypeOfwork;
import com.actitime.pom.HomepageActi;

public class Acti_WorkDelete_test extends BaseTest 
{
	@Test
	public void workDelete() throws InterruptedException
	{
	HomepageActi got=new HomepageActi(driver);
	got.settingMethod();
	Acti_settings click3=new Acti_settings(driver);
	  click3.typesOfWorkMethod();  
	
	  CreateTypeOfwork click4=new CreateTypeOfwork(driver);
	  click4.deleteWorkMethod();
	  
	}

}
