package com.ebank.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Basicscript {
	
	public static void main(String[] args)
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	String Expval="Ranford Bank";
	driver.get("http://192.168.1.200/ranford1/home.aspx");
	String Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	if (Expval.equalsIgnoreCase(Actval))
	{
	System.out.println("Ranford home page Displayed");	
	}
	else
	{
	System.out.println("Ranford Home Page not Displayed");
	}
	Expval="Welcome to Admin";
	//driver.findElement(By.id("txtuId")).clear();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	//driver.findElement(By.id("txtPword")).clear();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
	Actval=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	if (Expval.equalsIgnoreCase(Actval))
	{
	System.out.println("Admin home page Displayed");	
	}
	else
	{
	System.out.println("Admin Home Page not Displayed");
	}	
	
	//driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	driver.findElement(By.id("btnRoles")).click();
	driver.findElement(By.id("txtRname")).sendKeys("Venkat");
	driver.findElement(By.id("txtRDesc")).sendKeys("Banker");
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys("E");
	driver.findElement(By.id("btninsert")).click();
	Sleeper.sleepTightInSeconds(3);
	driver.switchTo().alert().accept();
	
	}

}
