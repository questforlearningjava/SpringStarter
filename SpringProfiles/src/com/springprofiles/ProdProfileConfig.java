package com.springprofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Prod")
public class ProdProfileConfig {
	
	@Bean
	public Profiler getProfile(){
		return new Profiler("Prod");
	}
}
