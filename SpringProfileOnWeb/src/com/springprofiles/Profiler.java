package com.springprofiles;

public class Profiler {
	private String profileName;
	
	public Profiler(String pName){
		this.profileName = pName;
	}
	
	public void printProfileName(){
		System.out.print(profileName);
	}
}
