package OOPConceptPart1;

public class WrapperClass {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		
		//convert string to int
		int i= Integer.parseInt(x);
		System.out.println(i+20);
		
		//string to double
		
		String s="12.55";
		double d=Double.parseDouble(s);
		System.out.println(d+10);
		
		//string to boolean
		String s1="true";
		boolean b= Boolean.parseBoolean(s1);
		System.out.println(b);
		
		//int to string
		int j=200;
		System.out.println(j+20);
		
		String s2= String.valueOf(i);
		System.out.println(s2+20);
		
		
		String u="100A";
		Integer.parseInt(u);//number format exception : For input string: "100A"
				
		

	}

}
