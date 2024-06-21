package JavaBasics;

public class Loops {

	public static void main(String[] args) {
		
		
		//1. While loop
		//disadvantage of while loop: It will execute the code infinite times if we don't give increment/decrement statement.
		//print 1 to 10
		
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
				}
		
		System.out.println("****************");
		
		//2. For loop
		for(int j=10;j>=-10;j--) {
			System.out.println(j);
		}

	}

}
