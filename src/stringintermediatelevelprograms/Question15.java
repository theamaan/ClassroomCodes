package stringintermediatelevelprograms;
//Input a string and print the count of words that ends with consonant
public class Question15 {
    public static void main(String[] args) {
        String orgWord = "The great hope of society is individual character";
        String newWord = orgWord + " ";
        int count=0;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                char character = newWord.charAt(i-1);
                if( character != 'a' && character != 'o' && character != 'e' && character != 'i' && character != 'u'){
                    count++;
                }
            }
        }
        System.out.println("The count of words that ends with consonant "+count);
    }
}
