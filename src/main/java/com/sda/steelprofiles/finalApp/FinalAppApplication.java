package com.sda.steelprofiles.finalApp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalAppApplication.class, args);
	}

	@Bean
	public ModelMapper createModelMapper (){
		return new ModelMapper();
	}

}
