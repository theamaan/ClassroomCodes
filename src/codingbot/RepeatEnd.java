package codingbot;
// Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
// https://codingbat.com/prob/p152339
public class RepeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }
    public static String repeatEnd(String str, int n) {

        String newWord = str.substring(str.length()-n);
        StringBuilder sb = new StringBuilder(newWord);
        while(n>1){
            sb.append(newWord);
            n--;
        }
        return sb.toString();
    }

}
