package prob02;

import java.util.Arrays;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private boolean stateRent; // true:대여중, false:재고있음
	
	
	public void rent() {
		stateRent = true;
		System.out.println(title + "이(가) 대여됐습니다");
	}
	
	public void print() {
		if(stateRent == true) {
			System.out.println("책 제목 : " + title + ", 작가 : " + author + " 대여유무 : " + "대여중");
		} else {
			System.out.println("책 제목 : " + title + ", 작가 : " + author + " 대여유무 : " + "재고있음");
		}
		
	}
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}

	
	
	
	
	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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

	public boolean isStateRent() {
		return stateRent;
	}

	public void setStateRent(boolean stateRent) {
		this.stateRent = stateRent;
	}
	
	
	

}
