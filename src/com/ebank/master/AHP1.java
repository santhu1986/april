package com.ebank.master;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AHP1 

{
@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
WebElement branch;

@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td")
WebElement Role;

public void Br()
{
	branch.click();
}
public void Rl()
{
	Role.click();
}

}
