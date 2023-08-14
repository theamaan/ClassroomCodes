import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) { //note that we have to take < symbol only because that's what a perfect number is
            if ((num % i) == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("The number is a perfect number");
        }
        else {
            System.out.println("The number is not perfect number");
        }
    }
}
