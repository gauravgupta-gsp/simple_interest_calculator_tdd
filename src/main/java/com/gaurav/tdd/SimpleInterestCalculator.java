package com.gaurav.tdd;

public class SimpleInterestCalculator {
	
	private SimpleInterestCalculator() {
		
	}

	private static double calculateSimpleInterest(int principalAmount , double rateOfInterest, double tenureInYears) {
		return principalAmount * rateOfInterest *tenureInYears / 100;
	}
	
	private static double convertDaysToYears(int tenureInDays) {
		return tenureInDays / 365.0;
	} 
	public static double calculate(int principalAmount, int tenureInDays) {
		double rateOfInterest = 5.3;
		double tenureInyears = convertDaysToYears(tenureInDays);
		
		if(tenureInDays < 365) {
			rateOfInterest = 5.2;
		}
		return calculateSimpleInterest(principalAmount, rateOfInterest, tenureInyears);		
	}
	
	public static double calculate(int principalAmount, int tenureInDays,int age) {
		double rateOfInterest = 5.3;
		double tenureInyears = convertDaysToYears(tenureInDays);
		
		if(tenureInDays < 365) {
			rateOfInterest = 5.2;
		}
		if(seniorCitizen(age)) {
			rateOfInterest += 0.1;
		}
		if(principalAmount >500000 && tenureInDays <730) {
			throw new RuntimeException("");
		}
		 
		return calculateSimpleInterest(principalAmount, rateOfInterest, tenureInyears);
		
	}

	private static boolean seniorCitizen(int age) {
		
		return age >60;
	}

}
