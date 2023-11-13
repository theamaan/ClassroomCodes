package codingbot;
//Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
//https://codingbat.com/prob/p126880
public class EndOther {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
    }
    public static boolean endOther(String a, String b) {
        String newA = a.toLowerCase();
        String newB = b.toLowerCase();

        if (newA.length() > newB.length()) {
            if (newB.equals(newA.substring(newA.length() - newB.length()))) {
                return true;
            }
        } else if (newA.length() < newB.length()) {
            if (newA.equals(newB.substring(newB.length() - newA.length()))) {
                return true;
            }
        } else if (newA.equals(newB)) {
            return true;
        }

        return false;
    }

}
