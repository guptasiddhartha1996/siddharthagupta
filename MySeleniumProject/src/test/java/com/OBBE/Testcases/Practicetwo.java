package com.OBBE.Testcases;

import java.util.Arrays;


public class Practicetwo {
	
	public static int[] moveEvenToFront(int[] arr){
	    int temp=0;
	    int a=0;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==0){

	            for (int j=i;j>a;j--){
	                temp=arr[j-1];
	                arr[j-1]=arr[j];
	                arr[j]=temp;
	            }
	            a++;
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	    return arr;
	}

	public static void main(String[] args) {
		
		int[] arr= {1,0,0,1,0,1,0,1};
		
		moveEvenToFront(arr);
	}

}
