
public class LastLetterOfEachSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String input = "can van ma n"; // input sentence
        char lastLetter;
        int length = input.length();
        
        // Traverse through the input string
        for (int i = 0; i < length; i++) {
            // Skip spaces and find the end of a word
            if (input.charAt(i) != ' ' && (i == length - 1 || input.charAt(i + 1) == ' ')) {
                lastLetter = input.charAt(i); // Get the last letter of the word
                System.out.print(lastLetter); // Print the last letter
            }
        }*/
		
		
		String str="can may dol";
		char result;

		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i) != ' ' && (i == 0 || str.charAt(i - 1) == ' ')) 
		{
		result=str.charAt(i);
		System.out.print(result);
		}
		}
		

	}

}
