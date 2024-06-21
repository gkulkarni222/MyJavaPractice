package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank a = new HSBCBank();
		a.credit();
		a.debit();
		a.transferMoney();
		a.educationLoan();
		a.carLoan();
		
		//dynamic polymorphism
		//child class object can be referred by parent interface renfrence variable
		USBank b = new HSBCBank(); 
		b.credit();
		b.debit();
		b.transferMoney();
	

	}

}
