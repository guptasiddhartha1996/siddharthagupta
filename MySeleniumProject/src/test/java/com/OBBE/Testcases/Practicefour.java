package com.OBBE.Testcases;

import java.util.HashSet;

public class Practicefour {
	
	public static StringBuilder removeduplicates(String s) {
		
		HashSet<Character> charset=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(!charset.contains(s.charAt(i))){
				charset.add(s.charAt(i));
				sb.append(s.charAt(i));
			}
		}
		return sb;
	}
	
	public static void main(String[] args) {
		String s="Siddhartha"; //Output - Sidhart
		System.out.println(removeduplicates(s));
	}
}
