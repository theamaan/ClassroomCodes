
public class Perfect {
    public static void main(String[] args) {

        System.out.println("Checking for perfect numbers in the range 1 to 15000:");
        for (int num = 1; num <= 15000; num++) {
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
