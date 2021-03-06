package com.springmixedconfig.bookrack;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BookRackConfig.class)
public class BookRackTest {
	
	public ByteArrayOutputStream logStream = new ByteArrayOutputStream();
	
	@Autowired
	private Book book;
	@Autowired
	private BookRack bookRack;
	
	@Before
	public void changeDefaultStream(){
		System.setOut(new PrintStream(logStream));
	}
	
	@Test
	public void testNotNullBook(){
		assertNotNull(book);
	}
	
	@Test
	public void testNotNullRack(){
		assertNotNull(bookRack);
	}
	
	@Test
	public void testOutput(){
		bookRack.showRack();
		assertEquals("History of Time", logStream.toString());
	}
}
