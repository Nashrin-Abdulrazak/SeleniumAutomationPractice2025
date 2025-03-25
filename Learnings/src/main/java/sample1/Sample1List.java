package sample1;

import java.util.ArrayList;
import java.util.List;

public class Sample1List {

	public static void main(String[] args)
	{
		
	
	List<String> li=new ArrayList<String>();
	li.add("Imran");
	li.add("Zubair");
	li.add("Nashrin");
	li.add("Begam");
	li.add("Umar");
System.out.println(li.size());
li.add("sherif");
li.remove("sherif");
//checking the list whether umar is present
boolean val = li.contains("Umar");
System.out.println(val);
//getting list based on index value
String index = li.get(3);
System.out.println(index);
//printing using for loop
for(String obj:li) {
	System.out.println(obj);
	
	}
ArrayList<Integer> numbers=new ArrayList<Integer>();
numbers.add(100);
numbers.add(200);
numbers.add(300);
numbers.add(400);
numbers.add(500);
System.out.println(numbers.get(2));
numbers.remove(2);
System.out.println(numbers.contains(300));
//System.out.println(numbers.contains(100));
//numbers.remove(100);


	}
}
