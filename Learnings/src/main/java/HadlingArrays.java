import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HadlingArrays {

	public static void main(String[] args) {
		//Handling Arrays by storing multiple person names into variable called names 
String[] names= {"ram","sam","kevin","John"};
//the above method is traditional method of handling array,now we are converting it from Array into ArrayList
List<String> asList = Arrays.asList(names);
System.out.println(asList.contains("ram"));
for (String newlist : asList) {
	System.out.println(newlist);
}
//creating the ArrayList
ArrayList<String> alist=new ArrayList<String>();
//Adding additional names into Arraylist and checking whether the names has got added
alist.add("mikky");
alist.add("jack");
for (String snames : alist) {
	System.out.println(snames);
}



	}

}
