package OOPConceptPart1;

public class Encapsulation {

	private int SSN;
	private String empName;
	private int empAge;
	
	public static void main(String[] args) {
		 
		Encapsulation en = new Encapsulation();
		en.setEmpName("Tom Peter");
		en.setEmpAge(25);
		en.setSSN(12345);
		
		System.out.println("get the emp name:"+ en.getEmpName());
		System.out.println("get the emp age:"+ en.getEmpAge());
		System.out.println("get the SSN no:"+ en.getSSN());
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
