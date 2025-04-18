import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.math3.util.MathUtils;

public class FindStringDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="wel,tree,wel,trr,tree";
		String[] words=str.split(",");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for (String word:words)
		{
			if(!word.isEmpty())
			{
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		}
		
		System.out.println(map);*/
		
		
		//program to remove duplicates from array list
		
		/*ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
	    System.out.println("ArrayList with duplicate elements: " + numbers);

	    // convert the arraylist into a set
	    Set<Integer> set = new LinkedHashSet<>();
	    set.addAll(numbers);

	    // delete al elements of arraylist
	    numbers.clear();

	    // add element from set to arraylist
	    numbers.addAll(set);
	    System.out.println("ArrayList without duplicate elements: " + numbers);*/
		
		//program to remove duplicates from Arraylist another way
		
		/*ArrayList<Integer> arraylist=new ArrayList<>();
		arraylist.add(10);
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(20);
		arraylist.add(30);
		Set<Integer> set=new LinkedHashSet<>(arraylist);
		
		ArrayList<Integer> uniquelist=new ArrayList<>(set);
		System.out.println(uniquelist);*/
		
		
		
		//program to replace the case sensitive letters
		/* String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
		    String regex = "(?i)cats";
		    System.out.println(myStr.replaceAll(regex, "dog"));*/
		    
		    //program to find the missing numbers
		    /*int[] arr = {1, 2, 3,5}; // 3 is missing
	        int n = 5; // Expected total numbers from 1 to 5

	        int totalSum = n * (n + 1) / 2; // Formula: sum of 1 to n
	        int arraySum = 0;

	        for (int num : arr) {
	            arraySum += num;
	        }

	        int missing = totalSum - arraySum;
	        System.out.println("Missing number is: " + missing);*/
		
		//Remove duplicate charachters from string
		/*String input = "students";
        String output = "";
        
        Set<Character> set=new HashSet<>();
        
        for(int i=0;i<input.length();i++)
        {
        	
        	char ch=input.charAt(i);
        	if(!set.contains(ch))
        	{
        		set.add(ch);
        		output=output+input.charAt(i);
        	}
        }

        		System.out.println(output);*/
		//Remove duplicate string from a sentence

		/*String str="this is a test is a sentence";
		String output="";
		HashSet<String> set=new HashSet<>();
		String[] str1=str.split("\\s");
		System.out.println(str1);

		for(String word:str1)
		{
			if(!set.contains(word))
			{
				set.add(word);
				output=output+word+" ";
				
			}
				
		}
		System.out.println(output);*/
		
		/*String str="java python java python c";
		String[] str1=str.split("\\s");
		
		Set<String> s=new LinkedHashSet<>();
		for(String word:str1) {
			s.add(word);
		}
		
		System.out.println(s);*/
		
		
		//program to remove duplicate characters from string
		/*String input="studentsrap";
		Set<Character> set=new LinkedHashSet<>();
		for(char ch:input.toCharArray())
		{
			set.add(ch);
		}
		System.out.println(set);*/
		
		
		   /*HashMap<String, Integer> people = new HashMap<String, Integer>();

		    // Add keys and values (Name, Age)
		    people.put("John", 32);
		    people.put("Steve", 30);
		    people.put("Angie", 33);

		    for (String i : people.keySet()) {
		      System.out.println("Name: " + i + " Age: " + people.get(i));
		    }*/
		
		//program to reverse string by preserving white spaces
		/*String input = "may june may";
        String[] words = input.split("\\s+");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            output.append(reversedWord).append(" ");
        }

        System.out.println(output.toString().trim());*/
		
		//program to print alphabets
		//for(char c='a';c<='z';c++)
		/*for(char c='z';c>='a';c--)
		{
			System.out.print(c+" ");
		}*/

		//program to count the length of the string without using length method
		/*int length=0;
		
        String s = "prepinsta";
        for (char c1 : s.toCharArray()) 
	length++;
System.out.println("Length of String is : "+length);*/
		
		//program to print the characters in uppercase and lowercase alternatively
		/*String input = "nashrin";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                output.append(Character.toUpperCase(c));
            } else {
                output.append(Character.toLowerCase(c));
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + output.toString());*/
		
		//program to print the string starting with h
       /* String input = "honey hey what hello";
        String[] words = input.split(" ");

        System.out.print("Output: ");
        for (String word : words) {
            if (word.startsWith("h")) {
                System.out.print(word + " ");
            }
        }*/
		
		//program to print the character occurences
		 /* String input = "annbooceew";
	        StringBuilder output = new StringBuilder(); // Used to build the final output string efficiently
	        HashMap<Character, Integer> freqMap = new HashMap<>(); // Stores how many times each character has appeared

	        // Loop through each character in the input string
	        for (char c : input.toCharArray()) {
	            // Update the count of the current character in the map
	            // If character not in map, default to 0, then add 1
	            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

	            // Append the character and its current count to the output
	            // For example, if c = 'l' and it has appeared 2 times so far, this adds "l2"
	            output.append(c).append(freqMap.get(c));
	        }

	        // Print the result
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output.toString());*/
		
		//program to print the array element occurences
       /* int[] input = {1, 1, 2, 2, 3, 5, 4};

        // Create a HashMap to store frequencies
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Loop through array and count frequencies
        for (int num : input) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequencies
        for (int key : freqMap.keySet()) {
            System.out.println(key + " appears " + freqMap.get(key) + " times");
        }*/
		
		//program to find common characters from two strings
		/* String str1 = "hello";
	        String str2 = "world";

	        System.out.print("Common characters: ");
	        for (int i = 0; i < str1.length(); i++) {
	            char c = str1.charAt(i);

	            // Check if character c is in str2
	            for (int j = 0; j < str2.length(); j++) {
	                if (c == str2.charAt(j)) {
	                    System.out.print(c + " ");
	                    break; // Avoid repeating the same character
	                }
	            }
	        }*/
		
		//Program to Merge, Sort & Remove Duplicates
		/* String str1 = "hello";
	        String str2 = "world";

	        // Step 1: Merge the strings
	        String merged = str1 + str2;

	        // Step 2: Convert to char array
	        char[] chars = merged.toCharArray();

	        // Step 3: Sort the char array
	        Arrays.sort(chars);

	        // Step 4: Remove duplicates
	        String result = "";
	        for (int i = 0; i < chars.length; i++) {
	            if (result.indexOf(chars[i]) == -1) {
	                result += chars[i];
	            }
	        }

	        // Output
	        System.out.println("Merged, Sorted, Unique Characters: " + result);*/
		    
		//program to find the no of substring count in a given string    
		/*String str = "ababababab";
		String sub = "ab";
		int count = 0;

		for (int i = 0; i <= str.length()-sub.length(); i++) {
		    if (str.substring(i, i + sub.length()).equals(sub)) {
		        count++;
		    }
		}

		System.out.println("Count: " + count);*/
		
		//program to reverse the particular portion of string using stringbuilder and substring
		/*String str = "helloworld";
        int start = 2;
        int end = 6;

        String part1 = str.substring(0, start);
        String part2 = new StringBuilder(str.substring(start, end)).reverse().toString();
        String part3 = str.substring(end);

        String result = part1 + part2 + part3;

        System.out.println("Modified String: " + result);*/
		
		//program to print last two charachters
		/*input=cat mat hat tat
		output=atatatat
		 String input = "cat mat hat tat";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() >= 2) {
                result.append(word.substring(word.length() - 2));
            }
        }

        System.out.println("Output: " + result.toString());*/
		
		//program to print first letter of each sentence from a string
		/* String input = "he was very brave";
	        String[] words = input.split(" ");
	        StringBuilder output = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                output.append(word.charAt(0));
	            }
	        }

	        System.out.println("Output: " + output.toString());*/
		
		//program to print last letter of each sentence from a string
		 /* String input = "he was very brave";
	        String[] words = input.split(" ");
	        StringBuilder output = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                output.append(word.charAt(word.length() - 1));
	            }
	        }

	        System.out.println("Output: " + output.toString());*/
		
		//Another method program to print last letter of each sentence from a string
		/*String x="the flight came";
		String[] xy=x.split(" ");
		for(String c:xy)
		{
			System.out.print(c.charAt(c.length()-1));
		}*/
		
        /*String input = "banana";

		Map<Character, Integer> map = new TreeMap<>();

        for (char c : input.toCharArray()) {
        	if(map.containsKey(c))
        	{
        		map.put(c, map.getOrDefault(c,0)+1);
        	}
        	else {
                map.put(c, 1); 

        	}
        }

        // Step 3: Build the result using the sorted keys
        StringBuilder result = new StringBuilder();
        for (char c : map.keySet()) {
            result.append(c);
        }

        // Step 4: Print the result
        System.out.println("Sorted without duplicates: " + result.toString());*/
        

		
		
		
	}

}
