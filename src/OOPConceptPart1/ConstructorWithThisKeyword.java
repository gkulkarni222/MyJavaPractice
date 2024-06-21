package OOPConceptPart1;

public class ConstructorWithThisKeyword {

	//class variables /global variables
	String name;
	int age;
	
	String name1;
	int age1;
	
	// Here the tom is passed to name in constructor and 30 is passed to age in constructor
	// but i want to assign and initialize class varibales then i have to use THIS keyword.
	
	public ConstructorWithThisKeyword(String name,int age) {
		
		this.name=name;
		this.age=age;
		
	//	or use different name in class variables then no need to use this keyword.
		 age1=age;
		 name1=name;
		
		
		
		System.out.println("My name is "+name);
		System.out.println("my age is "+age);
		
		
		
		
	}
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj=new ConstructorWithThisKeyword("Tom",30);

	}

}
