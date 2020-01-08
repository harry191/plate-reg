package com.qa.plate.core;

public class PlateReg {

	public int PlateReg (int input) {
		if (input >=100) {
			return 0;
		}
		if (input <= 0) {
			return 0;
		}
		if (input>50) {
			return (input-50);
		}else {
			return input+50;
		}
		
	}
	
	
	
	
	
}
