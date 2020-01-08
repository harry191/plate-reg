package com.qa.plate.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlateRegTest {

	@Test
	void plate_05_identify() {
		PlateReg pr = new PlateReg();
		int expected = 55;
		int result = pr.PlateReg(05);
		
		assertEquals(expected, result);
		
	}

}
