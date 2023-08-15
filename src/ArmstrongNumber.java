import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly provide a numeric input:");
        int number = scanner.nextInt();
        if (number == armstrong(number)) {
            System.out.println("The provided number exemplifies the distinguished Armstrong property.");
        } else {
            System.out.println("The provided number does not manifest the venerable Armstrong property.");
        }
    }
    private static int armstrong(int input){
        int sumOfCubes = 0;
        int numberOfDigits = String.valueOf(input).length(); // String.valueOf(input)=>Returns the string representation of int input. and dotlength gives the length of the total number.

        while (input != 0) {
            int digit = input % 10;
            sumOfCubes += (int) Math.pow(digit, numberOfDigits);
            input = input / 10;
        }
        return sumOfCubes;
    }
}
