package stringworksheet3;
//Input a String and print only those words which end with vowel
public class Question11 {
    public static void main(String[] args) {
        String orgWord = "Do not approve for another you do not like for yourself";
        String newWord = orgWord + " ";
        int d = -1;

        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if (Character.isWhitespace(ch)) {
                String word = newWord.substring(d + 1, i);
                if (word.charAt(word.length() - 1) == 'a' || word.charAt(word.length() - 1) == 'i' || word.charAt(word.length() - 1) == 'e' || word.charAt(word.length() - 1) == 'o' || word.charAt(word.length() - 1) == 'u') {
                    System.out.println(word);
                }
                d = i;
            }
        }
    }
}
