
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to covert an integer to string
		/*int num=123;
		String str=String.valueOf(num);
		System.out.println(num);*/

		//program to find given string present in sentence using indexOfmethod
		 /*String str = "Learn Java Programming";
	        String search = "Java";

	        if (str.indexOf(search) != -1) {
	            System.out.println("'" + search + "' is present in the string.");
	        } else {
	            System.out.println("'" + search + "' is NOT present in the string.");
	        }*/
		
		
		//program to count the no of occurences at given index of given string
		        /*String str = "This is a test. This is only a test.";
		        String word = "test";
		        int index = str.indexOf(word);
		        while (index != -1) {
		            System.out.println("Found '" + word + "' at index: " + index);
		            index = str.indexOf(word, index + 1);
		        }*/
		
		
		
		//program to count the no of occurence of string in a sentence
		       /* String str = "hello world, hello everyone. hello!";
		        String word = "hello";
		        int count = 0;
		        int index = str.indexOf(word);

		        while (index != -1) {  // Loop until no more occurrences
		            count++; // Increase count
		            index = str.indexOf(word, index + word.length());//// Search next occurrence(or)
		            //index = str.indexOf(word, index + 1);
		            	
		        }

		        System.out.println("The word '" + word + "' appears " + count + " times.");*/
		
		
		
		//program to replace specific word in a given string
		
		   String str = "The cat sat on the mat.";
	        String oldWord = "cat";
	        String newWord = "dog";

	        int index = str.indexOf(oldWord);
	        if (index != -1) {
	            String result = str.substring(0, index) + newWord + str.substring(index + oldWord.length());
	            System.out.println("Updated string: " + result);
	        } else {
	            System.out.println("Word not found!");
	        }
	}

}
