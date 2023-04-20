package javabasicprogram;

import java.lang.Math;

public class RandomNumberMath {

	public static void main(String[] args) {
		
		// random() of Math class generate random number between 0.0 to 1.0
		
		System.out.println(Math.random());
		
		// will give random number between 200 to 400
		int max = 400;
		int min = 200;
	
		double randomNumber = Math.random() * (max - min +1) + min;
		int randomNumberInt = (int)randomNumber; // convert double into int
		System.out.println(randomNumberInt);
	}

}
