package OOPConceptPart1;

public class Car {

	int model;
	int wheel;
	
	public static void main(String[] args) {
		// Class is a entity where we have to define properties,methods and varibles
		//new car() - this is the object of car class.
		//new keyword is used to create the object.
		//a,b,c - object refrence variables
		
		Car a =new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.model=2015;
		a.wheel=4;
		
		b.model=2013;
		b.wheel=4;
		
		c.model=2012;
		c.wheel=4;
		
		//before changing the refrences.
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		a=b;
		b=c;
		c=a;
		
		//after changing the refrences.
		a.model=10;
		System.out.println(a.model);
		c.model=20;
		System.out.println(a.model);

	}

}
