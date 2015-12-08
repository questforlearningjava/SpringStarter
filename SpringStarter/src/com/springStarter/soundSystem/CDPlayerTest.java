package com.springStarter.soundSystem;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	
	
	
	
	public final ByteArrayOutputStream logStream = new ByteArrayOutputStream();
	
	@Before
	public void runMe(){
		System.setOut(new PrintStream(logStream));
	}
			
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private MediaPlayer player;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
	}
	
	@Test
	public void playerShouldNotBeNull(){
		assertNotNull(player);
	}
	
	@Test
	public void testPlayMusic(){
		player.playCD();
		assertEquals("Playing :", logStream.toString());
	}
	
}
