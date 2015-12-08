package com.springmixedconfig.bookrack;

import org.springframework.stereotype.Component;

@Component("myBook")
public class HistoryOfTime implements Book {

	public void showBookName() {
		System.out.print("History of Time");
	}
	
}
