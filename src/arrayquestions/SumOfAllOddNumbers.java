package arrayquestions;

import java.util.Scanner;

//Print the sum of all the odd numbers present in num[5]
public class SumOfAllOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a Number");
            num[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.println("The sum of numbers are");
        for (int i = 0; i < 5; i++) {
            if (num[i] % 2 != 0) {
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
}
