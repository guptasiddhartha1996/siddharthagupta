package com.OBBE.Testcases;

public class PracticeSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "selenium cypress playwright webdriverio";  //Output - selenium sserpyc playwright oirevirdbew
        String[] wordsArr = s.split(" "); // broke string into array delimited by " " whitespace
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< wordsArr.length; i++){ // loop over array length
            if(i%2 == 0) // if 1st word, 3rd word, 5th word..and so on words 
                sb.append(wordsArr[i]); // add  the word as it is
            else {
            	sb.append(new StringBuilder(wordsArr[i]).reverse()); // else use StringBuilder revrese() to reverse it
            }
            sb.append(" ");// add a whitespace in between words
        }
        System.out.println(sb.toString().trim()); 

	}

}
