package com.springStarter.soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	@Autowired
	private CompactDisc cd;
	
	public void playCD() {
		cd.playMusic();
	}
	
}
