package arrayquestions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program prompts the user to input an array of numbers and prints the largest among them.
 */
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input phase: obtaining five numbers from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scanner.nextInt();
        }

        // Finding the maximum number using a loop
        int maximumNumber = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > maximumNumber) {
                maximumNumber = numbers[i];
            }
        }

        // Output the maximum number
        System.out.println("The maximum number is " + maximumNumber);

        // Using the 'largest' method to find and print the largest number in the array
        largest(numbers);
    }

    /**
     * This method sorts the array and prints the largest element, which is the last element after sorting.
     */
    public static void largest(int[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }
}
