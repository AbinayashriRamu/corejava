package com.chainsys.unittest;

import com.chainsys.variables.Bank;
/**
 * 
 * @author abin3133
 *
 */

public class Banktest {
	public static void testDeposit() 
	{
		System.out.println("Before Balance "+Bank.currentBalance);
		Bank.Deposit(10000);
		System.out.println("After Balance "+Bank.currentBalance);
	}
	public static void testWithdraw()
	{
		System.out.println("Before Balance "+Bank.currentBalance);
		int withdraw=Bank.Withdraw(5000);
		System.out.println("Total Amount is"+withdraw);
		System.out.println("After Balance "+ Bank.currentBalance);
	}
	public static void testOpenaccount()
	{
	Bank.OpenAccount("Abi",1235765445);
	System.out.println(Bank.customerName);
	System.out.println(Bank.accountNumber1);
	
	}
	}
