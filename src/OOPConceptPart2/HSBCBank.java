package OOPConceptPart2;

public class HSBCBank implements USBank,BrazilBank{ //we are achieving multiple inheritance
	// Is-a relationship

	// if a class is implementing any interface,then its mandatory to declare/override the methods of interface.
	
	//overridden methods from USBank
	public void credit() {
		System.out.println("HSBC credit");
		
	}
	
	public void debit() {
		System.out.println("HSBC debit");
	}
	
	public void transferMoney() {
		System.out.println("HSBC transfermoney");
	}
	
	// seperate methods
	public void educationLoan() {
		System.out.println("HSBC edu loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC Carloan");
	}
	
	//overridden method from brazilbank interface
	public void mutualFund() {
		System.out.println("HSBC mutualfund");
	}
}
