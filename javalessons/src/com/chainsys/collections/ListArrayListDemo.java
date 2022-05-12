package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.chainsys.arraylist.Emp;

 class ListArrayListDemo {
	public static void main(String[]args) {
		lessonArrayList();
	}
	
	public static void lessonArrayList()
	{
		ArrayList<Emp>empArrayList=new ArrayList<Emp>(30);
		System.out.println("InitiempArrayList size of empArraylist:"+empArrayList.size());//0
		try {
			for(int i=0;i<5;i++)
			{
				Emp e1=new Emp(i);
				e1.Name="Emp"+i;
				empArrayList.add(e1);
			}
			System.out.println("size of empArrayList after addition: "+empArrayList.size());
			Emp e3=(Emp)empArrayList.get(4);
			empArrayList.add(e3);
			System.out.println("size of mpArrayList after addition:"+empArrayList.size());
			empArrayList.add(new Emp(4));
			System.out.println("Freq of[Emp id-4]in Arraylist-"+Collections.frequency(empArrayList, e3));
			Iterator<Emp>empiterator=empArrayList.iterator();
			while(empiterator.hasNext())
			{
				Object element=empiterator.next();//retuen curent boject
				Emp e1=(Emp)element;
				System.out.println(" \t "+e1.getId()+" "+e1.Name);
			}
		}
		catch(Exception err)
		{
			System.out.println("error!!!"+err.getMessage());
		}
	}

}
