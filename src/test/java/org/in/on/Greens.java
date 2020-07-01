package org.in.on;

import org.testng.annotations.Test;

public class Greens 
{
	@Test(priority=2)
	public void test1()
	{
	System.out.println("1");	
	}
	@Test(invocationCount=3)
	public void test2()
	{
	System.out.println("2");	
	}

	@Test(enabled=false)
	public void test3()
	{
	System.out.println("3");	
	}

	@Test(priority=-2)
	public void test4()
	{
	System.out.println("4");	
	}
	@Test()
	public void test5()
	{
		System.out.println("5");
	}

}


