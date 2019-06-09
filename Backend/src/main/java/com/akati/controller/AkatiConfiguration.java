package com.akati.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.akati.service.AnaliseService;

@Configuration
public class AkatiConfiguration {

	@Bean
	public AnaliseService getAnaliseService(){
		return new AnaliseService();
	}
	
	@Bean
	public ProcessaAnalise getProcessaAnalise(){
		return new ProcessaAnalise();
	}
}
