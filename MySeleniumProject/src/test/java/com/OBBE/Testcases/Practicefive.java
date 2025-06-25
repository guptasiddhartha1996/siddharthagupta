package com.OBBE.Testcases;

import java.util.HashMap;
import java.util.Map;

public class Practicefive {

	public static void main(String[] args) {
		
		String str="Naveen Automation Labs"; //Output {a=3, A=1, b=1, e=2, i=1, L=1, m=1, N=1, n=2, o=2, s=1, t=2, u=1, v=1}
		char[] ch=str.toCharArray();
		HashMap<Character,Integer> charmap=new HashMap<Character,Integer>();
		for(char c:ch) {
			if(!String.valueOf(c).isBlank()) {
				if(charmap.containsKey(c)) {
					charmap.put(c, charmap.get(c)+1);
				}else {
					charmap.put(c, 1);
				}
			}
		}System.out.println(charmap);
	}
}
