package fizz;

public class FizzBuzz {

	public static void fizzBuzz(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("fizzbuzz");
		} else if (num % 3 == 0) {
			System.out.println("fizz");
		} else if (num % 5 == 0) {
			System.out.println("buzz");
		} else {
			System.out.println(num);
		}

	}

}
