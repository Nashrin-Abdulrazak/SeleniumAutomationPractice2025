
public class StringRev {

	public static void main(String[] args) {
/*String input="Nashrin";
//String output="";
for (int i=input.length()-1;i>=0;i--)
{

	//output=output+input.charAt(i);
	System.out.print(input.charAt(i));



	}*/
//program to reverse the sentence

String sentence = "Java is awesome";
String[] words = sentence.split(" ");
String reversedSentence = "";

for (int i = words.length - 1; i >= 0; i--) {
    reversedSentence += words[i] + " ";
}

System.out.println("Reversed Sentence: " + reversedSentence);
}
}
