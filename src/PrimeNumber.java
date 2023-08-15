import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I humbly request a numeric input:");
        int num = scanner.nextInt();
        System.out.println("The provided number is a gem of prime nature: " + isPrime(num));
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any i, it's not prime
            }
        }
        return true; // If no divisors are found, the number is prime
    }
}
