import java.util.Scanner;

public class PerfectRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number till you want to check");
        int number=sc.nextInt();
        System.out.println("Checking for perfect numbers in the range 1 to user-specified number:");

        for (int num = 1; num <= number; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if ((num % i) == 0) {
                    sum = sum + i;
                }
            }
            if (sum == num) {
                System.out.println(num + " is a perfect number");
            }
        }
    }
}
