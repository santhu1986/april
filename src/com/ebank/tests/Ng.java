package com.ebank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ng 


	{
		@Test(priority=0)
	public void xyz()
	{
		Assert.assertEquals("Facebook","Facebook");
	}
		@Test(priority=2,enabled=false)
	public void abc()
	{
		Assert.assertEquals("Gmail","Gmail");
	}
		@Test(priority=1)
	public void pqr()
	{
		Assert.assertEquals("Yahoo","Yahoo");
	}

	}

