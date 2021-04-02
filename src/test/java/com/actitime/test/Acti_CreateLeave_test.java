package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.Acti_settings;
import com.actitime.pom.CreateNwLeave;
import com.actitime.pom.CreateTypeOfLeave;
import com.actitime.pom.HomepageActi;

public class Acti_CreateLeave_test extends BaseTest
{
	@Test
	public void leave() throws InterruptedException, IOException
	{
	HomepageActi got=new HomepageActi(driver);
	got.settingMethod();
	Acti_settings click3=new Acti_settings(driver);
	  click3.typesOfLeaveMethod();
	  CreateTypeOfLeave click2=new CreateTypeOfLeave(driver); 
	  click2.leaveTypeMethod(); 
	  CreateNwLeave click1=new CreateNwLeave(driver); 
	  click1.createNewLeaveMethod();
	}

}
