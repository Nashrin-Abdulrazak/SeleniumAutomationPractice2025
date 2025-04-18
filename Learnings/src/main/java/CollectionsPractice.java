import java.util.ArrayList;
import java.util.Collections;

public class CollectionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrylist=new ArrayList<>();
		arrylist.add(30);
		arrylist.add(10);
		arrylist.add(20);
		arrylist.add(40);
		arrylist.add(5);
		arrylist.add(6);
		Collections.sort(arrylist,Collections.reverseOrder());
		System.out.println(arrylist);
		
		for(int i:arrylist)
		{
			System.out.println(i);
		}
		
	}

}
