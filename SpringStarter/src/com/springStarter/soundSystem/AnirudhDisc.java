package com.springStarter.soundSystem;

import org.springframework.stereotype.Component;

@Component
public class AnirudhDisc implements CompactDisc{

	private String song = "Shoot the kuruvi....";
	
	public void playMusic() {
		System.out.print("Playing :");
	}
	
}
