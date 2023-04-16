package Methods;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int num) {

		if (num <= 1)
			return false;
		for (int i = 2; i < (num / 2 + 1); i++)
			if (num % i == 0) {
				System.out.println("Number " + num + " is not a prime number becuase it is deivisble by " + i);
				return false;
			}

		return true;

	}

	public static void main(String[] args) {
		System.out.println("Enter an integer");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		System.out.println(String.format("%s is a prime number: %s", number, isPrime(number)));

	}
}
