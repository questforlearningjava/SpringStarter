package com.springJavaConfig.boxSystem;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={BoxConfig.class})
public class BoxTester {
	
	public final ByteArrayOutputStream consolee = new ByteArrayOutputStream();
	
	@Before
	public void executeBeforeTest(){
		System.setOut(new PrintStream(consolee));
	}
	
	@Autowired
	private Item item;
	
	@Autowired
	private Box box;
	
	@Test
	public void itemNotNull(){
		assertNotNull(item);
	}
	
	@Test
	public void boxNotNull(){
		assertNotNull(box);
	}
	
	@Test
	public void testBox(){
		box.showBox();
		assertEquals("You got a Pen", consolee.toString());
	}
}
