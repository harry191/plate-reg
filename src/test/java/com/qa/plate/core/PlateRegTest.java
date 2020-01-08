package com.qa.plate.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlateRegTest {

	@Test
	void plate_march_to_september_identify() {
		PlateReg pr = new PlateReg();
		int expected = 74;
		int result = pr.PlateReg(24);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	void plate_september_to_march_identify() {
		PlateReg pr = new PlateReg();
		int expected = 28;
		int result = pr.PlateReg(77);
		
		assertEquals(expected, result);
		
	}

}
