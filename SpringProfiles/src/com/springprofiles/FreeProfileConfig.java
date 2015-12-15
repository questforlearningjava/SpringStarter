package com.springprofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FreeProfileConfig {
	
	@Bean(name="profile")
	public Profiler getProfile(){
		return new Profiler("Free");
	}
}
