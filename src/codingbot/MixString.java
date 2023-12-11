package codingbot;

//Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
//mixString("abc", "xyz") → "axbycz"
//mixString("Hi", "There") → "HTihere"
//mixString("xxxx", "There") → "xTxhxexre"
public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("2/", "27 around"));
    }

    public static String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char chA;
        char chB;
        for (int i = 0; i < a.length(); i++) {
            chA = a.charAt(i);
            sb.append(chA);

            if (i < b.length()) {
                chB = b.charAt(i);
                sb.append(chB);
            }
        }
        if (b.length() > a.length()) {
            sb.append(b.substring(a.length()));
        }
        return sb.toString();
    }

}
