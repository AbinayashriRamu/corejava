package com.chainsys.variables;
/**
 * 
 * @author abin3133
 *created on:25 march 2022
 */

public class Calculator {
	/**
	 * Add method:will take 2 values using the following parameters
	 * and will add the values.the result of totaling will be returned back to the caller
	 *This is static method object reference not required
	 *
	 * @ param param1 of type int
	 * @ param param2 of type int
	 * @return type int
	 * 
	 */
	public static int Add(int param1,int param2)
	{
	
	int result=param1+param2;
	return result;
	}
	/**
	 * multiply method:will take 2 values using the following parameters
	 * and will multiply the values.the result of totaling will be returned back to the caller
	 *This is static method object reference not required
	 *
	 * @ param param1 of type int
	 * @ param param2 of type int
	 * @return type int
	 * 
	 */
	public static int Multiply(int param1,int param2)
	{
	
	int result=param1*param2;
	return result;
	}
	/**
	 * divide method:will take 2 values using the following parameters
	 * and will divide the values.the result of totaling will be returned back to the caller
	 *This is static method object reference not required
	 *
	 * @ param param1 of type int
	 * @ param param2 of type int
	 * @return type int
	 * 
	 */
	public static int Divide(int param1,int param2)
	{
	
	int result=param1/param2;
	return result;
	}
	/**
	 * subtraction method:will take 2 values using the following parameters
	 * and will subtraction the values.the result of totaling will be returned back to the caller
	 *This is static method object reference not required
	 *
	 * @ param param1 of type int
	 * @ param param2 of type int
	 * @return type int
	 * 
	 */
	public static int Subtraction(int param1,int param2)
	{
	
	int result=param1-param2;
	return result;
	}
	
}
