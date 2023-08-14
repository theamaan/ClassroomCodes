import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        int product=num1*num2;
        int h=0;
        for (int i = 1; i <=product; i++) {
            if((num1%i==0)&&(num2%i==0)){
                h=i;
            }
        }
        int l = (int)product/h;
        System.out.println("The HCF is "+h);
        System.out.println("The LCM is "+l);
    }
}
