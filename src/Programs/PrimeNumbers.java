package Programs;

public class PrimeNumbers {

	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumber(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + "");
			}
		}
	}

	public static void main(String[] args) {

		System.out.println(isPrimeNumber(2));
		System.out.println(" 3 is a prime number : " + isPrimeNumber(3));
		System.out.println(" 4 is a prime number : " + isPrimeNumber(4));
		System.out.println(" 5 is a prime number : " + isPrimeNumber(5));
		getPrimeNumber(33);
	}

}
