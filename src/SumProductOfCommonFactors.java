import java.util.Scanner;

public class SumProductOfCommonFactors {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1=sc.nextInt();
    System.out.println("Enter the second number");
    int num2=sc.nextInt();
    int product=num1*num2;
    int count=0;
    int sum=0;
    int productOfCommonFactors=1;
    for (int i = 1; i <= product ; i++) {
        if((num1%i==0)&&(num2%i==0)){
            sum=sum+i;
            count++;
            productOfCommonFactors=productOfCommonFactors*i;
        }
    }
    System.out.println("The sum of common factor is "+sum);
    System.out.println("The count of common factor is "+count);
    System.out.println("The product of common factor is "+productOfCommonFactors);
}
}
