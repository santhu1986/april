package com.ebank.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelib {
	
	public static void main(String[] args) throws IOException 
	{
		Lib LB=new Lib();
		String Res=LB.openApp("http://192.168.1.200/ranford1/home.aspx");
		System.out.println(Res);
		Res=LB.AdminLgn("Admin","Admin");
		System.out.println(Res);
		
	FileInputStream Fis=new FileInputStream("E:\\santhosh\\Ebank\\src\\com\\ebank\\testdata\\Role.xlsx");
		
		
	//creating Workbook
	XSSFWorkbook WB=new XSSFWorkbook(Fis);
	//Sheet
	XSSFSheet WS=WB.getSheet("RoleData");
	/*//Row
	XSSFRow WR=WS.getRow(1);
	//cell
	XSSFCell WC=WR.getCell(0);
	Res=WC.getStringCellValue();
	System.out.println(Res);*/
	//Row count
	int Rc=WS.getLastRowNum();
	System.out.println(Rc);
	for (int i = 1; i <=Rc; i++) 
	{
		XSSFRow WR=WS.getRow(i);
		//cell
		XSSFCell WC=WR.getCell(0);	
		XSSFCell WC1=WR.getCell(1);
		XSSFCell WC2=WR.getCell(2);
		XSSFCell WC3=WR.createCell(3);
		
		String Rname=WC.getStringCellValue();
		String Rdes=WC1.getStringCellValue();
		String Rtype=WC2.getStringCellValue();
		Res=LB.Rolec(Rname,Rdes,Rtype);
		System.out.println(Res);
		WC3.setCellValue(Res);
	}
	FileOutputStream Fos=new FileOutputStream("E:\\santhosh\\Ebank\\src\\com\\ebank\\results\\roleres.xlsx");
	WB.write(Fos);
	WB.close();
	}

}
