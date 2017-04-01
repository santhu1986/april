package com.ebank.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RHP 

{
@FindBy (id="txtuId")
  WebElement Uname;

@FindBy (id="txtPword")
 WebElement Pwd;

@FindBy (id="login")
WebElement Lgn;


public void Alogin()
{
	Uname.sendKeys("Admin");
	Pwd.sendKeys("Admin");
	Lgn.click();
}
}
