package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.Acti_settings;
import com.actitime.pom.CreateNwWork;
import com.actitime.pom.CreateTypeOfwork;
import com.actitime.pom.HomepageActi;


public class Acti_createWork_test extends BaseTest 
{
	@Test
	public void work() throws InterruptedException, IOException
	{
	HomepageActi got=new HomepageActi(driver);
	got.settingMethod();
	Acti_settings click3=new Acti_settings(driver);
	  click3.typesOfWorkMethod(); 
	  CreateTypeOfwork click1=new CreateTypeOfwork(driver); 
	  click1.createTypesofworkMethod(); 
	  CreateNwWork click2=new CreateNwWork(driver); 
	  click2.createNewWorkMethod();
	}
	

}
