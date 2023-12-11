package arrayquestions;

import java.util.Scanner;

// Input 5 numbers in num[] and print the reverse of them
public class FiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            num[i] = sc.nextInt();
        }

        System.out.println("The 5 numbers in reverse order is");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
