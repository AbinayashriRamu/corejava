package com.chainsys.exceptions;
import java.util.Scanner;

public class DemoA {
public static void tryCatchFinally() {
System.out.println("Before Try");
try {
System.out.println("Inside Try");
}
catch(Exception err) {
System.out.println("Inside-Catch"+err.getMessage());
}
finally {
System.out.println("Inside-finally");
}
System.out.println("After Try-Catch-finally");
}
public static void tryCatch() {
System.out.println("Before Try");
try {
System.out.println("Inside Try");
}
catch(Exception err) {
System.out.println("Inside-Catch"+err.getMessage());
}
System.out.println("After Try-catch");

}


public static void tryFinally() {
System.out.println("Before Try");
try {
System.out.println("Inside Try");
}
finally {
System.out.println("Inside-finally");
}
System.out.println("After Try-finally");
}
public static void multipleTry() {
  int x=0;
  int y=0;
      System.out.println("Before Try");
Scanner sc=null;
try {
sc=new Scanner(System.in);
}catch(Exception err) {
System.out.println("Error while creating Scanner"+err.getMessage());
return;
}
try {
System.out.println("Inside Try2");
System.out.println("Enter value for x");
x=sc.nextInt();
}catch(Exception err) {
System.out.println("Inside catch-invalid value for X"+err.getMessage());
}//end of try2
System.out.println("After Finally 2");
System.out.println(" Before Try3");
try {
System.out.println("Inside Try3");
System.out.println("Enter value for y:");
y=sc.nextInt();
}catch(Exception err) {
System.out.println("Inside catch-invalid value for y"+err.getMessage());
return;}
finally {
System.out.println("Inside Finally");
sc.close();
}//end of try3
System.out.println("After Finally 3");
try {
int z=x/y;
System.out.println("Z="+z);
}catch(Exception e) {
System.out.println("Error in block4:"+e.getMessage());
}//end of try4
System.out.println("After Try 4");
}
public static void m4()
{
	System.out.println("Before Try");
	int x=0,y=0,z=0;
	String s1=null,s2=null;
	java .util.Scanner sc=null;
	try
	{
		sc=new Scanner(System.in);
		System.out.println("Inside Try");
		System.out.println("Enter value for x");
		s1=sc.nextLine();
		System.out.println("Enter value for y");
		s2=sc.nextLine();
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		z=x/y;
		System.out.println("Result"+z);
	}
	/*catch(exception err)
	 * {
	 * System.ot.println("Inside catch3"+err.getMessage());
	 * System.out println("ErrorType"+err.getClass().getName());
	 * }*/
	catch(ArithmeticException err)
	{
		System.out.println("Inside Catch1"+err.getMessage());
		System.out.println("ErrorType"+err.getClass().getName());
	}
	catch(NumberFormatException err)
	{
		System.out.println("Inside Catch2"+err.getMessage());
		System.out.println("ErrorType"+err.getClass().getName());
	}
	catch(Exception err)
	{
		System.out.println("Inside Catch3"+err.getMessage());
		System.out.println("ErrorType"+err.getClass().getName());
	}
	finally
	{
		System.out.println("Inside Finally");
	}
	System.out.println("After Finally");
	
}
}