package stringintermediatelevelprograms;
// Input a String and print the count of word that start with k
public class Question8 {
    public static void main(String[] args) {
        String orgWord = "He knoweth God, who knoweth himself";
        String newWord = " "+orgWord;
        int count=0;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                char character = newWord.charAt(i+1);
                if(character == 'k'||character == 'K'){
                    count++;
                }
            }
        }
        System.out.print("The Count of the letter `k` is "+count);
    }
}
