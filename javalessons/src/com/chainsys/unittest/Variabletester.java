package com.chainsys.unittest;

import com.chainsys.variables.Demoa;

/**
 * tester class for global variables
 * @author abin3133
 *@category to test demo class,its fields and methods
 *date: march 24 2022
 */

public class Variabletester {
	/**
	 *test static,constant,immutable variables
	 */
	public static void testImmutabeVariable()
	{
		/*cannot make a static reference to the non-static field Demoa.DataB*/
		//demo.DataB=123
		/**
		 * first create an object for the class
		 *pass an int value as an argument to the constructor
		 *access the immutable instance field using the object reference
		 */
		Demoa firstobject=new Demoa(123);
		System.out.println(firstobject.DataB);
		/**
		 * value assigned to an immutable field can not changed
		 * value for the immutable field can be assigned only through the constructor
		 **/
		//firstobject.DataB=567;
	}
	
	public static void testGlobalVariable()
	{
		//Display the value of static field
		//value is zero(default value)
		//DataA is accessed without creating an object
		System.out.println("DataA:"+Demoa.DataA);
		/**
		 *Display the value of immutable field
		 *this is not possible without an object
		 *system.out.println("DataB:"+Demo.DataB);
		 *display the value of constant field
		 * */
		System.out.println("DataC: "+ Demoa.DataC);
		 //modifying value of the static field DataA
		Demoa.DataA=2345;
		System.out.println("DataA: "+Demoa.DataA);
		//modifying value of the static field DataC
		//Error:The final field Demoa.DataC cannot be assigned
		//Demoa.Data=2345;
	}
	/***
	 * calling static method using class name
	 * without creating an object,non-static methods can not be called
	 * created on:25 March 2022
	 * 
	 */
	public static void testStaticMethod()
	{
		Demoa.sayHello();
	}
	/***
	 * calling static method using class name
	 * without creating an object,non-static methods can not be called
	 * created on:25 March 2022
	 * 
	 */
	public static void testNonStaticMethod()
	{
		//Error
		//Demo.greetUser()
		Demoa firstObject=new Demoa(111);
		//call the non static method
		firstObject.greetuser();
	}
}
	
		
