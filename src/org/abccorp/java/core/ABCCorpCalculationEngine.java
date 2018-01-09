package org.abccorp.java.core;

import org.abccorp.java.facade.CalculationFacade;

public class ABCCorpCalculationEngine implements CalculationFacade {

	public static void main(String[] args) {
		System.out.println("Main Core Operations Happen Here!");

	}

	@Override
	public double calculateAVG() {
		double soxAVG=0;
		
		return soxAVG;
	}

	@Override
	public double calculateSUM() {
		double wtySum=0;
		
		return wtySum;
	}

	@Override
	public double calculatePercentage() {
		double samplePercent=0;
		
		return samplePercent;
		
	}

	@Override
	public String findVendor() {
		String sampleVendor="";
		
		return sampleVendor;
		
	}

	@Override
	public String getRating() {
		String sampleRating="";
		
		return sampleRating;
		
	}

}
