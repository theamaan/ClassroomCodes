package stringintermediatelevelprograms;
// Input a string and print the count of words that ends with 's'
public class Question12 {
    public static void main(String[] args) {
        String orgWord = "happiness is the foundation of all human virtues";
        String newWord = orgWord+" ";
        int count=0;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                char character = newWord.charAt(i-1);
                if(character=='s'){
                    count++;
                }
            }
        }
        System.out.println("The count of the letter s is "+count);
    }
}
