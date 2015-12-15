package com.springprofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Dev")
public class DevProfileConfig {
	
	@Bean(name="profile")
	public Profiler getProfile(){
		return new Profiler("Dev");
	}
}
