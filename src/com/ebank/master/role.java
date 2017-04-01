package com.ebank.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class role extends baseNG

{
	@Test(dataProvider="Rdata")
public void ExeR(String RN,String Rd,String Rt)
{
	LB.Rolec(RN,Rd,Rt);
}
	@DataProvider
	
	public Object[][] Rdata()
	{
		Object[][] obj=new Object[3][3];
		
		obj[0][0]="manager27";
		obj[0][1]="xyz12";
		obj[0][2]="E";
		
		obj[1][0]="manager28";
		obj[1][1]="xyz12";
		obj[1][2]="E";
		
		obj[2][0]="manager29";
		obj[2][1]="xyz12";
		obj[2][2]="E";
		
		return obj;
	}
	
	
}
