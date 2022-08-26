package test;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test
	public void login()
	{
		System.out.println("login");
	}
	@Test(dependsOnMethods = "login")
	public void createWork()
	{	
		Assert.fail();
		System.out.println("createWork");
	}
	@Test(dependsOnMethods = "createWork")
	public void deleteWork()
	{
		System.out.println("deleteWork");
	}



}
