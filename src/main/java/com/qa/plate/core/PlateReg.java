package com.qa.plate.core;

public class PlateReg {

	public String PlateReg (String inputString) {
		try {
			int input = Integer.parseInt(inputString);
			
			if (input >=100) {
				return "0";
			}
			if (input <= 0) {
				return "0";
			}
			if (input>50) {
				if ((input-50)<10) {
					return ("0"+(input-50));
				}else {
					return (""+(input-50));
				}
				
			}else {
				return (""+(input+50));
			}
		}catch(NumberFormatException e) {
			return ("String entered, only integers allowed");
		}
		
		
	}
	
	
	
	
	
}
