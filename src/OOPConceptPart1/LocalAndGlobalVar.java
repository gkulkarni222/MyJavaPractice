package OOPConceptPart1;

public class LocalAndGlobalVar {

	//global variable
	int age = 20;
	String name="Selenium";
	
	
	public static void main(String[] args) {
		int i=10; //local variable for main method
		System.out.println(i);
		
		LocalAndGlobalVar obj=new LocalAndGlobalVar();
		System.out.println(obj.age);
		System.out.println(obj.name);
		

	}

	
	public void sum() {
		int i=15; //local var for sum method
		int j=20;
		
	}
}
