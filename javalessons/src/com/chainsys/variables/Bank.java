package com.chainsys.variables;
/**
 * 
 * @author abin3133
 *
 */

public class Bank {
	/**
	 * Deposit method:will take  values using the following parameters
	 * and will deposit the values.the result of totaling will be returned back to the caller
	 *This is static method object reference not required
	 *
	 * @ deposit type int
	 * @return type int
	 * 
	 */
	public static int currentBalance;
	public static String customerName;
	public static int accountNumber1;
	
	public static void Deposit(int amount)
	{
	currentBalance=currentBalance+amount; 
	}
	public static int Withdraw(int amount)
	{
	
	currentBalance=currentBalance-amount;
	return amount;
	}
	public static void OpenAccount(String Name,int accountNumber)
	{
		customerName=Name;
	    accountNumber1=accountNumber;
	}
}
