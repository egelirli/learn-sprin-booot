package com.egelirli.learnspringboot.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egelirli.learnspringboot.CurrencyServiceConfig;

@RestController
public class CurrencyServiceConfigController {
		
	    @Autowired	
		CurrencyServiceConfig  config; 
	
		@GetMapping("/currencyconfig")
		public CurrencyServiceConfig getAllConfigs(){
			return  config;
			
		}


}


