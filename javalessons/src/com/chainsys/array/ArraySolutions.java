package com.chainsys.array;
public class ArraySolutions{
	public static void findSumandAverageOfaFloatArray(float[]nums)
	{
		//write code to find the sum,and average of nums
		double result=0;
		int count=nums.length;
		for(int I=0;I<count;I++)
		{
			System.out.println(nums[I]+",");
		}
		System.out.println();
		for(int I=0;I<count;I++)
		{
			result=result+nums[I];
		}
		System.out.println("Sum is "+result);
		System.out.println("Average is"+result/count);
	}
	
	
	public static void findTheLargestNumberinArray(float[]nums)
	{
	//write code to find the largest number
	double result=nums[0];
	int count=nums.length;
	for(int I=1;I<count;I++)
	{
		if(result<nums[I])result=nums[I];
	}
	System.out.println("The Largest No is "+result);
	}
	
	
	public static void bubblesort()
	{
		int[] nos= {11,23,4,56,32,43,323,76,8,54,56};
		System.out.println("Original values Before");
		for(int index=0;index<nos.length;index++)
		{
			System.out.print(nos[index]+",");
		}
		System.out.println();
		int count=nos.length;
		int temp=0;
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<(count-1);j++)
			{
				if(nos[j+1]<nos[j])
				{
					temp=nos[j];
					nos[j]=nos[j+1];
					nos[j+1]=temp;
					temp=0;
				}
			}
		}
		System.out.println("Values after SORT");
		for(int index=0;index<nos.length;index++)
		{
			System.out.print(nos[index]+",");
		}
	}
}


