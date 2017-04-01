package com.ebank.master;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class baseNG 

{
	Lib LB=new Lib(); 
  @BeforeTest
  public void beforeTest() throws IOException 
  {
  LB.AdminLgn("Admin","Admin");
  }

  @AfterTest
  public void afterTest() 
  {
  LB.admlgt();
  }

  @BeforeSuite
  public void beforeSuite() 
  {
  LB.openApp("http://192.168.1.200/ranford1/home.aspx");
  }

  @AfterSuite
  public void afterSuite()
  {
  LB.Appc();
  }

}
