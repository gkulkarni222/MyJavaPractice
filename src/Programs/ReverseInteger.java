package Programs;

public class ReverseInteger {

	public static void main(String[] args) {
		long num=123986376;
		long rev=0;
		
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("reverse number is:: " + rev);
	}

}
