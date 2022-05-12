package com.chainsys.garbagecollections;

public class FinalizeDemo 
	{
		public static void main(String args[])throws Exception
		{
			Calculator c1=new Calculator();
			c1.add(100,50);
			c1=null;
			Calculator c2=new Calculator();
			Calculator c3=new Calculator();
			//creating an object for runtime
			//it is not  possible to creat an object directly for runtime like
			//runtime firstRt=new Runtime();
			//the default constructor for runtime is private here
			//so we use a static mathod for runtime is private here,
			//an object for runtime
			Runtime rt=Runtime.getRuntime();//factorymethod
		     rt.gc();		//forcing garbage collection
		     c2=null;
		     c3=null;
		     rt.gc();
			System.in.read();
		}
	}


