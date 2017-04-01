package Bharatpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rbank {
	/*public static void login(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://192.168.1.200/ranford1/home.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath(".//*[@id='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath(".//*[@id='login']")).click();
	}*/
	public static void main(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://192.168.1.200/ranford1/home.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath(".//*[@id='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath(".//*[@id='login']")).click();
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.xpath(".//*[@id='BtnNewBR']")).click();
		driver.findElement(By.xpath(".//*[@id='txtbName']")).sendKeys("Bharat");
		driver.findElement(By.xpath(".//*[@id='txtAdd1']")).sendKeys("Kphb");
		
		
		
	}


}
