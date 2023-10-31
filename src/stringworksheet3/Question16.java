package stringworksheet3;
//Input a String and print only those words that does not contain a vowel
public class Question16 {
    public static void main(String[] args) {
        String orgWord = "Why do you shy to play tune in rhythm?";
        String newWord = orgWord + " ";
        int d = -1;
        boolean flag = false;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if (Character.isWhitespace(ch)) {
                String word = newWord.substring(d + 1, i);
                boolean hasVowel = false;

                for (int j = 0; j < word.length(); j++) {
                    char character = word.charAt(j);
                    if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                            character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                        hasVowel = true;
                        break;
                    }
                }

                if (!hasVowel) {
                    System.out.print(word + " ");
                    flag = true;
                }
                d = i;
            }
        }
    }
}
