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
		int expected = 27;
		int result = pr.PlateReg(77);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	void plate_identify_zero() {
		PlateReg pr = new PlateReg();
		int expected = 0;
		int result = pr.PlateReg(0);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	void plate_identify_negative() {
		PlateReg pr = new PlateReg();
		int expected = 0;
		int result = pr.PlateReg(-40);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	void plate_identify_over_max_value() {
		PlateReg pr = new PlateReg();
		int expected = 0;
		int result = pr.PlateReg(100);
		
		assertEquals(expected, result);
		
	}
	
	
	

}
