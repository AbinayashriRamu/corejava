package com.chainsys.variables;

public class Demoa {
	public static int DataA;
	public final int DataB;//immutable global variables(not static)
	public final static int DataC=300;//constant
	private int dataD;
	//constructor
	/*
	 * constructor is a special method
	 * The name of the constructor and the name of the class will be same
	 * Constructor don't have return type
	 * Contructor can take parameters
	 */
	public Demoa(int dataB)
	{
		/*Assigning value to the global readonly field (this.DataB)*/
		this.DataB=dataB;
	}
	/**
	 * static method can be called without an object
	 */
	public static void sayHello()
	{
		System.out.println("Hello Developer!!!");
	}
	/**
	 * greetuser is a non static methode
	 * 
	 */
	public static void  greetuser()
	{
		System.out.println("Greeting user!!!");
	}
}
