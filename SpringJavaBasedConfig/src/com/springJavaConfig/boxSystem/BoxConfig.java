package com.springJavaConfig.boxSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoxConfig {
	
	@Bean
	public Item getItem(){
		return new Pen();
	}
	
	@Bean
	public Box getBox(Item item){
		return new BlackBox(item);
	}
}
