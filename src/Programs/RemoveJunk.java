package Programs;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="2734 @#$$##@@@@@ Java";
		s= s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s);

	}

}
