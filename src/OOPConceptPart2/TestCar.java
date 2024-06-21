package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism --- compile time polymorphism
		BMW B=new BMW();
		B.start();
		B.stop();
		B.refuel();
		B.theftsafety();
		B.engine();
		
	System.out.println("***************");
	
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println("******************");
		//up-casting
		//dynamic polymorphisim - run time polymorphism
		Car c1=new BMW(); // child class object is refrened by parent class refrence var Here overridden method is called.
		c1.start();
		c1.stop();
		c1.refuel();
		
		System.out.println("********");
		//down casting
		BMW b1=(BMW)new Car(); // we can't do direct upcasting. First caste it.
		//exception- ClassCastException
		
		
		
	
		

	}

}
