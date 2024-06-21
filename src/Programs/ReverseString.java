package Programs;

import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {

		// method 1
		String s = "12345";
		int len = s.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		// method 2
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());

	}

}
