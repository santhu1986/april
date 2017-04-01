package com.ebank.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exerpage 

{
	@Test
public void exelogin()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://192.168.1.200/ranford1/home.aspx");
	driver.manage().window().maximize();
	
	Rpage RP=PageFactory.initElements(driver,Rpage.class);
	RP.login("Admin","Admin");
	Apage AP=PageFactory.initElements(driver,Apage.class);
	AP.RL();
}
}
