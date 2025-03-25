import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {

		
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,3,3,4));
		System.out.println("Numbers with duplicates :" +list);
		
		
		//add numbers from arraylist to set
		Set<Integer> set=new HashSet<>();
		
		set.addAll(list);
		
		//remove all elements from array list 
		list.clear();
		

		list.addAll(set);
		
		System.out.println("Non Duplicates  :" +list);

		
	}

}
