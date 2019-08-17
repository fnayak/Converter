package com.polaris;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.polaris.service.ConverterService;

@SpringBootTest
public class ConverterApplicationTests {

	@InjectMocks
	ConverterService converterService;
		
	
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	
	@Test
	public void testConvertNumberToWords() {
		int inputnumber = 999999999;
		String resultInWords = "Ninety Nine Crore Ninety Nine Lakh Ninety Nine Thousand Nine Hundred and Ninety Nine";
		assertEquals(resultInWords,converterService.convertNumberToWords(inputnumber).trim());
	}

}
