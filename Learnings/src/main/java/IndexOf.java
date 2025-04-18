
public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String myStr = "Hello planet earth, you are a great planet.";
		System.out.println(myStr.indexOf("planet"));*/


		
		
		/*char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
		String myStr2 = "";
		myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
		System.out.println("Returned String: " + myStr2);*/
		
		
		/*String myStr = "Split a s123TRing by sp$aces, and also punctuation.";
	    String[] str = myStr.split("[,\\^0-9\\^A-Z\\.\\$\\s]");
		
	   
	    for (String s : str) {
		    System.out.print(s);	}*/
	    
	    //program to return last character from each sentence
	    
	   /* String str="Bangalore trip to wonderla";//op: wonderla to trip Bangalore
        String[] space=str.split(" ");
       // 
     System.out.println(space[0].substring(space[0].length()-1)+space[1].substring(space[1].length()-1)+space[2].substring(space[2].length()-1)+space[3].substring(space[3].length()-1));*/

		//program to reverse a sentence 
		//i/p: welcome to mindtree
		//o/p:mindtree to welcome
		
		String str="welcome to mindtree interview";
		String[] s=str.split(" ");
		System.out.println(s[2]+" "+s[1]+" "+s[0]);
		
		
		
	}

}
