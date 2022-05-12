package com.chainsys.classandmethods;
/**
 * 
 * @author abin3133
 *
 */

public class Book {
	private int rate;
	private String name;
	private String author;
	private int publicationyear;
	private final int bookid;
	public Book(int id)
	{
		this.bookid=id;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublicationyear() {
		return publicationyear;
	}
	public void setPublicationyear(int publicationyear) {
		this.publicationyear = publicationyear;
	}
	public int getBookid() {
		return bookid;
	}
	
	
}
	
	
	