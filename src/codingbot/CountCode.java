package codingbot;
//Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
//countCode("aaacodebbb") → 1
//countCode("codexxcode") → 2
//countCode("cozexxcope") → 2

public class CountCode {
    public static void main(String[] args) {
        CountCode codeCounter = new CountCode();

        // Test cases
        System.out.println(codeCounter.countCode("aaacodebbb")); // Expected output: 1
        System.out.println(codeCounter.countCode("codexxcode")); // Expected output: 2
        System.out.println(codeCounter.countCode("cozexxcope")); // Expected output: 2
    }

    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            String word = str.substring(i, i + 4);
            if (word.startsWith("co") && word.charAt(3) == 'e') {
                count++;
            }
        }

        return count;
    }
}
