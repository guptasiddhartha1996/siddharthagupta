package com.OBBE.Testcases;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Practicethree {
	
	public static int removeduplicates(int [] arr) {
		
		int indx=0;
		HashSet<Integer> s=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!s.contains(arr[i])) {
				s.add(arr[i]);
				arr[indx++]=arr[i];
			}
		}	
		
		return indx;
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,3,4,5,4,6,6};  //output 1,2,3,4,5,6
		int newsize=removeduplicates(arr);
		for(int j=0;j<newsize;j++) {
			System.out.println(arr[j]);
		}
	}
	
}
