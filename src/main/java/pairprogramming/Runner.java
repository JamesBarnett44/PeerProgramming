package pairprogramming;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Hello World");

		factorial(120f);
		factorial(150f);
		factorial(3628800);
		factorial(479001600);
		factorial(6);
		factorial(18);
	}


	public static void factorial(float input) {
		int count = 1;
		while (input > 1) {
			count++;
			input /= count;
		}
		if (input == 1) {
			System.out.println(count + "!");
		} else {
			System.out.println("NONE");
		}
	}

}
