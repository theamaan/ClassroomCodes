import java.util.Scanner;

public class SumofFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int sum=0;
        for (int i = 1; i <= num; i++) {
            if((num%i)==0){
                sum=sum+i;
            }
        }
        System.out.println("The sum of factors is "+sum);
    }
}
