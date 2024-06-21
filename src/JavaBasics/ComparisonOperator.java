package JavaBasics;

public class ComparisonOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(a>b) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}

		//comparison operator : >,  <, <=, >=, ==
		
		// write a logic to find out highest number
		
		int a1=400;
		int b1=300;
		int c1=500;
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}
	}

}
