package com.OBBE.Testcases;

public class PracticeSeven {
	
	public static String capitalizeWords(String input) {
        // split the input string into an array of words
        String[] words = input.split("\\s");

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // iterate through each word
        for (String word : words) {
            // capitalize the first letter, append the rest of the word, and add a space
            result.append(Character.toTitleCase(word.charAt(0)))
                  .append(word.substring(1))
                  .append(" ");
        }

        // convert StringBuilder to String and trim leading/trailing spaces
        return result.toString().trim();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input string
        String input = "welcome to geeksforgeeks";

        // call the capitalizeWords function and store the result
        String result = capitalizeWords(input);

        // print the original and modified strings
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
		

	}

}
