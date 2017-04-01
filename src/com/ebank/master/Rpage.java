package com.ebank.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rpage 

{
  @FindBy (id="txtuId")
  WebElement Uname;
  
  @FindBy (id="txtPword")
  WebElement Pwd;
  
  @FindBy (id="login")
  WebElement Lgn;
  
  public void login(String Un,String Pswd)
  
  {
	  Uname.sendKeys(Un);
	  Pwd.sendKeys(Pswd);
	  Lgn.click();
  }
}
