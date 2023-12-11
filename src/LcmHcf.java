import java.util.Scanner;

public class LcmHcf {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number");
    int num2 = sc.nextInt();

    int product = num1 * num2;
    int hcf = calculateHCF(num1, num2);
    int lcm = product / hcf;

    System.out.println("The HCF is " + hcf);
    System.out.println("The LCM is " + lcm);
}

    private static int calculateHCF(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
//the values of 1785 and 546.