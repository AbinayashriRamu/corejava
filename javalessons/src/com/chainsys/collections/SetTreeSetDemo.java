package com.chainsys.collections;

import java.util.Iterator;
import java.util.TreeSet;

class SetTreeSetDemo {
	public static void main(String[]args)
	{
		demoA();
	}
	public static void demoA()
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Cut");
		ts.add("fun");
		ts.add("Assam");
		ts.add("Ball");
		ts.add("dog");
		ts.add("Aag");
		ts.add("Event");
		ts.add("Fan");
		ts.add("Delhi");
		ts.add("Carrot");
		ts.add("Ball");
		ts.add("apple");
		ts.add("boy");
		ts.add("egg");
		ts.add("fool");
		ts.add("Aag");
		System.out.println("size"+ts.size());
		Iterator<String>itr=ts.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			
		}
		
	}

}
