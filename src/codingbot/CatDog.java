package codingbot;
//https://codingbat.com/prob/p111624
public class CatDog {
    public static void main(String[] args) {
        // Test cases
        System.out.println(catDog("catdog")); // Expected output: true
        System.out.println(catDog("catcat")); // Expected output: false
        System.out.println(catDog("1cat1cadodog")); // Expected output: true
    }

    /**
     * Checks if the strings "cat" and "dog" appear the same number of times in the given string.
     *
     * @param str The input string to be checked.
     * @return True if "cat" and "dog" occur the same number of times, false otherwise.
     */
    public static boolean catDog(String str) {
        int catCount = 0, dogCount = 0;

        // Count occurrences of "cat"
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
        }

        // Count occurrences of "dog"
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }

        // Return true if occurrences of "cat" and "dog" are the same
        return catCount == dogCount;
    }
}
