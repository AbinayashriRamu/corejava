package com.chainsys.strings;

public class StringBuilderDemo {
	public static void testA()
	{
		String firstString = "Hello how are you today.Is the weather hot or cold";
	StringBuilder stringbuilder =new StringBuilder();
	stringbuilder.ensureCapacity(250);
	System.out.println("length = "+stringbuilder.length());
	System.out.println("capacity = "+stringbuilder.capacity());
	stringbuilder.append(firstString);
	System.out.println("buffer = "+stringbuilder);
	System.out.println("length = "+stringbuilder.length());
	System.out.println("capacity = "+stringbuilder.capacity());
	
	firstString = "wish it rain this week";
	stringbuilder.append(firstString);
	System.out.println("buffer = "+stringbuilder);
	System.out.println("length = "+stringbuilder.length());
	System.out.println("capacity = "+stringbuilder.capacity());
	//reduce capacity to length
	stringbuilder.trimToSize();
	System.out.println("length = "+stringbuilder.length());
	System.out.println("capacity = "+stringbuilder.capacity());
	//replace
	stringbuilder.replace(3,8,"-this is a test--");
	System.out.println("replace = "+stringbuilder);
	System.out.println("length = "+stringbuilder.length());
	System.out.println("capacity = "+stringbuilder.capacity());
	//insert
	stringbuilder.insert(10,"-this is August--");
	System.out.println("insert = "+stringbuilder);
	System.out.println("length = "+stringbuilder.length());
	System.out.println("capacity = "+stringbuilder.capacity());
	//delete
	stringbuilder.delete(5,20);
	System.out.println("delete = "+stringbuilder);
	System.out.println("length = "+stringbuilder.length());
	System.out.println("capacity = "+stringbuilder.capacity());
	
System.out.println("Before reverse: "+stringbuilder);
stringbuilder.reverse();
System.out.println("After reverse: "+stringbuilder);
	
	}
	
}
