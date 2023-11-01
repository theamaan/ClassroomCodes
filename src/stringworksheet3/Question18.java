package stringworksheet3;
// Input a String and print only those words that contain only vowels
public class Question18 {
    public static void main(String[] args) {
        String orgWord = "A friend is a present that you give to yourself.  aaaaa";
        String newWord = orgWord + " ";
        int d = -1;

        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if (Character.isWhitespace(ch)) {
                String word = newWord.substring(d + 1, i);
//The logic below will print words with vowels, but the advantage is that the words will be printed even they have more than one character.
                boolean flag = true;
                for (int j = 0; j < word.length(); j++) {
                    char character = word.charAt(j);
                    if(!isVowel(character)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.print(word+" ");
                }
                d = i;

//The logic below will print words with vowels, but the drawback is that the words are expected to have only one character.
//                if(word.length()==1){
//                    char character = (word.charAt(0));
//                    if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
//                            System.out.print(word + " ");
//                    }
//                }
//                d = i;
            }
        }
    }

    public static boolean isVowel(char ch){
        char lowerCaseChar = Character.toLowerCase(ch);
        if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
            return true;
        }
        return false;
    }
}


