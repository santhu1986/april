package com.ebank.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Rhpexe 

{
	@Test
public void exe()
{
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://192.168.1.200/ranford2/home.aspx");
	driver.manage().window().maximize();
	RHP Rp=PageFactory.initElements(driver,RHP.class);
	Rp.Alogin();
	AHP1 AP=PageFactory.initElements(driver,AHP1.class);
	AP.Rl();
}
}
