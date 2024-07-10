package com.BOOK;

public class BOOK12 {
	
	private int bookid;
	private String username;
	private int seates;
	private String date;
	private int busid;
	private  float totalPrice;
	
	public BOOK12(int bookid, String username, int seates, String date, int busid, float totalPrice) {
		super();
		this.bookid = bookid;
		this.username = username;
		this.seates = seates;
		this.date = date;
		this.busid = busid;
		this.totalPrice = totalPrice;
	}
	
	
	
	public int getBookid() {
		return bookid;
	}


	public String getUsername() {
		return username;
	}


	public int getSeates() {
		return seates;
	}



	public String getDate() {
		return date;
	}


	public int getBusid() {
		return busid;
	}

	public float getTotalPrice() {
		return totalPrice;
	}






	

}
