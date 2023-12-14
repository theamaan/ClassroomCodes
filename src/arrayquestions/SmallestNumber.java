package arrayquestions;

import java.util.Scanner;

/**
 * A class to find the smallest number in an array.
 */
public class SmallestNumber {

    /**
     * The main method for user interaction.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input phase: obtaining five numbers from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The Smallest Number in the Array is " + findSmallestNumber(numbers));
    }

    /**
     * Finds the smallest number in the given array.
     *
     * @param num The array of numbers.
     * @return The smallest number in the array.
     */
    public static int findSmallestNumber(int[] num) {
        int tempVar = num[0]; // Initialize with the first element

        // Iterating through the array to find the smallest number
        for (int i = 1; i < num.length; i++) {
            if (num[i] < tempVar) {
                tempVar = num[i];
            }
        }
        return tempVar;
    }
}
