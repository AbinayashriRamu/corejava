package com.chainsys.miniproject.pojo;

public class Library {
	private String Lib_Name;
	private String book_name;
	private String Author_name;
	private int Book_Id;
	private String City;
	public String getLib_Name() {
		return Lib_Name;
	}
	public String getAuthor_name() {
		return Author_name;
	}
	public void setAuthor_name(String author_name) {
		Author_name = author_name;
	}
	public int getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(int book_Id) {
		Book_Id = book_Id;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public void setLib_Name(String lib_Name) {
		Lib_Name = lib_Name;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

}
