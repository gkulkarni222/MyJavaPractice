package OOPConceptPart2;

public class BMW extends Car{
	
	//When same method is present in parent class as well as child class with same name and same no of attributes.
	//is called method overriding
	public void start() {//overridden method
		System.out.println("BMW start");
	}
	
	public void theftsafety() {
		System.out.println("car theftsafety");
	}

}
