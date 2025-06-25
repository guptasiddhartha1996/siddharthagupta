package com.OBBE.Testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class JavaPractice {

	public static void main(String[] args) {
		
		String str="This is a statment";
		String[] words=str.split(" ");
		StringBuilder reversedstring=new StringBuilder();
		for(String word:words) {
			StringBuilder reversedword=new StringBuilder(word);
			reversedstring.append(reversedword.reverse().toString()).append(" ");
		}
		System.out.println(reversedstring);
		

}
	
}
