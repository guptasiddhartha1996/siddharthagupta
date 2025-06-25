package com.OBBE.Testcases;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		
		System.out.println(generateRandomSSN());
	}
	
		
		
		public static String generateRandomSSN() {
		    int m = (int) Math.pow(10, 7);
		    int x= m + new Random().nextInt(9 * m);
		    return "1"+x;
		   
		}

	

}
