package OOPConceptPart1;

public class StaticAndNonStatic {

	//global variables-- scope of global var is it can be used anywhere in the class.
			String name="Tom";
			static int age=25;
			
	public static void main(String[] args) {
		
		//How to call static methods and variables ?
		//1 . By direct calling
		sum();

		//2. Calling by classname
		StaticAndNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		// how to call non static methods and variables ? By creating object
		StaticAndNonStatic obj=new StaticAndNonStatic();
		
		System.out.println(obj.name);
		obj.Sendmail();
		
		//can I access static method using object refrence? yes 
		obj.sum();
		//but it will show you a warning that it should be accessed in a static way.
		
		
	}
	
	public void Sendmail() { // non static method
		System.out.println("Mail has been sent");
	}
	
	public static void sum() { //static method
		System.out.println("Sum method");
	}

}
