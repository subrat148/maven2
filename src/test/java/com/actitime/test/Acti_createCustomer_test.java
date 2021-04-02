package com.actitime.test;




import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActiCreateCustomerpage;
import com.actitime.pom.ActiTaskpage;
import com.actitime.pom.HomepageActi;

public class Acti_createCustomer_test extends BaseTest 
{
	@Test
	public void customer() throws InterruptedException, IOException
	{
		
		HomepageActi got=new HomepageActi(driver);
		got.taskMethod();
		ActiTaskpage click1=new ActiTaskpage(driver);
		click1.addnewMethod();
		ActiTaskpage click4=new ActiTaskpage(driver);
		click4.newcustomerMethod();
		ActiCreateCustomerpage click2=new ActiCreateCustomerpage(driver);
		click2.entercustomernameMethod();
		ActiCreateCustomerpage click3=new ActiCreateCustomerpage(driver);
		click3.createCustomerMethod();
	}

}
