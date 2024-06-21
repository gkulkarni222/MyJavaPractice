package OOPConceptPart1;

public class FunctionInJava {

	public static void main(String[] args) {
		FunctionInJava obj=new FunctionInJava();
		// one object will be created. obj is the refrence variable , refrering to this object.
		// after creating the object, all the non static methods will be given to this object.
		
		// Main method is void because we never write return statement inside main method. main method doesnt return anything.
		obj.test();
		
		int c1=obj.pqr();
		System.out.println(c1);
		
		String s1=obj.qa();
		System.out.println(s1);
		
		int d1=obj.div(50, 5);
		System.out.println(d1);
		

	}
	
	//not static methods
	//void --> can not return anything
	//return type---void
	
	//no input,no output
	public void test() {
		System.out.println("test method");
	}
	
	//no input,some output
	//return type--int
	public int pqr() {
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	//no input,some output
	//return type -- string
	public String qa() {
		System.out.println("qa method");
		String s="Selenium";
		return s;
	}
	
	//some input,some output
	//return type --int
	//x ,y -- input parameter/arguents
	public int div(int x,int y) {
		System.out.println("division method");
		int d =x/y;
		return d;
	}

}
