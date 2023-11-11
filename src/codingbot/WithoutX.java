package codingbot;

public class WithoutX {
    public static void main(String[] args) {
        String result1 = withoutX("xHix");
        String result2 = withoutX("xHi");
        String result3 = withoutX("Hxix");

        System.out.println("Result 1: " + result1); // "Hi"
        System.out.println("Result 2: " + result2); // "Hi"
        System.out.println("Result 3: " + result3); // "Hxi"
    }
    public static String withoutX(String str) {
        // Check if the string is not empty and the first character is 'x'
        if (!str.isEmpty() && str.charAt(0) == 'x') {
            str = str.substring(1); // Remove the first 'x'
        }

        // Check if the string is not empty and the last character is 'x'
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1); // Remove the last 'x'
        }

        return str;
    }

}
