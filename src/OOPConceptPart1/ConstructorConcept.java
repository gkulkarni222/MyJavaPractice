package OOPConceptPart1;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("This is default constructor with no parameter");
	}

	public ConstructorConcept(int i) {
		System.out.println("The value of i is" + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("The value of i is" + i);
		System.out.println("The value of j is" + j);
	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);

	}

}
