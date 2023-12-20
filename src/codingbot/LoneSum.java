package codingbot;

public class LoneSum {
    public static void main(String[] args) {
        LoneSum loneSumInstance = new LoneSum(); //The reason for creating an instance of the LoneSum class (i.e., LoneSum loneSumInstance = new LoneSum();) is because the loneSum method is not static. In Java, non-static methods can only be called by an instance of the class they belong to. If you tried to call loneSum(1,2,3); directly in the main method without creating an instance of the LoneSum class, you would get a compile error. If you want to call the method without creating an object, you would need to declare the method as static.

        // Test cases
        System.out.println(loneSumInstance.loneSum(1, 2, 3)); // Expected output: 6
        System.out.println(loneSumInstance.loneSum(3, 2, 3)); // Expected output: 2
        System.out.println(loneSumInstance.loneSum(3, 3, 3)); // Expected output: 0
        System.out.println(loneSumInstance.loneSum(9, 2, 2)); // Expected output: 9
        System.out.println(loneSumInstance.loneSum(2, 2, 9)); // Expected output: 9
        System.out.println(loneSumInstance.loneSum(2, 9, 2)); // Expected output: 9
        System.out.println(loneSumInstance.loneSum(2, 9, 3)); // Expected output: 14

    }

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else if (a == c) {
            return b;
        } else {
            return a + b + c;
        }
    }

}
