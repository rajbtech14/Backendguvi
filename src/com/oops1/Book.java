package com.oops1;

public class Book {
	//data members
	private int bookid;
	private String title;
	private String author;
	
	public Book(int bookid,String title, String author) {
	this.bookid = bookid;
	this.title = title;
	this.author = author;
	System.out.println("Book information");	
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


}
