package com.chainsys.exceptions;
import java.util.Scanner;

public class NestedTry {
	static String[]data;
	public static void main(String args[])
	{
		int num=0;
		int numValue=0;
		data=new String[2];
		java.util.Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			try
			{
				System.out.println("Enter value for x");
				data[0]=sc.nextLine();//123--abcd--123
				numValue=Integer.parseInt(data[0]);//data[2]
				System.out.println("The square is"+numValue*numValue);
			}
			catch(NumberFormatException nb)
			{
				System.out.println("Not a number!");
			
			}
			num=data.length;
			System.out.println("Array Length"+num);
		}
		catch(ArrayIndexOutOfBoundsException ne)
		{
			System.out.println("ArrayIndexOutOfBounds=No argument given!!!");
		}
		catch(Exception er)
		{
			System.out.println("Exception"+er.getMessage()); 
		}	
		}
	public static void m4() throws Exception
	{
		Exception e1=new Exception("Error 1");
		//Innr exception
		//e1 is nested inside e2
		Exception e2=new Exception("Error 2",e1);
		throw e2;
	}
		public static void M4()
		{
		try
		{
			m4();
		}
		catch(Exception e)
		{
			System.out.println("Inside catch"+e.getMessage());
			Throwable t1=e.getCause();
			System.out.println("Cause"+t1.getMessage());
			
		}
	}
	
	}


