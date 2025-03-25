
public class programconstructorOverloading {
	
	
	int age;
	String name;
	
	//Default constructor
	public programconstructorOverloading()
	{
		this.age=50;
		System.out.println("I'm default constructor" +"  "+age);
	}
	//parameterized constructor
	
	public programconstructorOverloading(int age,String name)
	{
		
		this.age=age;
		this.name=name;
		
		//this.name=name;
		System.out.println("I'm parameterized constructor"  +"  "+age);
		System.out.println("I'm parameterized constructor"  +"  "+name);

	}
	
	public static void main(String[] args) {

		//to comment block of code use the shortcut ctrl+shift+/
		//programconstructorOverloading obj=new programconstructorOverloading();
		programconstructorOverloading obj1=new programconstructorOverloading(30,"Nashrin");
System.out.println(obj1.name);
		//obj.display();
	}

}
