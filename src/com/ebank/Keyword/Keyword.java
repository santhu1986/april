package com.ebank.Keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Keyword {

      public static void main(String[] args) throws IOException 
	{
		//Creating instance class
		lib LB=new lib();
		//declaring variable Res
		 String Res=null;
		 // Keyword test data path
		 String Kpath="E:\\santhosh\\Ebank\\src\\com\\ebank\\Keyword\\keyword_data.xlsx";
		 //results path
		 String Kout="E:\\santhosh\\Ebank\\src\\com\\ebank\\Keyword\\keyword_Result.xlsx";
		 //to get file		
		 FileInputStream fi=new FileInputStream(Kpath);
			//creating workbook
			XSSFWorkbook wb=new XSSFWorkbook(fi);

			//sheet
			XSSFSheet ws=wb.getSheet("TestCase");
			XSSFSheet ws1=wb.getSheet("TestSteps");
			XSSFSheet ws2=wb.getSheet("TestData");
			
			//Row count
			int tcRc=ws.getLastRowNum();
	        System.out.println(tcRc);
			int tsRc=ws1.getLastRowNum();
			System.out.println(tsRc);
			
			//test cases

			for (int i = 1; i <= tcRc; i++)
			{
				String exe=ws.getRow(i).getCell(2).getStringCellValue();
	             //System.out.println(exe);
	             Sleeper.sleepTightInSeconds(3);
				if (exe.equalsIgnoreCase("Y"))
				{
					String tcId=ws.getRow(i).getCell(0).getStringCellValue();
					System.out.println(tcId);
					Sleeper.sleepTightInSeconds(3);
					//test steps
					
					for (int j = 1; j <= tsRc ; j++) 
					{
						String tsTcid=ws1.getRow(j).getCell(0).getStringCellValue();
						//System.out.println(tsTcid);
						Sleeper.sleepTightInSeconds(3);
						if (tcId.equalsIgnoreCase(tsTcid))
						{
							String key=ws1.getRow(j).getCell(3).getStringCellValue();
							System.out.println(key);
							Sleeper.sleepTightInSeconds(3);
							switch (key) 
							{
							case "rLanch":
								Res=LB.openApp("http://192.168.1.200/ranford1/home.aspx");
							break;
							case "rLogin":
								Res=LB.AdmLgn("Admin","Admin");
								break;
							case "rLogout": 	
								LB.admlgt();
								break;
							case "rBranch":
									LB.branch();
								break;
							case "rRole":
								Res=LB.Role("Cashsbh8089","E");
								break;
							case "rClose":
								LB.Appc();
								break;
							
							default:
								System.out.println("Pass a Valid Keyword");
								break;
							}

							//result updation in test steps sheet
							
							ws1.getRow(j).createCell(4).setCellValue(Res);
							
							//result updation in test case sheet
							
							if (ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Pass"))
							{
								ws.getRow(i).createCell(3).setCellValue(Res);
							}
							else
							{
								ws.getRow(i).createCell(3).setCellValue("Fail");
							}
							
							
						}
						
						
						
					}
					
				}
				else
				{
					ws.getRow(i).createCell(3).setCellValue("BLOCKED");
				}
			}
			FileOutputStream fo=new FileOutputStream(Kout);
			wb.write(fo);
			wb.close();

		}

		}



	

