import java.util.LinkedHashSet;

public class StringDup {

	public static void main(String[] args) {

		
		String str="not@@@!!!dot";
		
		String str1=str.replaceAll("@", "t");
		System.out.println(str1);
		
		
		/*char[] ch=str.toCharArray();
		
		LinkedHashSet<Character> hset=new LinkedHashSet<>();
		
		for(char c:ch)
		{
			hset.add(c);
		}
		
		StringBuilder s=new StringBuilder();
		
		for (Character c1:hset)
		{
			s.append(c1);
		}
		
		System.out.println("Removed Duplicates:" +s.toString());*/
	}

}
