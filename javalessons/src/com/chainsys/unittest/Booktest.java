package com.chainsys.unittest;
import com.chainsys.classandmethods.Book;
/**
 * 
 * @author abin3133
 *
 */


public class Booktest {
	public static void testBookid()
	{
		Book firstBook=new Book(12345);
		firstBook.setName("Thirukural");
		System.out.println(firstBook.getName());
	}
	public static void testauthor()
	{
		Book firstBook=new Book(12345);
		firstBook.setAuthor("Thiruvalluvar");
		System.out.println(firstBook.getAuthor());
	}
	
	public static void testrate()
	{
		Book firstBook=new Book(12345);
		firstBook.setRate(150);
		System.out.println(firstBook.getRate());
		
	}
	public static void testpublicationyear()
	{
		Book firstBook=new Book(12345);
		firstBook.setPublicationyear(2000);
		System.out.println(firstBook.getPublicationyear());
		
	}
}

