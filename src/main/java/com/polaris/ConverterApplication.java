package com.polaris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.polaris.service.ConverterService;

@SpringBootApplication
public class ConverterApplication implements CommandLineRunner {

	public static int num;
	
	@Autowired
	ConverterService converterService;
	
	public static void main(String[] args) {
		SpringApplication.run(ConverterApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		try {
			num = converterService.inputNumber(num);
			System.out.println("input in Words : " + converterService.convertNumberToWords(num));
		} catch (Exception e){
			System.out.println(e.getStackTrace());
		}
		
	}

}
