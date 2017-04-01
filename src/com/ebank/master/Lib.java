package com.ebank.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Lib 
{
	public static Properties Pr;
	public static FileInputStream Fis;
public static WebDriver driver;
public static String Expval,Actval;

public String openApp(String Url)
{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	String Expval="Ranford Bank";
	driver.get(Url);
	String Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	if (Expval.equalsIgnoreCase(Actval))
	{
	System.out.println("Ranford home page Displayed");
	return "pass";
	}
	else
	{
	System.out.println("Ranford Home Page not Displayed");
	return "Fail";
	}
}
public String AdminLgn(String Un,String Pwd) throws IOException
{
	Pr=new Properties();
	Fis=new FileInputStream("E:\\santhosh\\Ebank\\src\\com\\ebank\\properties\\Rep.properties");
	Pr.load(Fis);
	Expval="Welcome to Admin";
	driver.findElement(By.id(Pr.getProperty("Uname"))).clear();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.id(Pr.getProperty("Uname"))).sendKeys(Un);
	driver.findElement(By.id("txtPword")).clear();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.id(Pr.getProperty("Pwd"))).sendKeys(Pwd);
	driver.findElement(By.id(Pr.getProperty("lgn"))).click();
	
	String Actval= driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	if (Expval.equalsIgnoreCase(Actval))
	{
	System.out.println("Admin home page Displayed");
	return "pass";
	}
	else
	{
	System.out.println("Admin Home Page not Displayed");
	return "Fail";
	}
	
}
public String Rolec(String Rn,String Rd,String Rt)
{
	Sleeper.sleepTightInSeconds(3);
	Expval="Sucessfully";
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	driver.findElement(By.id("btnRoles")).click();
	driver.findElement(By.id("txtRname")).sendKeys(Rn);
	driver.findElement(By.id("txtRDesc")).sendKeys(Rd);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(Rt);
	driver.findElement(By.id("btninsert")).click();
	Sleeper.sleepTightInSeconds(3);
	Actval=driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	if (Actval.contains(Expval)) 
	{
	System.out.println("Role Created");	
	return Actval;
	}
	else
	{
		System.out.println("Role Already exist");
		return "Fail";
	}
	
}
public void branch()
{
	  driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	driver.findElement(By.xpath(".//*[@id='BtnNewBR']")).click();
	driver.findElement(By.id("txtbName")).sendKeys("hfmhkmh");
    Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.id("txtAdd1")).sendKeys("lkhjhhj");
    Sleeper.sleepTightInSeconds(2);
    driver.findElement(By.id("txtZip")).sendKeys("12345");
		 Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.id("lst_counrtyU")).sendKeys("INDIA");
	 Sleeper.sleepTightInSeconds(2);
	
	driver.findElement(By.id("lst_stateI")).sendKeys("Andhra Pradesh");
	WebElement d=driver.findElement(By.xpath(".//*[@id='lst_cityI']"));
	 Sleeper.sleepTightInSeconds(2);
	d.click();
	
	List<WebElement> city=driver.findElements(By.xpath(".//*[@id='lst_cityI']/option"));
	System.out.println(city.size());
	for (int i = 0; i < city.size(); i++) 
	{
		if (city.get(i).getText().equalsIgnoreCase("Hyderabad")) 
		{
			
			city.get(i).click();
			break;
			
		}
		}
	driver.findElement(By.xpath(".//*[@id='btn_insert']")).click();
	Sleeper.sleepTightInSeconds(4);
	driver.switchTo().alert().accept();
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();

}
public void admlgt()

{
	 driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	 
	 }

public void Appc()
{
	 driver.close();
}


}

