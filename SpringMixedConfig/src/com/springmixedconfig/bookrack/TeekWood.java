package com.springmixedconfig.bookrack;

public class TeekWood implements BookRack {

	private Book book;
	
	public TeekWood(Book book){
		this.book = book;
	}
	
	public void showRack() {
		book.showBookName();
	}

}
