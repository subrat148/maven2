package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.Acti_settings;
import com.actitime.pom.CreateTypeOfLeave;
import com.actitime.pom.HomepageActi;

public class Acti_LeaveDelete_test extends BaseTest 
{
	@Test
	public void leaveDelete() throws InterruptedException
	{
	
	HomepageActi got=new HomepageActi(driver);
	got.settingMethod();
	Acti_settings click3=new Acti_settings(driver);
	  click3.typesOfLeaveMethod();
	  CreateTypeOfLeave click4=new CreateTypeOfLeave(driver);
	click4.deleteLeaveMethod();
	}


}
