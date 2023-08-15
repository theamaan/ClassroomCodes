import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly provide a numeric input:");
        int number = scanner.nextInt();
        if (number == reverseNumber(number)) {
            System.out.println("The provided number exhibits palindrome property.");
        } else {
            System.out.println("The provided number does not exhibit palindrome property.");
        }
    }

    private static int reverseNumber(int input) {
        // int originalNumber = input; (Not Needed because we are not checking it here)
        int reversed = 0;
        while (input != 0) {
            int digit = input % 10;
            reversed = (reversed * 10) + digit;
            input = input / 10;
        }
        return reversed;
    }
}
