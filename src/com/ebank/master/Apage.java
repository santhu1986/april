package com.ebank.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Apage 
{
@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
WebElement branch;

@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
WebElement role;

@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
WebElement emp;

public void br()
{
	branch.click();
}
public void RL()
{
	role.click();
}
public void Em()
{
	emp.click();
}
}
