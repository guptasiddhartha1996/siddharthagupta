package TestCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaPractice {

	public static void main(String[] args) {
		
		String str="Allu Arjun";
		
		char charray[]=str.toCharArray();
		List<Character> lst=new ArrayList<>();
		
		for(Character c:charray) {
			int counter=0;
			if(!lst.contains(c)) {
				for(Character ch:charray) {
					if(c == ch) {
						counter++;
					}
				}
			}
			
			
		}
		
		

	}

}
