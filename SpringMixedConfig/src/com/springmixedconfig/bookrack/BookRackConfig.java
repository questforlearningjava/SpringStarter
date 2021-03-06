package com.springmixedconfig.bookrack;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan
@ImportResource("classpath:beanConfig.xml")
public class BookRackConfig {
	
}
