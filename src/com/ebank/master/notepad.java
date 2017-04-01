package com.ebank.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class notepad {
	
	public static void main(String[] args) throws IOException
	{

		Lib LB=new Lib();
		String Res=LB.openApp("http://192.168.1.200/ranford1/home.aspx");
		System.out.println(Res);
		Res=LB.AdminLgn("Admin","Admin");
		System.out.println(Res);
		
		String Fpath="E:\\santhosh\\Ebank\\src\\com\\ebank\\testdata\\role.txt";
		
		String Rpath="E:\\santhosh\\Ebank\\src\\com\\ebank\\results\\roleres.txt";
		String SD;
		FileReader Fr=new FileReader(Fpath);
		BufferedReader Br=new BufferedReader(Fr);
		String Sread=Br.readLine();
		System.out.println(Sread);
		
		FileWriter Fw=new FileWriter(Rpath);
		BufferedWriter Bw=new BufferedWriter(Fw);
		Bw.write(Sread);
		Bw.newLine();
		
		while ((SD=Br.readLine())!=null) 
		{
	          System.out.println(SD);
	          String [] Sr=SD.split("###");
	          String Rname=Sr[0];
	          System.out.println(Rname);
	          String Rdes=Sr[1];
	          System.out.println(Rdes);
	          String Rtype=Sr[2];
	          System.out.println(Rtype);
	          
	          Res=LB.Rolec(Rname,Rdes,Rtype);
	          System.out.println(Res);
	          Bw.write(Rname+"@@@"+Rdes+"###"+Rtype+"%%%"+Res);
	          Bw.newLine();
	          
		}
	Bw.close();
	Br.close();
	}

}
