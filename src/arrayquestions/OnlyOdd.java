package arrayquestions;

import java.util.Scanner;

//Print only the odd numbers of the array
public class OnlyOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a Number");
            num[i] = sc.nextInt();
        }
        System.out.println("The Odd numbers are");
        for (int i = 0; i < 5; i++) {
            if (num[i] % 2 != 0) {
                System.out.println(num[i]);
            }
        }
    }
}
