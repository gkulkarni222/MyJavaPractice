package OOPConceptPart2;

public interface USBank {

	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body - only method prototype
	// In interface, we can declare the variables,var are by default static in nature.
	// var value will not be changed
	//no static method in interface
	//no main method in interface
	//we can not create the object of interface
	//Interface is abstract in nature.
}
