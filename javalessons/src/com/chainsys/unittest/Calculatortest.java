package com.chainsys.unittest;

import com.chainsys.variables.Calculator;

/**
 * This class is for unit testing the calculator class and its methods
 * methods to test
 * <list>
 * add(param1,param2)
 * multiply(param1,param2)
 * divide(param1,param2)
 * subtraction(param1,param2)
 * <list>
 * @author abin3133
 * created on:25 mar 2022
 */
public class Calculatortest{
	/***
	 * calling static method using class name
	 * without creating an object,non-static methods can not be called
	 * created on:25 March 2022
	 * 
	 */
	public static void testAdd()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Add(arg1, arg2);
		System.out.print("Result of Add is:"+output);
	}
	public static void testMultiply()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Multiply(arg1, arg2);
		System.out.print("Result of Multiply is:"+output);
	}
	public static void testDivide()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Divide(arg1, arg2);
		System.out.print("Result of Divide is:"+output);
	}
	public static void testSubtraction()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Subtraction(arg1, arg2);
		System.out.print("Result of Subtraction is:"+output);
	}
}