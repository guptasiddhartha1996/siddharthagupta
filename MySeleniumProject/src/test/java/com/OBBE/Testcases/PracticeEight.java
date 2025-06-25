package com.OBBE.Testcases;

import java.util.Arrays;

public class PracticeEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="abcde"; //output should be aabbccdd
		String str=input; 
		String str2=str.concat(input);
		char[] ch=str2.toCharArray();
		char temp=' ';
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[j];
					ch[j]=ch[i];
					ch[i]=temp;
				}
			}
		}
		System.out.println(ch);
		
		
		
		
		

	}

}
