import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {

	public static void main(String[] args) {

		
		String str="programming";

	Set<Character> s=new HashSet<>();
	StringBuilder sb=new StringBuilder();


		for(char c:str.toCharArray())
		{
		if(s.add(c))
		{
			sb.append(c);

		    }
		}
	System.out.println(sb.toString());
	}

}
