package codingbot;
//Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
//https://codingbat.com/prob/p109637
public class RepeatSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
    }
    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder sb = new StringBuilder();
        while (count>0){
            sb.append(word);
            if(count == 1){
                break;
            }
            count--;
            sb.append(sep);
        }
        return sb.toString();
    }

}
