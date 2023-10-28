package stringintermediatelevelprograms;
// Input a String and print the count of words that starts with w
public class Question9 {
    public static void main(String[] args) {
        String orgWord = "World peace will not be brought by Mankind but WomanKind";
        String word = " "+orgWord;
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isWhitespace(ch)){
                char newChar = word.charAt(i+1);
                if(newChar == 'w'||newChar == 'W'){
                    count++;
                }
            }
        }
        System.out.print("The Count of the letter `W` is "+count);
    }
}
