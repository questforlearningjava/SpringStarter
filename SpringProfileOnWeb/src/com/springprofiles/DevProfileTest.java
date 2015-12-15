package com.springprofiles;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DevProfileConfig.class, ProdProfileConfig.class})
@ActiveProfiles("Dev")
public class DevProfileTest {
	
	ByteArrayOutputStream  byteStream = new ByteArrayOutputStream();
	
	@Autowired
	private Profiler p;
	
	@Before
	public void configureOut(){
		System.setOut(new PrintStream(byteStream));
	}
	
	@Test
	public void isProfilerNotNull(){
		assertNotNull(p);
	}
	
	@Test
	public void isProfileMatch(){
		p.printProfileName();
		assertEquals("Dev", byteStream.toString());
	}
}
