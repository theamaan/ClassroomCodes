package arrayquestions;

import java.util.Arrays;

public class SumAverageHighestLowestNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Provided Array: " + Arrays.toString(num));

        int sumOfElements = sum(num);
        double averageOfElements = average(num);
        int highestElement = highestNumber(num);
        int lowestElement = lowestNumber(num);

        System.out.println("The Sum of the Array is: " + sumOfElements);
        System.out.println("The Average of the Array is: " + averageOfElements);
        System.out.println("The Highest Element in the Array is: " + highestElement);
        System.out.println("The Lowest Element in the Array is: " + lowestElement);
    }

    public static int sum(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static double average(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return (double) sum / num.length;
    }

    public static int highestNumber(int[] num) {
        int highestNumber = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > highestNumber) {
                highestNumber = num[i];
            }
        }
        return highestNumber;
    }

    public static int lowestNumber(int[] num) {
        int lowestNumber = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < lowestNumber) {
                lowestNumber = num[i];
            }
        }
        return lowestNumber;
    }
}
