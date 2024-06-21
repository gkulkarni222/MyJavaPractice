package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum("Automation by Gayatri");
		obj.sum(10,12.5);
		
	}
	
	public static void main(int j) {
		System.out.println("main method overloaded");
	}
	// Main method can also be overloaded.
	//Method overloading - the methods having same name but different type of parameters and different no of parameters within the same class. 
	//we can not create a method inside method
	public void sum() {
		System.out.println("Sum method -- 0 input parameter");
	}

	public void sum(int i) {
		System.out.println("sum method -- 1 input param");
		System.out.println(i);
	}
	
	public void sum(String s) {
		System.out.println("sum method --1 input param");
		System.out.println(s);
	}
	
	public void sum(int k,double m) {
		System.out.println("sum method--2 input param");
		System.out.println(k+m);
	}
	
	
	
	
	
}
