package stringintermediatelevelprograms;
// Input a String and print the count of the word/words that starts with a vowel
public class Question10 {
    public static void main(String[] args) {
        String orgWord = "it is not easy to find happiness in ourselves, and it is not possible to find it elsewhere";
        String newWord = " "+orgWord;
        int count = 0;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                char character = newWord.charAt(i+1);
                if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'){
                    count++;
                }
            }
        }
        System.out.println("The Count of the vowel is "+count);
    }
}
