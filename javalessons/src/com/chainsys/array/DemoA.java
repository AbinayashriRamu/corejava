package com.chainsys.array;

import java.util.Arrays;
import java.util.Scanner;

public class DemoA {
	public static void creatingSingleDimensionalArray() {
		int firstintArray[] = new int[10];
		// int secondintArray[4]={1,2,3,4};
		int secondintArray[] = { 1, 2, 3, 4 };
		System.out.println(firstintArray);
		System.out.println(secondintArray);
	}

	public static void creatingArrays()
	{
		int firstValue =100;
		int[] numbers={10,20,30,40,50};
		int lengthofnumbers=numbers.length;
		System.out.println("length of number ="+lengthofnumbers);
		for(int x:numbers) {
			System.out.print(x+",");
		}
		System.out.println();
	}
	public static void creatingAnotherArray()
	{
		int days[];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of days:");
		int size=input.nextInt();
		input.close();
		//the days is the instantiated with a length equal to size
		days=new int[size];
		if(days!=null)
			System.out.println("Days is not null");
		int lengthofdays=days.length;
		System.out.println("No of Days "+lengthofdays);
		for(int i=0;i<lengthofdays;i++)
		{
			int value =(int)(Math.random()*10);
			days[i]=value;
		}
		for(int x:days)
			System.out.println(x);
		
	}
	public static void creatingMonthArray()
	{
		int month[] =new int[12];
		int lengthofmontharray=month.length;//12
		System.out.println("Array length is "+lengthofmontharray);
		for(int i=0;i<lengthofmontharray;i++) {
		System.out.println(i+"-"+month[i]+",");//month
		}
		System.out.println();
		month [1] =31;
		for(int i = 0;i<lengthofmontharray;i++) {
			System.out.println(i+"-"+month[i]+",");
		}
		try
		{
			//month[12]=31;
			System.out.println("Hi......");
			month[11]=31;//upper index is length -1
		}catch(Exception err)
		{
			System.out.println("Error!!!"+err.getMessage());
		}
		int anotherMonth[]= {31,28,31,30,31,30,31,31};
		int lengthofmontharray1=anotherMonth.length;
		System.out.println("Array length is "+ lengthofmontharray1);
		for(int i=0;i<lengthofmontharray1;i++) {
			System.out.println(i+"-"+anotherMonth[i]+",");
		}
		
	}
	public static void workingWithArrayClass()
	{
		int numberArray[]=new int[10];
		for(int i=0;i<10;i++)
		{
			numberArray[i]=-3*i;
		}
		System.out.println("Original contents:");
		int lengthofarray=numberArray.length;
		System.out.println("Array length is "+lengthofarray);
		for(int i=0;i<lengthofarray;i++)
			System.out.print(numberArray[i]+" ");
		System.out.println();
		Arrays.sort(numberArray);
		System.out.println("Sorted Arrays: ");
		for(int i=0;i<lengthofarray;i++)
			System.out.print(numberArray[i]+" ");    
		System.out.println();
		Arrays.fill(numberArray,2,6,-1);//from index 2 to  index 5
		System.out.println("Arrays after Fill: ");
		for(int i=0;i<lengthofarray;i++)
			System.out.print(numberArray[i]+" ");
		System.out.println();
		int index=Arrays.binarySearch(numberArray, -9);
		System.out.println("without sorting index of -9: "+index);//wrong value
		Arrays.sort(numberArray);
		for(int i=0;i<lengthofarray;i++)
			System.out.print(numberArray[i]+" "); 
		System.out.println();
		index =Arrays.binarySearch(numberArray, -9);
		System.out.println("with sorting index of -9: "+index);
	}
	public static void workingWithCharArray()
	{
		String s1 ="Today is a very hot day";
		char[] data=s1.toCharArray();
		int count=data.length;
		System.out.println("Array length "+count);
		for(int i=0;i<count;i++)
			System.out.println(data[i]+" "+(int)data[i]);
	}
}