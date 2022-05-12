package com.chainsys.entrypoint;


import com.chainsys.arraylist.Emp;
//import edu.lessons.days60.oops.interfaces;


//import com.chainsys.strings.StringBuilderDemo;



/***
 * 
 * @author abin3133
 * @version1.0
 * date:Mar 3 2022
 * @category:classroom lesson
 * purpose:entry point class for the entire project
 
 */

public class Startup {

	public static void main(String[] args) {
		
				//Object firstObject=new Object();
		 //String firstObject="Hello";
		 
		 /**
		  * toString():String
		  * equals(..):boolean
		  * hashCode():int
		  * getClass():class-return a reference to the METAdata of the object
		  */
		/**
		 *  System.out.println(firstObject.hashCode());
		 */
		// System.out.println(firstObject.toString());
		// System.out.println(firstObject.getClass().getName());
		 //Object secondObject=new Object();
		 //System.out.println(secondObject.hashCode());
		 //boolean flag=firstObject.equals(secondObject);
		 //System.out.println("Equals:"+flag);
		 //Employee emp=new Employee(100);
		 //System.out.println(emp.hashCode());
		 //System.out.println(emp.toString());
		 //System.out.println(emp.getClass().getName());

//		
		//Testscoreboard.testRCBMatch();
		//NestedTry.M4();
		//TestShape.testPolymorphism();
		
		//TestDemoB.testDemoB();
		Emp e=new Emp(2);
        e.getId();
        e.equals(e);
        e.hashCode();
        System.out.println(e.getId());
        System.out.println(e.equals(e));
        System.out.println(e.hashCode());
}
}
			