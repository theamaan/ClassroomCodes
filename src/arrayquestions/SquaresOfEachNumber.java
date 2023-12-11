package arrayquestions;

import java.util.Scanner;

//Input 5 numbers and print square of each number
public class SquaresOfEachNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a Number");
            num[i] = sc.nextInt();
        }

        System.out.println("The Square of each number is ");
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]*num[i]);
        }
    }
}
