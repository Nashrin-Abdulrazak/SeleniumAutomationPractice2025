import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandlingStringMethods {

	public static void main(String[] args) {

		String name="Hello World Java Program";
		for(int i=0;i<name.length();i++)
		{
		System.out.print(name.charAt(i));
		}
		System.out.println("");
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println("");
		if(name.equalsIgnoreCase("HelloWorldJavaProgram"))
		{
			System.out.println("same");
		
		}
		else
		{
			System.out.println("not same");
		}
		String concat = name.concat("Welcome to Practice");
		System.out.println(concat);
		/*boolean empty = name.isEmpty();
		System.out.println(empty);*/
		boolean blank = name.isBlank();
		System.out.println(blank);
		System.out.println(name.length());
		//String strip = name.strip();
		//System.out.println(strip);
		//String string = name.toString();
		//System.out.println(string);
		
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = concat.toLowerCase();
		System.out.println(lowerCase);
		String name1="Hello World Java Program";
		//split will divide the input based on condition given in split method
		String[] split = name1.split("World");//here World is split from the input Hello World Java Program,so hello will go to zeroth index and java program will goes to first index
		System.out.println(split[0]);
		System.out.println(split[1]);
		
		//using trim function to trim the extra spaces between left and right side of the string
		System.out.println(split[1].trim());
		
		String a="Nashrin Begam";
		String[] split2 = a.split("Nashrin");		
		System.out.println(split2[1]);
		System.out.println(split2[1].trim());

		//System.out.println(a.trim());
		

		
}
}
