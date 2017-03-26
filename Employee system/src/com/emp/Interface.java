package com.emp;
import java.io.*;
public class Interface {
	
	public static void main(String[] args) throws Exception
	{  	
		int tem=0;
		EmpSystem es=new EmpSystem();
		while(tem!=1){
		System.out.println("Welcome to EmployeeSystem!");
		System.out.println("Please choose your option.");
		System.out.println("1: Add new employee;");
		System.out.println("2: Show employee info;");
		System.out.println("3: Delete employee from system;");
		System.out.println("4: Change an employee's salay;");
		System.out.println("5:exit;");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String operType=br.readLine();
		int inputnum = Integer.parseInt(operType);
		switch(inputnum)
		{
			case 1:
			{
				System.out.println("input new employee's name,num and salay.");
				String newname=br.readLine();
				String newnum=br.readLine();
				double newsal=Double.parseDouble(br.readLine());
				es.joinnew(newname, newnum, newsal);
				break;
			}
			case 2:
			{
				String newnum=br.readLine();
				es.showinfo(newnum);
				break;
			}
			case 3:
			{
				String newnum=br.readLine();
				es.delete(newnum);
				break;
			}
			case 4:
			{
				String newnum=br.readLine();
				double newsal=Double.parseDouble(br.readLine());
				es.changesal(newnum, newsal);
				break;
			}
			case 5:
			{
				System.exit(-1);
			}
			default:
			{
				System.out.println("input error.");
				break;
			}
			
		}
		}
	}
}
