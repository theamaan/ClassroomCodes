package stringintermediatelevelprograms;
// Input a String and print the count of words that ends with t
public class Question13 {
    public static void main(String[] args) {
        String orgWord = "The highest result of education is tolerance";
        String newWord = orgWord + " ";
        int count=0;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                char character = newWord.charAt(i-1);
                if(character=='t'){
                    count++;
                }
            }
        }
        System.out.print("The the count of words that ends with t is "+count);
    }
}
